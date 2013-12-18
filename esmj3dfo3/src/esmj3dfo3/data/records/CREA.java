package esmj3dfo3.data.records;

import java.util.ArrayList;

import tools.io.ESMByteConvert;
import esmLoader.common.data.record.Record;
import esmLoader.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.CNTO;
import esmj3d.data.shared.subrecords.FormID;
import esmj3d.data.shared.subrecords.LString;
import esmj3d.data.shared.subrecords.MODL;
import esmj3d.data.shared.subrecords.ZString;
import esmj3dfo3.data.subrecords.ACBS;
import esmj3dfo3.data.subrecords.AIDT;
import esmj3dfo3.data.subrecords.CSDC;
import esmj3dfo3.data.subrecords.KFFZ;
import esmj3dfo3.data.subrecords.NIFT;
import esmj3dfo3.data.subrecords.NIFZ;
import esmj3dfo3.data.subrecords.SNAM;
import esmj3dfo3.data.subrecords.WNAM;

public class CREA extends RECO
{
	public ZString EDID = null;

	public LString FULL = null;

	public MODL MODL = null;

	public NIFZ NIFZ = null;

	public NIFT NIFT = null;

	public ACBS ACBS = null;

	public ArrayList<SNAM> SNAMs = new ArrayList<SNAM>();

	public FormID INAM = null;

	public RNAM RNAM = null;

	public ArrayList<FormID> SPLOs = new ArrayList<FormID>();

	public FormID SCRI = null;

	public ArrayList<CNTO> CNTOs = new ArrayList<CNTO>();

	public AIDT AIDT = null;

	public ArrayList<FormID> PKIDs = new ArrayList<FormID>();

	public DATA DATA = null;

	public FormID ZNAM = null;

	public FormID CSCR = null;

	public ArrayList<CSDT> CSDTs = new ArrayList<CSDT>();

	public BNAM BNAM = null;

	public TNAM TNAM = null;

	public WNAM WNAM = null;

	public KFFZ KFFZ = null;

	//data data
	public byte unknown1;

	public byte combat;

	public byte magic;

	public int Soul;

	public int health;

	public int unknown2;

	public int damage;

	public byte Str;

	public byte Int;

	public byte Wil;

	public byte Agi;

	public byte Spd;

	public byte End;

	public byte Per;

	public byte Luc;

	public CREA(Record recordData)
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
			else if (sr.getType().equals("MODT"))
			{
				MODL.addMODTSub(bs);
			}
			else if (sr.getType().equals("NIFZ"))
			{
				NIFZ = new NIFZ(bs);
			}
			else if (sr.getType().equals("NIFT"))
			{
				NIFT = new NIFT(bs);
			}
			else if (sr.getType().equals("ACBS"))
			{
				ACBS = new ACBS(bs);
			}
			else if (sr.getType().equals("SNAM"))
			{
				SNAMs.add(new SNAM(bs));
			}
			else if (sr.getType().equals("INAM"))
			{
				INAM = new FormID(bs);
			}
			else if (sr.getType().equals("RNAM"))
			{
				RNAM = new RNAM(bs);
			}
			else if (sr.getType().equals("SPLO"))
			{
				SPLOs.add(new FormID(bs));
			}
			else if (sr.getType().equals("SCRI"))
			{
				SCRI = new FormID(bs);
			}
			else if (sr.getType().equals("CNTO"))
			{
				CNTOs.add(new CNTO(bs));
			}
			else if (sr.getType().equals("AIDT"))
			{
				AIDT = new AIDT(bs);
			}
			else if (sr.getType().equals("PKID"))
			{
				PKIDs.add(new FormID(bs));
			}
			else if (sr.getType().equals("DATA"))
			{
				DATA = new DATA(bs);
			}
			else if (sr.getType().equals("ZNAM"))
			{
				ZNAM = new FormID(bs);
			}
			else if (sr.getType().equals("CSCR"))
			{
				CSCR = new FormID(bs);
			}
			else if (sr.getType().equals("CSDT"))
			{
				CSDT csdt = new CSDT(bs);
				i++;
				if (i < subrecords.size())
				{
					Subrecord sr2 = subrecords.get(i);
					csdt.csdi = new FormID(sr2.getData());
					i++;
					if (i < subrecords.size())
					{
						Subrecord sr3 = subrecords.get(i);
						csdt.csdc = new CSDC(sr3.getData());

					}
				}
				CSDTs.add(csdt);
			}
			else if (sr.getType().equals("CSDI"))
			{
				BNAM = new BNAM(bs);
			}
			else if (sr.getType().equals("CSDC"))
			{
				BNAM = new BNAM(bs);
			}
			else if (sr.getType().equals("BNAM"))
			{
				BNAM = new BNAM(bs);
			}
			else if (sr.getType().equals("TNAM"))
			{
				TNAM = new TNAM(bs);
			}
			else if (sr.getType().equals("WNAM"))
			{
				WNAM = new WNAM(bs);
			}
			else if (sr.getType().equals("KFFZ"))
			{
				KFFZ = new KFFZ(bs);
			}
			else if (sr.getType().equals("OBND"))
			{

			}
			else if (sr.getType().equals("EAMT"))
			{

			}
			else if (sr.getType().equals("TPLT"))
			{

			}
			else if (sr.getType().equals("PNAM"))
			{

			}
			else if (sr.getType().equals("NAM4"))
			{

			}
			else if (sr.getType().equals("NAM5"))
			{

			}
			else if (sr.getType().equals("VTCK"))
			{

			}
			else if (sr.getType().equals("CNAM"))
			{

			}
			else if (sr.getType().equals("DEST"))
			{

			}
			else if (sr.getType().equals("DSTD"))
			{

			}
			else if (sr.getType().equals("DSTF"))
			{

			}
			else if (sr.getType().equals("LNAM"))
			{

			}
			else if (sr.getType().equals("EITM"))
			{

			}
			else if (sr.getType().equals("COED"))
			{

			}

			else
			{
				System.out.println("unhandled : " + sr.getType() + " in record " + recordData + " in " + this);
			}

			//extract data data
			if (DATA != null)
			{
				unknown1 = ESMByteConvert.extractByte(DATA.data, 0);
				combat = ESMByteConvert.extractByte(DATA.data, 1);
				magic = ESMByteConvert.extractByte(DATA.data, 2);
				Soul = ESMByteConvert.extractShort(DATA.data, 3);
				health = ESMByteConvert.extractShort(DATA.data, 5);
				unknown2 = ESMByteConvert.extractShort(DATA.data, 7);
				damage = ESMByteConvert.extractShort(DATA.data, 9);
				Str = ESMByteConvert.extractByte(DATA.data, 11);
				Int = ESMByteConvert.extractByte(DATA.data, 12);
				Wil = ESMByteConvert.extractByte(DATA.data, 13);
				Agi = ESMByteConvert.extractByte(DATA.data, 14);
				Spd = ESMByteConvert.extractByte(DATA.data, 15);
				End = ESMByteConvert.extractByte(DATA.data, 16);
				//				Per = ByteConvert.extractByte(DATA.data, 17);
				//				Luc = ByteConvert.extractByte(DATA.data, 18);
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

	public class BNAM
	{
		public float baseScale;

		public BNAM(byte[] bytes)
		{
			baseScale = ESMByteConvert.extractFloat(bytes, 0);
		}
	}

	public class RNAM
	{
		public byte attackReach;

		public RNAM(byte[] bytes)
		{
			attackReach = ESMByteConvert.extractByte(bytes, 0);
		}
	}

	public class CSDT
	{
		public int soundType;

		public FormID csdi;

		public CSDC csdc;

		public CSDT(byte[] bytes)
		{
			soundType = ESMByteConvert.extractInt(bytes, 0);
		}
	}

	public class TNAM
	{
		public float turningSpeed;

		public TNAM(byte[] bytes)
		{
			turningSpeed = ESMByteConvert.extractFloat(bytes, 0);
		}
	}
}
