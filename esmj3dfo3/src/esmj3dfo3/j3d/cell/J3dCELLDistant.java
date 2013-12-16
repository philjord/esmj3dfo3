package esmj3dfo3.j3d.cell;

import java.util.Iterator;
import java.util.List;

import utils.source.MeshSource;
import utils.source.SoundSource;
import utils.source.TextureSource;
import esmLoader.common.data.record.IRecordStore;
import esmLoader.common.data.record.Record;
import esmj3d.j3d.j3drecords.inst.J3dRECOInst;

public class J3dCELLDistant extends J3dCELL
{
	//Notice this distant uses the temp children cell but only adds the in the distant ones

	public J3dCELLDistant(IRecordStore master, Record cellRecord, List<Record> children, boolean makePhys, MeshSource meshSource,
			TextureSource textureSource, SoundSource soundSource)
	{
		super(master, cellRecord, children, makePhys, meshSource, textureSource, soundSource);
		indexRecords();
	}

	private void indexRecords()
	{
		for (Iterator<Record> i = children.iterator(); i.hasNext();)
		{
			Record record = i.next();

			// some stats are part of distant (Lod only?)
			if (isDistant(record))
			{
				J3dRECOInst jri = makeJ3dRECO(record, true);
				addJ3dRECOInst(jri);
			}

		}
	}
}
