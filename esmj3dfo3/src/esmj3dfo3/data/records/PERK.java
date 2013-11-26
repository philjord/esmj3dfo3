package esmj3dfo3.data.records;

import java.util.ArrayList;

import esmLoader.common.data.record.Record;
import esmLoader.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.ZString;

public class PERK extends RECO
{

	public ZString EDID = null;

	public PERK(Record recordData)
	{
		super(recordData);
		ArrayList<Subrecord> subrecords = recordData.getSubrecords();
		for (int i = 0; i < subrecords.size(); i++)
		{
			Subrecord sr = subrecords.get(i);
			byte[] bs = sr.getSubrecordData();

			if (sr.getSubrecordType().equals("EDID"))
			{
				EDID = new ZString(bs);
			}
			else if (sr.getSubrecordType().equals("FULL"))
			{

			}
			else if (sr.getSubrecordType().equals("DESC"))
			{

			}
			else if (sr.getSubrecordType().equals("ICON"))
			{

			}
			else if (sr.getSubrecordType().equals("CTDA"))
			{

			}
			else if (sr.getSubrecordType().equals("DATA"))
			{

			}
			else if (sr.getSubrecordType().equals("PRKE"))
			{

			}
			else if (sr.getSubrecordType().equals("EPFT"))
			{

			}
			else if (sr.getSubrecordType().equals("EPFD"))
			{

			}
			else if (sr.getSubrecordType().equals("PRKF"))
			{

			}
			else if (sr.getSubrecordType().equals("PRKC"))
			{

			}
			else if (sr.getSubrecordType().equals("EPF2"))
			{

			}
			else if (sr.getSubrecordType().equals("EPF3"))
			{

			}
			else if (sr.getSubrecordType().equals("SCHR"))
			{

			}
			else if (sr.getSubrecordType().equals("SCDA"))
			{

			}
			else if (sr.getSubrecordType().equals("SCTX"))
			{

			}
			else if (sr.getSubrecordType().equals("SCRO"))
			{

			}

			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in record " + recordData + " in " + this);
			}

		}
	}
}
