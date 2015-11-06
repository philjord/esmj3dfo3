package esmj3dfo3.data.records;

import java.util.ArrayList;

import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.FormID;
import esmj3d.data.shared.subrecords.LString;
import esmj3d.data.shared.subrecords.MODL;
import esmj3d.data.shared.subrecords.OBND;
import esmj3d.data.shared.subrecords.ZString;
import esmmanager.common.data.record.Record;
import esmmanager.common.data.record.Subrecord;

public class ACTI extends RECO
{
	public ZString EDID;

	public LString FULL;

	public MODL MODL;

	public FormID SCRI;

	public FormID SNAM;

	public OBND OBND;

	public ACTI(Record recordData)
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
			else if (sr.getType().equals("FULL"))
			{
				FULL = new LString(bs);
			}
			else if (sr.getType().equals("MODL"))
			{
				MODL = new MODL(bs);
			}
			else if (sr.getType().equals("MODB"))
			{
				MODL.addMODBSub(bs);
			}
			else if (sr.getType().equals("MODT"))
			{
				MODL.addMODTSub(bs);
			}
			else if (sr.getType().equals("SCRI"))
			{
				SCRI = new FormID(bs);
			}
			else if (sr.getType().equals("SNAM"))
			{
				SNAM = new FormID(bs);
			}
			else if (sr.getType().equals("OBND"))
			{
				OBND = new OBND(bs);
			}
			else if (sr.getType().equals("RNAM"))
			{

			}
			else if (sr.getType().equals("DSTD"))
			{

			}
			else if (sr.getType().equals("DSTF"))
			{

			}
			else if (sr.getType().equals("DEST"))
			{

			}
			else if (sr.getType().equals("WNAM"))
			{

			}
			else if (sr.getType().equals("VNAM"))
			{

			}
			else if (sr.getType().equals("DMDL"))
			{

			}
			else if (sr.getType().equals("DMDT"))
			{

			}
			else if (sr.getType().equals("XATO"))
			{

			}
			//FALLOUTNV only ////////////////////////////
			else if (sr.getType().equals("INAM"))
			{

			}
			else if (sr.getType().equals("MODS"))
			{

			}
			else
			{
				System.out.println("unhandled : " + sr.getType() + " in record " + recordData + " in " + this);
			}
		}
	}

}
