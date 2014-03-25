package esmj3dfo3.j3d.cell;

import java.util.Iterator;
import java.util.List;

import utils.source.MediaSources;
import esmLoader.common.data.record.IRecordStore;
import esmLoader.common.data.record.Record;
import esmj3d.j3d.j3drecords.inst.J3dRECOInst;

public class J3dCELLTemporary extends J3dCELL
{

	public J3dCELLTemporary(IRecordStore master, Record cellRecord, List<Record> children, boolean makePhys, MediaSources mediaSources)
	{
		super(master, cellRecord, children, makePhys, mediaSources);
		indexRecords();
	}

	private void indexRecords()
	{
		for (Iterator<Record> i = children.iterator(); i.hasNext();)
		{
			Record record = i.next();

			// distants of this list are added by teh distant cell 
			if (!isDistant(record))
			{
				J3dRECOInst jri = makeJ3dRECO(record, false);
				addJ3dRECOInst(jri);
			}

		}
	}
}
