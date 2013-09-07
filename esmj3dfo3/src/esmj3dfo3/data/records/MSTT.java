package esmj3dfo3.data.records;

import java.util.ArrayList;

import esmLoader.common.data.record.Record;
import esmLoader.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.MODL;
import esmj3d.data.shared.subrecords.ZString;

public class MSTT extends RECO
{
	public ZString EDID;

	public MODL MODL;

	public MSTT(Record recordData)
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
			else if (sr.getSubrecordType().equals("MODL"))
			{
				MODL = new MODL(bs);
			}
			else if (sr.getSubrecordType().equals("MODB"))
			{
				MODL.addMODBSub(bs);
			}
			else if (sr.getSubrecordType().equals("MODT"))
			{
				MODL.addMODTSub(bs);
			}
			else if (sr.getSubrecordType().equals("OBND"))
			{

			}
			else if (sr.getSubrecordType().equals("DATA"))
			{

			}
			else if (sr.getSubrecordType().equals("SNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("DSTD"))
			{

			}
			else if (sr.getSubrecordType().equals("DSTF"))
			{

			}
			else if (sr.getSubrecordType().equals("DMDL"))
			{

			}
			else if (sr.getSubrecordType().equals("DMDT"))
			{

			}
			else if (sr.getSubrecordType().equals("DEST"))
			{

			}
			else if (sr.getSubrecordType().equals("FULL"))
			{

			}
			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in " + recordData);
			}
		}
	}

	public String showDetails()
	{
		return "STAT : (" + formId + "|" + Integer.toHexString(formId) + ") " + EDID.str + " : " + MODL.model;
	}

}