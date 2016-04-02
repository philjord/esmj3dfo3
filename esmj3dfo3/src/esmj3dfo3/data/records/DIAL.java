package esmj3dfo3.data.records;

import java.util.List;

import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.ZString;
import esmmanager.common.data.record.Record;
import esmmanager.common.data.record.Subrecord;

public class DIAL extends RECO
{

	public ZString EDID = null;

	public DIAL(Record recordData)
	{
		super(recordData);
		List<Subrecord> subrecords = recordData.getSubrecords();
		for (int i = 0; i < subrecords.size(); i++)
		{
			Subrecord sr = subrecords.get(i);
			byte[] bs = sr.getSubrecordData();

			if (sr.getSubrecordType().equals("EDID"))
			{
				EDID = new ZString(bs);
			}
			else if (sr.getSubrecordType().equals("QSTI"))
			{

			}
			else if (sr.getSubrecordType().equals("FULL"))
			{

			}

			else if (sr.getSubrecordType().equals("PNAM"))
			{

			}

			else if (sr.getSubrecordType().equals("DATA"))
			{

			}
			//FALLOUTNV only ////////////////////////////
			else if (sr.getSubrecordType().equals("INFC"))
			{

			}
			else if (sr.getSubrecordType().equals("INFX"))
			{

			}
			else if (sr.getSubrecordType().equals("TDUM"))
			{

			}
			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in record " + recordData + " in " + this);
			}

		}
	}
}
