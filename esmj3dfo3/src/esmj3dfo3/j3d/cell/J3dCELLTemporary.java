package esmj3dfo3.j3d.cell;

import java.util.Iterator;
import java.util.List;

import esfilemanager.common.data.record.IRecordStore;
import esfilemanager.common.data.record.Record;
import esmj3d.j3d.j3drecords.inst.J3dLAND;
import esmj3d.j3d.j3drecords.inst.J3dRECOInst;
import utils.source.MediaSources;

public class J3dCELLTemporary extends J3dCELL
{

	public J3dCELLTemporary(IRecordStore master, Record cellRecord, int worldId, List<Record> children, boolean makePhys, MediaSources mediaSources)
	{
		super(master, cellRecord, worldId, children, makePhys, mediaSources);
		indexRecords();

	}

	private void indexRecords()
	{
		// if we load no land we might be supposed to load from the parent world instead
		J3dLAND j3dLAND = null;		
		
		for (Iterator<Record> i = children.iterator(); i.hasNext();)
		{
			Record record = i.next();
			J3dRECOInst jri = makeJ3dRECO(record);
			addJ3dRECOInst(jri);

			if (jri instanceof J3dLAND)
			{ 
				j3dLAND = (J3dLAND) jri;
			 
				 
				float wl = getWaterLevel(cell.XCLW);
				if (wl > j3dLAND.getLowestHeight())
				{
					addChild(makeWater(wl, J3dCELLPersistent.waterApp));
				}
			}
		}
		
		if(j3dLAND == null  ) {
			// ask the cell for it's parents land if that should be loaded
			j3dLAND = getJ3dLAND();		
			if(j3dLAND != null) {
				System.out.println("asked for pare but didn't get it for "+this.instCell.getTrans());
				getJ3dLAND();
				addJ3dRECOInst(j3dLAND);
			} 
			else
				System.out.println("asked for pare and did get it for "+this.instCell.getTrans());
		}
	}
}
