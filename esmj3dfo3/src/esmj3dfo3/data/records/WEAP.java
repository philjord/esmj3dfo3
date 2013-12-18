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
			byte[] bs = sr.getData();

			if (sr.getType().equals("EDID"))
			{
				EDID = new ZString(bs);
			}
			else if (sr.getType().equals("FULL"))
			{
				FULL = new LString(bs);
			}
			else if (sr.getType().equals("DATA"))
			{
				DATA = new DATA(bs);
			}
			else if (sr.getType().equals("MODL"))
			{
				MODL = new MODL(bs);
			}

			else if (sr.getType().equals("MODT"))
			{
				MODL.addMODTSub(bs);
			}
			else if (sr.getType().equals("MOD2"))
			{
				MOD2 = new MODL(bs);
			}

			else if (sr.getType().equals("MO2T"))
			{
				MOD2.addMODTSub(bs);
			}
			else if (sr.getType().equals("MOD3"))
			{
				MOD3 = new MODL(bs);
			}

			else if (sr.getType().equals("MO3T"))
			{
				MOD3.addMODTSub(bs);
			}
			else if (sr.getType().equals("MOD4"))
			{
				MOD4 = new MODL(bs);
			}

			else if (sr.getType().equals("MO4T"))
			{
				MOD4.addMODTSub(bs);
			}
			else if (sr.getType().equals("ICON"))
			{
				ICON = new ZString(bs);
			}
			else if (sr.getType().equals("OBND"))
			{

			}
			else if (sr.getType().equals("WNAM"))
			{

			}
			else if (sr.getType().equals("SCRI"))
			{

			}

			else if (sr.getType().equals("DSTF"))
			{

			}
			else if (sr.getType().equals("DEST"))
			{

			}
			else if (sr.getType().equals("TNAM"))
			{

			}
			else if (sr.getType().equals("VNAM"))
			{

			}

			else if (sr.getType().equals("NAM0"))
			{

			}
			else if (sr.getType().equals("YNAM"))
			{

			}
			else if (sr.getType().equals("NAM8"))
			{

			}
			else if (sr.getType().equals("NAM9"))
			{

			}
			else if (sr.getType().equals("NNAM"))
			{
				//string
			}
			else if (sr.getType().equals("NAM6"))
			{

			}
			else if (sr.getType().equals("NAM7"))
			{

			}
			else if (sr.getType().equals("BIPL"))
			{

			}
			else if (sr.getType().equals("DNAM"))
			{

			}
			else if (sr.getType().equals("XNAM"))
			{

			}
			else if (sr.getType().equals("EAMT"))
			{

			}
			else if (sr.getType().equals("ETYP"))
			{

			}

			else if (sr.getType().equals("ZNAM"))
			{

			}
			else if (sr.getType().equals("CRDT"))
			{

			}
			else if (sr.getType().equals("EITM"))
			{

			}
			else if (sr.getType().equals("INAM"))
			{

			}
			else if (sr.getType().equals("MICO"))
			{
				//string
			}
			else if (sr.getType().equals("UNAM"))
			{

			}
			else if (sr.getType().equals("MODD"))
			{

			}
			else if (sr.getType().equals("REPL"))
			{

			}
			else if (sr.getType().equals("SNAM"))
			{

			}
			else if (sr.getType().equals("DATA"))
			{

			}
			else if (sr.getType().equals("DSTD"))
			{

			}
			else if (sr.getType().equals("VANM"))
			{

			}
			else if (sr.getType().equals("VATS"))
			{

			}
			//FALLOUTNV only ////////////////////////////
			else if (sr.getType().equals("MODS"))
			{

			}
			else if (sr.getType().startsWith("MWD"))//1-7
			{

			}
			else if (sr.getType().startsWith("WNM"))//1-7
			{

			}
			else if (sr.getType().startsWith("WMI"))//1-3
			{

			}
			else if (sr.getType().startsWith("WMS"))//1-2
			{

			}
			else
			{
				System.out.println("unhandled : " + sr.getType() + " in record " + recordData + " in " + this);
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
