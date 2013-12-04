package esmj3dfo3.data.records;

import java.util.ArrayList;

import esmLoader.common.data.record.Record;
import esmLoader.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.ANAM;
import esmj3d.data.shared.subrecords.LString;
import esmj3d.data.shared.subrecords.MODL;
import esmj3d.data.shared.subrecords.ZString;

public class AMMO extends RECO
{
	public ZString EDID;

	public LString FULL;

	public MODL MODL;

	public ZString ICON;

	public ANAM ANAM;

	public DATA DATA;

	public AMMO(Record recordData)
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
			else if (sr.getSubrecordType().equals("FULL"))
			{
				FULL = new LString(bs);
			}
			else if (sr.getSubrecordType().equals("MODL"))
			{
				MODL = new MODL(bs);
			}

			else if (sr.getSubrecordType().equals("MODT"))
			{
				MODL.addMODTSub(bs);
			}
			else if (sr.getSubrecordType().equals("ICON"))
			{
				ICON = new ZString(bs);
			}
			else if (sr.getSubrecordType().equals("DATA"))
			{
				DATA = new DATA(bs);
			}
			else if (sr.getSubrecordType().equals("OBND"))
			{
			}
			else if (sr.getSubrecordType().equals("MICO"))
			{
			}
			else if (sr.getSubrecordType().equals("YNAM"))
			{
			}
			else if (sr.getSubrecordType().equals("ZNAM"))
			{
			}
			else if (sr.getSubrecordType().equals("ONAM"))
			{
			}
			//FALLOUTNV only ////////////////////////////
			else if (sr.getSubrecordType().equals("DAT2"))
			{

			}
			else if (sr.getSubrecordType().equals("QNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("RCIL"))
			{

			} 
			else if (sr.getSubrecordType().equals("SCRI"))
			{

			}
			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in record " + recordData + " in " + this);
			}
		}
	}

	public class DATA
	{
		public byte[] data;

		private DATA(byte[] bytes)
		{
			data = bytes;
		}
	}

}
