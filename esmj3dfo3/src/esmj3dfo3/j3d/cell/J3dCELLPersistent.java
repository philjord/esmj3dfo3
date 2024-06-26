package esmj3dfo3.j3d.cell;

import java.util.Iterator;
import java.util.List;

import org.jogamp.java3d.Group;

import esfilemanager.common.data.record.IRecordStore;
import esfilemanager.common.data.record.Record;
import esmj3d.data.shared.records.CommonWRLD;
import esmj3d.j3d.cell.GridSpaces;
import esmj3d.j3d.cell.J3dICELLPersistent;
import esmj3d.j3d.water.WaterApp;
import esmj3dfo3.data.records.ACHR;
import esmj3dfo3.data.records.ACRE;
import esmj3dfo3.data.records.REFR;
import utils.source.MediaSources;

public class J3dCELLPersistent extends J3dCELL implements J3dICELLPersistent
{

	private GridSpaces gridSpaces = new GridSpaces(this);

	private CommonWRLD wrld;

	public static WaterApp waterApp; // the single water app used by all waters

	/**
	 * CELL presistent is differnt from temp and distant as it's dynamic refs and achar can move away
	 * but they are sitll managed by the cell persistent itself, so we have this crazy grid space sub system to quickly 
	 * clip wandering things away
	 * 
	 * So it is a bit different to a J3dCELL in constrcution, but same sort of content
	 * cell actory uses  esmj3dtes4.j3d.j3drecords.J3dCELL; as the other sort for temp and distant
	 * I need to bring this is as a common child of J3dCELL or something
	 * @param master
	 * @param cellRecord
	 * @param children
	 * @param makePhys
	 * @param recordToRECO
	 */

	public J3dCELLPersistent(CommonWRLD wrld, IRecordStore master, Record cellRecord, int worldId, List<Record> children, boolean makePhys, MediaSources mediaSources)
	{
		super(master, cellRecord, worldId, makePhys, mediaSources);
		this.wrld = wrld;

		setCapability(Group.ALLOW_CHILDREN_WRITE);
		setCapability(Group.ALLOW_CHILDREN_EXTEND);

		indexRecords(children);
		addChild(gridSpaces);

		if (!makePhys)
		{
			if (waterApp == null)
			{
				waterApp = new WaterApp("textures\\landscape\\MuckPoolWasteland01.dds", mediaSources.getTextureSource());
			}
			else
			{
				waterApp.detach();
			}
			addChild(waterApp);
		}

	}

	private void indexRecords(List<Record> children)
	{
		//NOTE they can be 10's of 1000's of these records do not load up front!

		for (Iterator<Record> i = children.iterator(); i.hasNext();)
		{
			Record record = i.next();

			if (record.getRecordType().equals("REFR"))
			{
				REFR refr = new REFR(record);
				gridSpaces.sortOutBucket(refr, record);
			}
			else if (record.getRecordType().equals("ACRE"))
			{
				ACRE acre = new ACRE(record);
				gridSpaces.sortOutBucket(acre, record);
			}
			else if (record.getRecordType().equals("ACHR"))
			{
				ACHR achr = new ACHR(record);
				gridSpaces.sortOutBucket(achr, record);
			}
			else if (record.getRecordType().equals("PGRE"))
			{

			}
			else
			{
				System.out.println("CELL_PERSISTENT Record type not converted to j3d " + record.getRecordType());
			}

		}
	}

	@Override
	public GridSpaces getGridSpaces()
	{
		return gridSpaces;
	}

	@Override
	public CommonWRLD getWRLD()
	{
		return wrld;
	}

}
