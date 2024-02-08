package esmj3dfo3.j3d.cell;

import java.util.ArrayList;
import java.util.List;

import org.jogamp.java3d.Node;
import org.jogamp.vecmath.Quat4f;

import esfilemanager.common.data.record.IRecordStore;
import esfilemanager.common.data.record.Record;
import esmj3d.data.shared.records.InstRECO;
import esmj3d.data.shared.records.LAND;
import esmj3d.data.shared.records.RECO;
import esmj3d.j3d.BethRenderSettings;
import esmj3d.j3d.BethRenderSettings.UpdateListener;
import esmj3d.j3d.cell.J3dCELLGeneral;
import esmj3d.j3d.j3drecords.inst.J3dLAND;
import esmj3d.j3d.j3drecords.inst.J3dRECOInst;
import esmj3dfo3.data.records.ACHR;
import esmj3dfo3.data.records.ACRE;
import esmj3dfo3.data.records.CELL;
import esmj3dfo3.data.records.REFR;
import esmj3dfo3.j3d.j3drecords.inst.J3dACHR;
import esmj3dfo3.j3d.j3drecords.inst.J3dACRE;
import esmj3dfo3.j3d.j3drecords.inst.J3dREFRFactory;
import utils.source.MediaSources;

public class J3dCELL extends J3dCELLGeneral implements UpdateListener
{
	protected CELL cell;

	private ArrayList<J3dRECOInst> j3dRECOInsts = new ArrayList<J3dRECOInst>();
	
	protected J3dLAND j3dLAND;

	

	public J3dCELL(IRecordStore master, Record cellRecord, int worldId, List<Record> children, boolean makePhys, MediaSources mediaSources)
	{
		super(master, worldId, children, makePhys, mediaSources);
		cell = new CELL(cellRecord);
		setCell(cell);

		BethRenderSettings.addUpdateListener(this);
	}

	@Override
	public void renderSettingsUpdated()
	{
		if (!makePhys)
		{
			for (J3dRECOInst j3dRECOInst : j3dRECOInsts)
			{
				j3dRECOInst.renderSettingsUpdated();
			}
		}
	}

	protected void addJ3dRECOInst(J3dRECOInst j3dRECOInst)
	{
		if (j3dRECOInst != null)
		{
			addChild((Node) j3dRECOInst);
			j3dRECOInsts.add(j3dRECOInst);
		}
	}

	@Override
	public Node makeJ3dRECOFar(Record record)
	{
		Node ret = null;
		try
		{
			if (record.getRecordType().equals("REFR"))
			{
				ret = J3dREFRFactory.makeJ3DReferFar(new REFR(record), master, mediaSources);
			}
			else
			{
				System.err.println("Far record not REFR " + record.getRecordType());
			}
		}
		catch (NullPointerException e)
		{
			if (e.getStackTrace().length > 0)
				System.out.println("J3dCELL.makeJ3dRECOFar " + cell.formId + " - null pointer making record " + record + " " + record.getRecordType()
						+ " in " + e.getStackTrace()[0]);
			else
				System.out.println("J3dCELL.makeJ3dRECOFar " + cell.formId + " - null pointer making record " + record + " " + record.getRecordType());

			if (record.getRecordType().equals("REFR"))
			{
				REFR refr = new REFR(record);
				Record baseRecord = master.getRecord(refr.NAME.formId);
				System.out.println("And it's a REFR with base of " + baseRecord.getRecordType());
			}
		}

		return ret;
	}

	@Override
	public J3dRECOInst makeJ3dRECO(Record record)
	{
		//does it start disabled? ignore if so
		//TODO: what is the disable flag?
		if ((record.getRecordFlags1() & 0x800) != 0)
		{
			return null;
		}

		J3dRECOInst ret = null;
		try
		{
			if (record.getRecordType().equals("REFR"))
			{
				ret = J3dREFRFactory.makeJ3DRefer(new REFR(record), makePhys, master, mediaSources);
			}
			else if (record.getRecordType().equals("ACRE"))
			{
				if (!makePhys)
				{
					ACRE acre = new ACRE(record);
					// does a parent enablage flag exists, and is is defaulted to off?
					if (acre.xesp != null && InstRECO.getParentEnable(acre, master) != BethRenderSettings.isFlipParentEnableDefault())
						return null;
					ret = new J3dACRE(acre, master, mediaSources);
				}
			}
			else if (record.getRecordType().equals("ACHR"))
			{
				if (!makePhys)
				{
					ACHR achr = new ACHR(record);
					// does a parent enablage flag exists, and is is defaulted to off?
					if (achr.xesp != null && InstRECO.getParentEnable(achr, master) != BethRenderSettings.isFlipParentEnableDefault())
						return null;
					ret = new J3dACHR(achr, master, mediaSources);
				}
			}
			else if (record.getRecordType().equals("LAND"))
			{		
				// this record might not exists or might be superceeded by the parents land so it's got a pointer to the land and a getter below
				if (makePhys)
				{
					Record parentLANDrec = ((J3dCellFactory) master).getParentWRLDLAND(worldId, (int) instCell.getTrans().x,
							(int) instCell.getTrans().y);
					if (parentLANDrec != null)
						j3dLAND = new J3dLAND(new LAND(parentLANDrec));
					else
						j3dLAND = new J3dLAND(new LAND(record));
				}
				else
				{
					Record parentLANDrec = ((J3dCellFactory) master).getParentWRLDLAND(worldId, (int) instCell.getTrans().x,
							(int) instCell.getTrans().y);
										
					if (parentLANDrec != null)
						j3dLAND = new J3dLAND(new LAND(parentLANDrec), master, mediaSources.getTextureSource());
					else
						j3dLAND = new J3dLAND(new LAND(record), master, mediaSources.getTextureSource());
					
				}
				j3dLAND.setLocation(cellLocation, new Quat4f(0, 0, 0, 1));

				ret = j3dLAND;
			}
			else if (record.getRecordType().equals("PGRD"))
			{

			}
			else if (record.getRecordType().equals("PGRE"))
			{

			}
			else if (record.getRecordType().equals("NAVM"))
			{

			}
			else
			{
				System.out.println("makeJ3dRECO in J3dCELL Record type not converted to j3d " + record.getRecordType());
			}
		}
		catch (NullPointerException e)
		{
			//e.printStackTrace();
			if (e.getStackTrace().length > 0)
				System.out.println("J3dCELL.makeJ3dRECO " + cell.formId + " - null pointer making record " + record + " " + record.getRecordType()
						+ " in " + e.getStackTrace()[0]);
			else
				System.out.println("J3dCELL.makeJ3dRECO " + cell.formId + " - null pointer making record " + record + " " + record.getRecordType());

			if (record.getRecordType().equals("REFR"))
			{
				REFR refr = new REFR(record);
				Record baseRecord = master.getRecord(refr.NAME.formId);
			
				System.out.println("And it's a REFR " + refr.NAME.formId + " with base of "
									+ (baseRecord == null ? "" : baseRecord.getRecordType()));
			}
		}

		if (ret != null)
		{
			j3dRECOs.put(ret.getRecordId(), ret);
		}
		return ret;
	}

	
	@Override
	public J3dLAND getJ3dLAND() {
		//If  didn't load land from a record above, check if the parent land should be used
		if(j3dLAND == null) {		
			if (makePhys)
			{
				Record parentLANDrec = ((J3dCellFactory) master).getParentWRLDLAND(worldId, (int) instCell.getTrans().x,
						(int) instCell.getTrans().y);
				if (parentLANDrec != null) {
					j3dLAND = new J3dLAND(new LAND(parentLANDrec));
					j3dLAND.setLocation(cellLocation, new Quat4f(0, 0, 0, 1));
				}
			}
			else
			{
				Record parentLANDrec = ((J3dCellFactory) master).getParentWRLDLAND(worldId, (int) instCell.getTrans().x,
						(int) instCell.getTrans().y);
									
				if (parentLANDrec != null) {
					j3dLAND = new J3dLAND(new LAND(parentLANDrec), master, mediaSources.getTextureSource());
					j3dLAND.setLocation(cellLocation, new Quat4f(0, 0, 0, 1));
				}				
			}

		}
		
		return j3dLAND;
	}
	
	protected boolean isVisibleDistant(Record record)
	{
		// ALL stats are not part of distant for now, do they have LODs in them?
		if (record.getRecordType().equals("REFR") && !makePhys)
		{
			REFR refr = new REFR(record);

			// doesn't exist in fallout.esm
			if (refr.NAME == null || refr.NAME.formId == 32 || refr.NAME.formId == 23)
				return false;

			Record baseRecord = master.getRecord(refr.NAME.formId);
			if (baseRecord != null)
			{
				if (baseRecord.getRecordType().equals("TREE"))
				{
					return true;
				}
				else if ((baseRecord.getRecordFlags1() & RECO.VisibleWhenDistant_Flag) != 0//
						|| (baseRecord.getRecordFlags1() & RECO.HasTreeLOD_Flag) != 0)
				{
					//anythig with LOD, STAT, SCOL, ACTI
					return true;
				}
			}
		}
		return false;

	}

}
