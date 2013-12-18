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
			byte[] bs = sr.getData();

			if (sr.getType().equals("EDID"))
			{
				EDID = new ZString(bs);
			}
			else if (sr.getType().equals("ICON"))
			{

			}
			else if (sr.getType().equals("WNAM"))
			{

			}
			else if (sr.getType().equals("RCLR"))
			{

			}
			else if (sr.getType().equals("RDWT"))
			{

			}
			else if (sr.getType().equals("RDAT"))
			{

			}
			else if (sr.getType().equals("RDOT"))
			{

			}
			else if (sr.getType().equals("RDSD"))
			{

			}
			else if (sr.getType().equals("RDMD"))
			{

			}
			else if (sr.getType().equals("RPLI"))
			{

			}
			else if (sr.getType().equals("RDMP"))
			{

			}
			else if (sr.getType().equals("RPLD"))
			{

			}
			//FALLOUTNV only ////////////////////////////
			else if (sr.getType().equals("RDSI"))
			{

			}
			else if (sr.getType().equals("RDSB"))
			{

			}
			else if (sr.getType().equals("RDID"))
			{

			}
			else
			{
				System.out.println("unhandled : " + sr.getType() + " in record " + recordData + " in " + this);
			}
		}
	}
}
