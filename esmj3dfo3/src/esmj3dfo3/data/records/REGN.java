package esmj3dfo3.data.records;

import java.util.ArrayList;

import esmLoader.common.data.record.Record;
import esmLoader.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.ZString;

public class REGN extends RECO
{
	public ZString EDID;

	public REGN(Record recordData)
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
			else if (sr.getSubrecordType().equals("ICON"))
			{

			}
			else if (sr.getSubrecordType().equals("WNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("RCLR"))
			{

			}
			else if (sr.getSubrecordType().equals("RDWT"))
			{

			}
			else if (sr.getSubrecordType().equals("RDAT"))
			{

			}
			else if (sr.getSubrecordType().equals("RDOT"))
			{

			}
			else if (sr.getSubrecordType().equals("RDSD"))
			{

			}
			else if (sr.getSubrecordType().equals("RDMD"))
			{

			}
			else if (sr.getSubrecordType().equals("RPLI"))
			{

			}
			else if (sr.getSubrecordType().equals("RDMP"))
			{

			}
			else if (sr.getSubrecordType().equals("RPLD"))
			{

			}

			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in " + recordData);
			}
		}
	}
}
