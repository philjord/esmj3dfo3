package esmj3dfo3.data.records;

import java.util.ArrayList;

import esmLoader.common.data.record.Record;
import esmLoader.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.ZString;

public class INGR extends RECO
{
	public ZString EDID;

	public INGR(Record recordData)
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
			else if (sr.getSubrecordType().equals("EFID"))
			{
			}
			else if (sr.getSubrecordType().equals("EFIT"))
			{
			}
			else if (sr.getSubrecordType().equals("ENID"))
			{
			}
			else if (sr.getSubrecordType().equals("ENIT"))
			{
			}
			else if (sr.getSubrecordType().equals("ETYP"))
			{
			}
			else if (sr.getSubrecordType().equals("DATA"))
			{
			}
			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in record " + recordData + " in " + this);
			}
		}
	}

}
