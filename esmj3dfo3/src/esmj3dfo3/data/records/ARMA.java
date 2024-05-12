package esmj3dfo3.data.records;

import java.util.List;

import esfilemanager.common.data.record.Record;
import esfilemanager.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.LString;
import esmj3d.data.shared.subrecords.MODL;
import esmj3d.data.shared.subrecords.ZString;
import esmj3dfo3.data.subrecords.BMDT;

public class ARMA extends RECO
{
	

	public LString FULL;

	public BMDT BMDT;

	public MODL MODL; // male worn (or if no sex)

	public MODL MOD2; // male ground

	public MODL MOD3; // female worn  

	public MODL MOD4; // female ground

	public String ICON;

	public String ICO2;

	public DATA DATA;

	public ARMA(Record recordData)
	{

		super(recordData);

		List<Subrecord> subrecords = recordData.getSubrecords();
		for (int i = 0; i < subrecords.size(); i++)
		{
			Subrecord sr = subrecords.get(i);
			byte[] bs = sr.getSubrecordData();

			if (sr.getSubrecordType().equals("EDID"))
			{
				setEDID(bs);
			}
			else if (sr.getSubrecordType().equals("FULL"))
			{
				FULL = new LString(bs);
			}
			else if (sr.getSubrecordType().equals("BMDT"))
			{
				BMDT = new BMDT(bs);
			}
			else if (sr.getSubrecordType().equals("MODL"))
			{
				MODL = new MODL(bs);
			}
			else if (sr.getSubrecordType().equals("MODS"))
			{
				MODL.addMODSSub(bs);
			}
			else if (sr.getSubrecordType().equals("MODT"))
			{
				MODL.addMODTSub(bs);
			}
			else if (sr.getSubrecordType().equals("MOD2"))
			{
				MOD2 = new MODL(bs);
			}
			else if (sr.getSubrecordType().equals("MO2S"))
			{
				MOD2.addMODSSub(bs);
			}
			else if (sr.getSubrecordType().equals("MO2T"))
			{
				MOD2.addMODTSub(bs);
			}
			else if (sr.getSubrecordType().equals("MOD3"))
			{
				MOD3 = new MODL(bs);
			}
			else if (sr.getSubrecordType().equals("MO3S"))
			{
				MOD3.addMODSSub(bs);
			}
			else if (sr.getSubrecordType().equals("MO3T"))
			{
				MOD3.addMODTSub(bs);
			}
			else if (sr.getSubrecordType().equals("MOD4"))
			{
				MOD4 = new MODL(bs);
			}
			else if (sr.getSubrecordType().equals("MO4S"))
			{
				MOD4.addMODSSub(bs);
			}
			else if (sr.getSubrecordType().equals("MO4T"))
			{
				MOD4.addMODTSub(bs);
			}
			else if (sr.getSubrecordType().equals("ICON"))
			{
				ICON = ZString.toString(bs);
			}
			else if (sr.getSubrecordType().equals("ICO2"))
			{
				ICO2 = ZString.toString(bs);
			}
			else if (sr.getSubrecordType().equals("DATA"))
			{
				DATA = new DATA(bs);
			}
			else if (sr.getSubrecordType().equals("OBND"))
			{

			}
			else if (sr.getSubrecordType().equals("MODD"))
			{

			}
			else if (sr.getSubrecordType().equals("MOSD"))
			{

			}
			else if (sr.getSubrecordType().equals("ETYP"))
			{

			}
			else if (sr.getSubrecordType().equals("DNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("MODS"))
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
