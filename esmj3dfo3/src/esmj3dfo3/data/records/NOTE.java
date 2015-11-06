package esmj3dfo3.data.records;

import java.util.ArrayList;

import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.MODL;
import esmj3d.data.shared.subrecords.ZString;
import esmmanager.common.data.record.Record;
import esmmanager.common.data.record.Subrecord;

public class NOTE extends RECO
{

	public ZString EDID = null;

	public MODL MODL = null;

	public NOTE(Record recordData)
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
			else if (sr.getType().equals("MODL"))
			{
				MODL = new MODL(bs);
			}
			else if (sr.getType().equals("MODB"))
			{
				MODL.addMODBSub(bs);
			}
 
			else if (sr.getType().equals("SNAM"))
			{

			}
			else if (sr.getType().equals("DATA"))
			{

			}
			else if (sr.getType().equals("OBND"))
			{

			}
			else if (sr.getType().equals("ONAM"))
			{

			}
			else if (sr.getType().equals("ICON"))
			{

			}
			else if (sr.getType().equals("FULL"))
			{

			}
			else if (sr.getType().equals("TNAM"))
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
