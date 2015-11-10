package esmj3dfo3.j3d.cell;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.zip.DataFormatException;

import javax.media.j3d.BranchGroup;

import utils.ESMUtils;
import utils.source.MediaSources;
import esmj3d.j3d.cell.J3dICellFactory;
import esmj3dfo3.data.records.CELL;
import esmj3dfo3.data.records.WRLD;
import esmmanager.common.PluginException;
import esmmanager.common.data.plugin.PluginGroup;
import esmmanager.common.data.plugin.PluginRecord;
import esmmanager.common.data.record.Record;
import esmmanager.loader.CELLPointer;
import esmmanager.loader.ESMManager;
import esmmanager.loader.IESMManager;
import esmmanager.loader.InteriorCELLTopGroup;
import esmmanager.loader.WRLDChildren;
import esmmanager.loader.WRLDTopGroup;

/**
 * This is also a record store as this is point at which we preload perssistenet and all cells, ready for use (or re-use)
 * @author phil
 *
 */
public class J3dCellFactory extends J3dICellFactory
{
	private HashMap<Integer, WRLD> wrldByFormId = new HashMap<Integer, WRLD>();

	private HashMap<Integer, CELL> cellByFormId = new HashMap<Integer, CELL>();

	public J3dCellFactory()
	{

	}

	public void setSources(IESMManager esmManager2, MediaSources mediaSources)
	{
		this.esmManager = esmManager2;
		this.mediaSources = mediaSources;

		//Carefully laod on a seperate thread, might cause trouble
		Thread t = new Thread()
		{
			public void run()
			{

				long start = System.currentTimeMillis();

				//let's load all WRLD, CELL amd their persistent children now!
				//I need to pre load ALL persistent children for all CELLS and keep them
				List<WRLDTopGroup> WRLDTopGroups = ((ESMManager) esmManager).getWRLDTopGroups();
				for (WRLDTopGroup WRLDTopGroup : WRLDTopGroups)
				{
					for (PluginRecord wrldPR : WRLDTopGroup.WRLDByFormId.values())
					{
						WRLD wrld = getWRLD(wrldPR.getFormID());
						wrldByFormId.put(wrldPR.getFormID(), wrld);

						WRLDChildren children = esmManager.getWRLDChildren(wrldPR.getFormID());
						PluginGroup cellChildGroups = children.getCellChildren();
						cachePersistentChildren(cellChildGroups, wrldPR.getFormID());
					}
				}

				List<InteriorCELLTopGroup> interiorCELLTopGroups = ((ESMManager) esmManager).getInteriorCELLTopGroups();
				for (InteriorCELLTopGroup interiorCELLTopGroup : interiorCELLTopGroups)
				{
					for (CELLPointer cp : interiorCELLTopGroup.interiorCELLByFormId.values())
					{
						try
						{
							PluginRecord cellPR = esmManager.getInteriorCELL(cp.formId);
							CELL cell = new CELL(new Record(cellPR));
							cellByFormId.put(cellPR.getFormID(), cell);

							PluginGroup cellChildGroups = esmManager.getInteriorCELLChildren(cellPR.getFormID());
							cachePersistentChildren(cellChildGroups, cellPR.getFormID());

						}
						catch (DataFormatException e)
						{
							e.printStackTrace();
						}
						catch (IOException e)
						{
							e.printStackTrace();
						}
						catch (PluginException e)
						{
							e.printStackTrace();
						}
					}
				}

				System.out.println("Persistent Records loaded in " + (System.currentTimeMillis() - start) //
						+ " WRLD count = " + wrldByFormId.size()//
						+ " CELL count = " + cellByFormId.size()//
						+ " record count = " + persistentChildrenByFormId.size());
			}
		};
		t.start();

	}

	@Override
	public String getLODWorldName(int worldFormId)
	{
		String lodWorldName = "";
		WRLD wrld = getWRLD(worldFormId);
		// use parent first
		if (wrld.WNAM != null && wrld.WNAM.formId != -1)
		{
			WRLD parentWrld = getWRLD(wrld.WNAM.formId);
			lodWorldName = parentWrld.EDID.str;
		}
		else
		{
			lodWorldName = wrld.EDID.str;
		}
		return lodWorldName;
	}

	@Override
	public BranchGroup makeLODLandscape(int lodX, int lodY, int scale, String lodWorldName)
	{
		return new Fo3LODLandscape(lodX, lodY, scale, lodWorldName, mediaSources.getMeshSource(), mediaSources.getTextureSource());
	}

	private WRLD getWRLD(int formId)
	{
		try
		{
			PluginRecord record = esmManager.getWRLD(formId);
			WRLD wrld = new WRLD(new Record(record));
			return wrld;
		}
		catch (DataFormatException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch (PluginException e)
		{
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean isWRLD(int formId)
	{
		return getWRLD(formId) != null;
	}

	@Override
	public J3dCELLPersistent makeBGWRLDPersistent(int formId, boolean makePhys)
	{
		WRLD wrld = getWRLD(formId);
		if (wrld != null)
		{

			WRLDChildren children = esmManager.getWRLDChildren(formId);

			PluginRecord cell = children.getCell();
			if (cell != null)
			{
				PluginGroup cellChildren = children.getCellChildren();
				if (cellChildren != null)
				{
					return new J3dCELLPersistent(wrld, this, new Record(cell), ESMUtils.getChildren(cellChildren,
							PluginGroup.CELL_PERSISTENT), makePhys, mediaSources);
				}
			}
		}
		else
		{
			System.out.println("makeBGWRLDPersistent bad formId not wrld " + formId);
		}
		return null;
	}

	@Override
	public J3dCELLTemporary makeBGWRLDTemporary(int wrldFormId, int x, int y, boolean makePhys)
	{
		int cellId = esmManager.getWRLDExtBlockCELLId(wrldFormId, x, y);
		return makeBGWRLDTemporary(cellId, makePhys);
	}

	@Override
	public J3dCELLTemporary makeBGWRLDTemporary(int cellId, boolean makePhys)
	{
		if (cellId == -1)
			return null;

		try
		{

			PluginRecord record = esmManager.getWRLDExtBlockCELL(cellId);

			if (record != null)
			{
				PluginGroup cellChildren = esmManager.getWRLDExtBlockCELLChildren(record.getFormID());

				if (cellChildren != null)
				{
					return new J3dCELLTemporary(this, new Record(record), ESMUtils.getChildren(cellChildren, PluginGroup.CELL_TEMPORARY),
							makePhys, mediaSources);
				}
			}

		}
		catch (PluginException e1)
		{
			e1.printStackTrace();
		}
		catch (DataFormatException e1)
		{
			e1.printStackTrace();
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}

		return null;
	}

	/**
	 * DISTANT only exists in Oblivion, not used in Fo3 or Skyrim!!
	 * @see esmj3d.j3d.cell.J3dICellFactory#makeBGWRLDDistant(int, boolean)
	 */
	@Override
	public J3dCELLDistant makeBGWRLDDistant(int wrldFormId, int x, int y, boolean makePhys)
	{
		int cellId = esmManager.getWRLDExtBlockCELLId(wrldFormId, x, y);
		return makeBGWRLDDistant(cellId, makePhys);
	}

	/**
	 * DISTANT only exists in Oblivion, not used in Fo3 or Skyrim!!
	 * @see esmj3d.j3d.cell.J3dICellFactory#makeBGWRLDDistant(int, boolean)
	 */
	@Override
	public J3dCELLDistant makeBGWRLDDistant(int cellId, boolean makePhys)
	{
		if (cellId == -1)
			return null;

		try
		{

			PluginRecord record = esmManager.getWRLDExtBlockCELL(cellId);
			if (record != null)
			{
				PluginGroup cellChildren = esmManager.getWRLDExtBlockCELLChildren(record.getFormID());
				if (cellChildren != null)
				{
					//note stats only not distant
					return new J3dCELLDistant(this, new Record(record), ESMUtils.getChildren(cellChildren, PluginGroup.CELL_TEMPORARY),
							makePhys, mediaSources);
				}
			}
		}
		catch (PluginException e1)
		{
			e1.printStackTrace();
		}
		catch (DataFormatException e1)
		{
			e1.printStackTrace();
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}
		return null;
	}

	@Override
	public J3dCELLPersistent makeBGInteriorCELLPersistent(int cellId, boolean makePhys)
	{
		try
		{
			PluginRecord record = esmManager.getInteriorCELL(cellId);

			if (record != null)
			{
				PluginGroup cellChildren = esmManager.getInteriorCELLChildren(cellId);

				return new J3dCELLPersistent(null, this, new Record(record),
						ESMUtils.getChildren(cellChildren, PluginGroup.CELL_PERSISTENT), makePhys, mediaSources);
			}
		}
		catch (PluginException e1)
		{
			e1.printStackTrace();
		}
		catch (DataFormatException e1)
		{
			e1.printStackTrace();
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}
		return null;
	}

	@Override
	public J3dCELLTemporary makeBGInteriorCELLTemporary(int cellId, boolean makePhys)
	{

		try
		{
			PluginRecord record = esmManager.getInteriorCELL(cellId);

			if (record != null)
			{
				PluginGroup cellChildren = esmManager.getInteriorCELLChildren(cellId);

				return new J3dCELLTemporary(this, new Record(record), ESMUtils.getChildren(cellChildren, PluginGroup.CELL_TEMPORARY),
						makePhys, mediaSources);
			}
		}
		catch (PluginException e1)
		{
			e1.printStackTrace();
		}
		catch (DataFormatException e1)
		{
			e1.printStackTrace();
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}
		return null;
	}

	@Override
	public J3dCELLDistant makeBGInteriorCELLDistant(int cellId, boolean makePhys)
	{

		try
		{
			PluginRecord record = esmManager.getInteriorCELL(cellId);

			if (record != null)
			{
				PluginGroup cellChildren = esmManager.getInteriorCELLChildren(cellId);

				return new J3dCELLDistant(this, new Record(record), ESMUtils.getChildren(cellChildren, PluginGroup.CELL_TEMPORARY),
						makePhys, mediaSources);
			}
		}
		catch (PluginException e1)
		{
			e1.printStackTrace();
		}
		catch (DataFormatException e1)
		{
			e1.printStackTrace();
		}
		catch (IOException e1)
		{
			e1.printStackTrace();
		}
		return null;
	}

	@Override
	public String getMainESMFileName()
	{
		return esmManager.getName();
	}
}
