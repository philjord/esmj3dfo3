package esmj3dfo3.data.records;

import java.util.ArrayList;

import esmLoader.common.data.record.Record;
import esmLoader.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.ZString;

public class RGDL extends RECO
{

	public ZString EDID = null;

	public RGDL(Record recordData)
	{
		super(recordData);
		ArrayList<Subrecord> subrecords = recordData.getSubrecords();
		for (int i = 0; i < subrecords.size(); i++)
		{
			Subrecord sr = subrecords.get(i);
			byte[] bs = sr.getData();

			if (sr.getType().equals("EDID"))
			{
				EDID = new ZString(bs);
			}
			else if (sr.getType().equals("TNAM"))
			{

			}
			else if (sr.getType().equals("RAPS"))
			{

			}
			else if (sr.getType().equals("RAFB"))
			{

			}
			else if (sr.getType().equals("DATA"))
			{

			}
			else if (sr.getType().equals("NVER"))
			{

			}
			else if (sr.getType().equals("ANAM"))
			{

			}
			else if (sr.getType().equals("RAFD"))
			{

			}
			else if (sr.getType().equals("XNAM"))
			{

			}

			else
			{
				System.out.println("unhandled : " + sr.getType() + " in record " + recordData + " in " + this);
			}

		}
	}
}
