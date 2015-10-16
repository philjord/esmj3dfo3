package esmj3dfo3.data.records;

import java.util.ArrayList;

import esmLoader.common.data.record.Record;
import esmLoader.common.data.record.Subrecord;
import esmj3d.data.shared.records.GenericSOUN;
import esmj3dfo3.data.subrecords.SNDX;

public class SOUN extends GenericSOUN
{
	public SNDX SNDX = null;

	public SOUN(Record recordData)
	{
		super(recordData);
		ArrayList<Subrecord> subrecords = recordData.getSubrecords();
		for (int i = 0; i < subrecords.size(); i++)
		{
			Subrecord sr = subrecords.get(i);
			byte[] bs = sr.getData();

			if (sr.getType().equals("SNDD"))
			{
				//
			}
			else if (sr.getType().equals("SNDX"))
			{
				SNDX = new SNDX(bs);
			}
			else if (sr.getType().equals("OBND"))
			{

			}
			else if (sr.getType().equals("ANAM"))
			{

			}
			else if (sr.getType().equals("GNAM"))
			{

			}
			else if (sr.getType().equals("HNAM"))
			{

			}
			else if (sr.getType().equals("RNAM"))
			{

			}

		}
	}

	

}
