package esmj3dfo3.data.records;

import java.util.List;

import esfilemanager.common.data.record.Record;
import esfilemanager.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;


public class SCPT extends RECO
{

	

	public SCPT(Record recordData)
	{
		super(recordData);
		List<Subrecord> subrecords = recordData.getSubrecords();
		for (int i = 0; i < subrecords.size(); i++)
		{
			Subrecord sr = subrecords.get(i);
			byte[] bs = sr.getSubrecordData();

			if (sr.getSubrecordType().equals("EDID"))
			{
				setEDID(bs);
			}
			else if (sr.getSubrecordType().equals("SCRV"))
			{

			}
			else if (sr.getSubrecordType().equals("SCVR"))
			{

			}
			else if (sr.getSubrecordType().equals("SCTX"))
			{

			}
			else if (sr.getSubrecordType().equals("SLSD"))
			{

			}
			else if (sr.getSubrecordType().equals("SCDA"))
			{

			}
			else if (sr.getSubrecordType().equals("SCRO"))
			{

			}
			else if (sr.getSubrecordType().equals("SCHR"))
			{

			}

			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in record " + recordData + " in " + this);
			}

		}
	}
}
