package esmj3dfo3.data.records;

import java.util.ArrayList;

import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.LString;
import esmj3d.data.shared.subrecords.MODL;
import esmj3d.data.shared.subrecords.ZString;
import esmj3dfo3.data.subrecords.BMDT;
import esmmanager.common.data.record.Record;
import esmmanager.common.data.record.Subrecord;

public class ARMA extends RECO
{
	public ZString EDID;

	public LString FULL;

	public BMDT BMDT;

	public MODL MODL; // male worn (or if no sex)

	public MODL MOD2; // male ground

	public MODL MOD3; // female worn  

	public MODL MOD4; // female ground

	public ZString ICON;

	public ZString ICO2;

	public DATA DATA;

	public ARMA(Record recordData)
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
			else if (sr.getType().equals("BMDT"))
			{
				BMDT = new BMDT(bs);
			}
			else if (sr.getType().equals("MODL"))
			{
				MODL = new MODL(bs);
			}
			else if (sr.getType().equals("MODS"))
			{
				MODL.addMODSSub(bs);
			}
			else if (sr.getType().equals("MODT"))
			{
				MODL.addMODTSub(bs);
			}
			else if (sr.getType().equals("MOD2"))
			{
				MOD2 = new MODL(bs);
			}
			else if (sr.getType().equals("MO2S"))
			{
				MOD2.addMODSSub(bs);
			}
			else if (sr.getType().equals("MO2T"))
			{
				MOD2.addMODTSub(bs);
			}
			else if (sr.getType().equals("MOD3"))
			{
				MOD3 = new MODL(bs);
			}
			else if (sr.getType().equals("MO3S"))
			{
				MOD3.addMODSSub(bs);
			}
			else if (sr.getType().equals("MO3T"))
			{
				MOD3.addMODTSub(bs);
			}
			else if (sr.getType().equals("MOD4"))
			{
				MOD4 = new MODL(bs);
			}
			else if (sr.getType().equals("MO4S"))
			{
				MOD4.addMODSSub(bs);
			}
			else if (sr.getType().equals("MO4T"))
			{
				MOD4.addMODTSub(bs);
			}
			else if (sr.getType().equals("ICON"))
			{
				ICON = new ZString(bs);
			}
			else if (sr.getType().equals("ICO2"))
			{
				ICO2 = new ZString(bs);
			}
			else if (sr.getType().equals("DATA"))
			{
				DATA = new DATA(bs);
			}
			else if (sr.getType().equals("OBND"))
			{

			}
			else if (sr.getType().equals("MODD"))
			{

			}
			else if (sr.getType().equals("MOSD"))
			{

			}
			else if (sr.getType().equals("ETYP"))
			{

			}
			else if (sr.getType().equals("DNAM"))
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

	public class DATA
	{
		public byte[] data;

		private DATA(byte[] bytes)
		{
			data = bytes;
		}
	}
}
