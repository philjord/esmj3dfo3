package esmj3dfo3.data.records;

import java.util.ArrayList;

import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.ZString;
import esmmanager.common.data.record.Record;
import esmmanager.common.data.record.Subrecord;

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
			byte[] bs = sr.getData();

			if (sr.getType().equals("EDID"))
			{
				EDID = new ZString(bs);
			}
			else if (sr.getType().equals("EFID"))
			{
			}
			else if (sr.getType().equals("EFIT"))
			{
			}
			else if (sr.getType().equals("ENID"))
			{
			}
			else if (sr.getType().equals("ENIT"))
			{
			}
			else if (sr.getType().equals("ETYP"))
			{
			}
			else if (sr.getType().equals("DATA"))
			{
			}
			else
			{
				System.out.println("unhandled : " + sr.getType() + " in record " + recordData + " in " + this);
			}
		}
	}

}
