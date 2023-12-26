package esmj3dfo3.data.records;

import java.util.List;

import esfilemanager.common.data.record.Record;
import esfilemanager.common.data.record.Subrecord;
import esmj3d.data.shared.records.GenericSOUN;
import esmj3dfo3.data.subrecords.SNDX;

public class SOUN extends GenericSOUN
{
	public SNDX SNDX = null;

	public SOUN(Record recordData)
	{
		super(recordData);
		List<Subrecord> subrecords = recordData.getSubrecords();
		for (int i = 0; i < subrecords.size(); i++)
		{
			Subrecord sr = subrecords.get(i);
			byte[] bs = sr.getSubrecordData();

			if (sr.getSubrecordType().equals("SNDD"))
			{
				//
			}
			else if (sr.getSubrecordType().equals("SNDX"))
			{
				SNDX = new SNDX(bs);
			}
			else if (sr.getSubrecordType().equals("OBND"))
			{

			}
			else if (sr.getSubrecordType().equals("ANAM"))
			{

			}
			else if (sr.getSubrecordType().equals("GNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("HNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("RNAM"))
			{

			}

		}
	}

	

}
