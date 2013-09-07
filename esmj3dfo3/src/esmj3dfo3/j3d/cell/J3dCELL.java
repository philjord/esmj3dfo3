package esmj3dfo3.j3d.cell;

import java.util.ArrayList;
import java.util.List;

import javax.media.j3d.Node;

import utils.ESConfig;
import utils.source.MeshSource;
import utils.source.SoundSource;
import utils.source.TextureSource;
import esmLoader.common.data.record.IRecordStore;
import esmLoader.common.data.record.Record;
import esmj3d.data.shared.records.LAND;
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

public class J3dCELL extends J3dCELLGeneral implements UpdateListener
{
	protected CELL cell;

	private ArrayList<J3dRECOInst> j3dRECOInsts = new ArrayList<J3dRECOInst>();

	public J3dCELL(IRecordStore master, Record cellRecord, List<Record> children, boolean makePhys, MeshSource meshSource,
			TextureSource textureSource, SoundSource soundSource)
	{
		super(master, children, makePhys, meshSource, textureSource, soundSource);
		cell = new CELL(cellRecord);
		setCell(cell);
		makeWater(cell.XCLW * ESConfig.ES_TO_METERS_SCALE, "textures\\water\\waterwaves.dds");

		BethRenderSettings.addUpdateListener(this);
	}

	@Override
	public void renderSettingsUpdated()
	{
		for (J3dRECOInst j3dRECOInst : j3dRECOInsts)
		{
			j3dRECOInst.renderSettingsUpdated();
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

	public J3dRECOInst makeJ3dRECO(Record record)
	{
		J3dRECOInst ret = null;
		try
		{
			if (record.getRecordType().equals("REFR"))
			{
				ret = J3dREFRFactory.makeJ3DRefer(new REFR(record), makePhys, master, meshSource, textureSource, soundSource);
			}
			else if (record.getRecordType().equals("ACRE"))
			{
				if (!makePhys)
				{
					ret = new J3dACRE(new ACRE(record), master, meshSource, textureSource, soundSource);
				}
			}
			else if (record.getRecordType().equals("ACHR"))
			{
				if (!makePhys)
				{
					ret = new J3dACHR(new ACHR(record), master, meshSource, textureSource, soundSource);
				}
			}
			else if (record.getRecordType().equals("LAND"))
			{
				J3dLAND j3dLAND;
				if (makePhys)
				{
					j3dLAND = new J3dLAND(new LAND(record));
				}
				else
				{
					j3dLAND = new J3dLAND(new LAND(record), master, textureSource);
				}

				j3dLAND.setLocation(cellLocation);
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
			System.out.println("J3dCELL " + cell.formId + " - null pointer making record " + record + " " + record.getRecordType());
			if (record.getRecordType().equals("REFR"))
			{
				REFR refr = new REFR(record);
				Record baseRecord = master.getRecord(refr.NAME.formId);
				System.out.println("And it's a REFR with base of " + baseRecord.getRecordType());
			}
		}

		if (ret != null)
		{
			j3dRECOs.put(ret.getRecordId(), ret);
		}
		return ret;
	}

	protected boolean isDistant(Record record)
	{
		// ALL stats are part of distant Lod only
		if (record.getRecordType().equals("REFR"))
		{
			REFR refr = new REFR(record);

			// doesn't exist in fallout.esm
			if (refr.NAME.formId == 32 || refr.NAME.formId == 23)
				return false;

			Record baseRecord = master.getRecord(refr.NAME.formId);
			if (baseRecord != null)
			{
				if (baseRecord.getRecordType().equals("STAT") || baseRecord.getRecordType().equals("SCOL")
						|| baseRecord.getRecordType().equals("TREE"))
				{
					return true;
				}
			}
		}
		return false;

	}
}