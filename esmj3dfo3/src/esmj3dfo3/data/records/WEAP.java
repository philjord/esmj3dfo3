package esmj3dfo3.data.records;

import java.util.ArrayList;

import esmLoader.common.data.record.Record;
import esmLoader.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.LString;
import esmj3d.data.shared.subrecords.MODL;
import esmj3d.data.shared.subrecords.ZString;

public class WEAP extends RECO
{
	public ZString EDID;

	public LString FULL;

	public DATA DATA;

	public MODL MODL; // male worn (or if no sex)

	public MODL MOD2; // male ground

	public MODL MOD3; // female worn  

	public MODL MOD4; // female ground

	public ZString ICON;

	public WEAP(Record recordData)
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
			else if (sr.getSubrecordType().equals("DATA"))
			{
				DATA = new DATA(bs);
			}
			else if (sr.getSubrecordType().equals("MODL"))
			{
				MODL = new MODL(bs);
			}

			else if (sr.getSubrecordType().equals("MODT"))
			{
				MODL.addMODTSub(bs);
			}
			else if (sr.getSubrecordType().equals("MOD2"))
			{
				MOD2 = new MODL(bs);
			}

			else if (sr.getSubrecordType().equals("MO2T"))
			{
				MOD2.addMODTSub(bs);
			}
			else if (sr.getSubrecordType().equals("MOD3"))
			{
				MOD3 = new MODL(bs);
			}

			else if (sr.getSubrecordType().equals("MO3T"))
			{
				MOD3.addMODTSub(bs);
			}
			else if (sr.getSubrecordType().equals("MOD4"))
			{
				MOD4 = new MODL(bs);
			}

			else if (sr.getSubrecordType().equals("MO4T"))
			{
				MOD4.addMODTSub(bs);
			}
			else if (sr.getSubrecordType().equals("ICON"))
			{
				ICON = new ZString(bs);
			}
			else if (sr.getSubrecordType().equals("OBND"))
			{

			}
			else if (sr.getSubrecordType().equals("WNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("SCRI"))
			{

			}

			else if (sr.getSubrecordType().equals("DSTF"))
			{

			}
			else if (sr.getSubrecordType().equals("DEST"))
			{

			}
			else if (sr.getSubrecordType().equals("TNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("VNAM"))
			{

			}

			else if (sr.getSubrecordType().equals("NAM0"))
			{

			}
			else if (sr.getSubrecordType().equals("YNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("NAM8"))
			{

			}
			else if (sr.getSubrecordType().equals("NAM9"))
			{

			}
			else if (sr.getSubrecordType().equals("NNAM"))
			{
				//string
			}
			else if (sr.getSubrecordType().equals("NAM6"))
			{

			}
			else if (sr.getSubrecordType().equals("NAM7"))
			{

			}
			else if (sr.getSubrecordType().equals("BIPL"))
			{

			}
			else if (sr.getSubrecordType().equals("DNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("XNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("EAMT"))
			{

			}
			else if (sr.getSubrecordType().equals("ETYP"))
			{

			}

			else if (sr.getSubrecordType().equals("ZNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("CRDT"))
			{

			}
			else if (sr.getSubrecordType().equals("EITM"))
			{

			}
			else if (sr.getSubrecordType().equals("INAM"))
			{

			}
			else if (sr.getSubrecordType().equals("MICO"))
			{
				//string
			}
			else if (sr.getSubrecordType().equals("UNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("MODD"))
			{

			}
			else if (sr.getSubrecordType().equals("REPL"))
			{

			}
			else if (sr.getSubrecordType().equals("SNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("DATA"))
			{

			}
			else if (sr.getSubrecordType().equals("DSTD"))
			{

			}
			else if (sr.getSubrecordType().equals("VANM"))
			{

			}else if (sr.getSubrecordType().equals("VATS"))
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

	public class DATA
	{
		public byte[] data;

		private DATA(byte[] bytes)
		{
			data = bytes;
		}
	}
}