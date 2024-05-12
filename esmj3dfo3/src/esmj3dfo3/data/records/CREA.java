package esmj3dfo3.data.records;

import java.util.ArrayList;
import java.util.List;

import esfilemanager.common.data.record.Record;
import esfilemanager.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.CNTO;
import esmj3d.data.shared.subrecords.FormID;
import esmj3d.data.shared.subrecords.LString;
import esmj3d.data.shared.subrecords.MODL;

import esmj3dfo3.data.subrecords.ACBS;
import esmj3dfo3.data.subrecords.AIDT;
import esmj3dfo3.data.subrecords.CSDC;
import esmj3dfo3.data.subrecords.KFFZ;
import esmj3dfo3.data.subrecords.NIFT;
import esmj3dfo3.data.subrecords.NIFZ;
import esmj3dfo3.data.subrecords.SNAM;
import esmj3dfo3.data.subrecords.WNAM;
import tools.io.ESMByteConvert;

public class CREA extends RECO
{
	

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
			else if (sr.getSubrecordType().equals("MODL"))
			{
				MODL = new MODL(bs);
			}
			else if (sr.getSubrecordType().equals("MODT"))
			{
				MODL.addMODTSub(bs);
			}
			else if (sr.getSubrecordType().equals("NIFZ"))
			{
				NIFZ = new NIFZ(bs);
			}
			else if (sr.getSubrecordType().equals("NIFT"))
			{
				NIFT = new NIFT(bs);
			}
			else if (sr.getSubrecordType().equals("ACBS"))
			{
				ACBS = new ACBS(bs);
			}
			else if (sr.getSubrecordType().equals("SNAM"))
			{
				SNAMs.add(new SNAM(bs));
			}
			else if (sr.getSubrecordType().equals("INAM"))
			{
				INAM = new FormID(bs);
			}
			else if (sr.getSubrecordType().equals("RNAM"))
			{
				RNAM = new RNAM(bs);
			}
			else if (sr.getSubrecordType().equals("SPLO"))
			{
				SPLOs.add(new FormID(bs));
			}
			else if (sr.getSubrecordType().equals("SCRI"))
			{
				SCRI = new FormID(bs);
			}
			else if (sr.getSubrecordType().equals("CNTO"))
			{
				CNTOs.add(new CNTO(bs));
			}
			else if (sr.getSubrecordType().equals("AIDT"))
			{
				AIDT = new AIDT(bs);
			}
			else if (sr.getSubrecordType().equals("PKID"))
			{
				PKIDs.add(new FormID(bs));
			}
			else if (sr.getSubrecordType().equals("DATA"))
			{
				DATA = new DATA(bs);
			}
			else if (sr.getSubrecordType().equals("ZNAM"))
			{
				ZNAM = new FormID(bs);
			}
			else if (sr.getSubrecordType().equals("CSCR"))
			{
				CSCR = new FormID(bs);
			}
			else if (sr.getSubrecordType().equals("CSDT"))
			{
				CSDT csdt = new CSDT(bs);
				i++;
				if (i < subrecords.size())
				{
					Subrecord sr2 = subrecords.get(i);
					csdt.csdi = new FormID(sr2.getSubrecordData());
					i++;
					if (i < subrecords.size())
					{
						Subrecord sr3 = subrecords.get(i);
						csdt.csdc = new CSDC(sr3.getSubrecordData());

					}
				}
				CSDTs.add(csdt);
			}
			else if (sr.getSubrecordType().equals("CSDI"))
			{
				//BNAM = new BNAM(bs);
			}
			else if (sr.getSubrecordType().equals("CSDC"))
			{
				//BNAM = new BNAM(bs);
			}
			else if (sr.getSubrecordType().equals("BNAM"))
			{
				BNAM = new BNAM(bs);
			}
			else if (sr.getSubrecordType().equals("TNAM"))
			{
				TNAM = new TNAM(bs);
			}
			else if (sr.getSubrecordType().equals("WNAM"))
			{
				WNAM = new WNAM(bs);
			}
			else if (sr.getSubrecordType().equals("KFFZ"))
			{
				KFFZ = new KFFZ(bs);
			}
			else if (sr.getSubrecordType().equals("OBND"))
			{

			}
			else if (sr.getSubrecordType().equals("EAMT"))
			{

			}
			else if (sr.getSubrecordType().equals("TPLT"))
			{

			}
			else if (sr.getSubrecordType().equals("PNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("NAM4"))
			{

			}
			else if (sr.getSubrecordType().equals("NAM5"))
			{

			}
			else if (sr.getSubrecordType().equals("VTCK"))
			{

			}
			else if (sr.getSubrecordType().equals("CNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("DEST"))
			{

			}
			else if (sr.getSubrecordType().equals("DSTD"))
			{

			}
			else if (sr.getSubrecordType().equals("DSTF"))
			{

			}
			else if (sr.getSubrecordType().equals("LNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("EITM"))
			{

			}
			else if (sr.getSubrecordType().equals("COED"))
			{

			}

			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in record " + recordData + " in " + this);
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
