package esmj3dfo3.data.records;

import java.util.ArrayList;

import esmLoader.common.data.record.Record;
import esmLoader.common.data.record.Subrecord;
import esmj3d.data.shared.records.CommonWRLD;
import esmj3d.data.shared.subrecords.ZString;
import esmj3dfo3.data.subrecords.SNAM_d;

public class WRLD extends CommonWRLD
{
	public SNAM_d SNAM = null;

	public ZString ICON = null;

	public WRLD(Record recordData)
	{
		super(recordData);
		ArrayList<Subrecord> subrecords = recordData.getSubrecords();
		for (int i = 0; i < subrecords.size(); i++)
		{
			Subrecord sr = subrecords.get(i);
			byte[] bs = sr.getSubrecordData();

			if (sr.getSubrecordType().equals("SNAM"))
			{
				SNAM = new SNAM_d(bs);
			}
			else if (sr.getSubrecordType().equals("ICON"))
			{
				ICON = new ZString(bs);
			}
			else if (sr.getSubrecordType().equals("NAM0"))
			{
				//
			}
			else if (sr.getSubrecordType().equals("NAM9"))
			{
				//
			}
			else if (sr.getSubrecordType().equals("OFST"))
			{
				//
			}
			else if (sr.getSubrecordType().equals("MNAM"))
			{
				//
			}

			else if (sr.getSubrecordType().equals("XEZN"))
			{
				//
			}
			else if (sr.getSubrecordType().equals("PNAM"))
			{
				//
			}
			else if (sr.getSubrecordType().equals("NAM3"))
			{
				//
			}
			else if (sr.getSubrecordType().equals("NAM4"))
			{
				//
			}
			else if (sr.getSubrecordType().equals("ONAM"))
			{
				//
			}
			else if (sr.getSubrecordType().equals("INAM"))
			{
				//
			}
			else if (sr.getSubrecordType().equals("ZNAM"))
			{
				//
			}
			else if (sr.getSubrecordType().equals("NNAM"))
			{
				//
			}
			else if (sr.getSubrecordType().equals("XNAM"))
			{
				//
			}
			else
			{
				//	System.out.println("unhandled : " + sr.getSubrecordType() + " in record " + recordData + " in " + this);
			}
		}
	}

}
