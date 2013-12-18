package esmj3dfo3.data.records;

import java.util.ArrayList;

import tools.io.ESMByteConvert;
import esmLoader.common.data.record.Record;
import esmLoader.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.DESC;
import esmj3d.data.shared.subrecords.FormID;
import esmj3d.data.shared.subrecords.LString;
import esmj3d.data.shared.subrecords.MODB;
import esmj3d.data.shared.subrecords.MODL;
import esmj3d.data.shared.subrecords.ZString;
import esmj3dfo3.data.subrecords.DNAM;
import esmj3dfo3.data.subrecords.FGGA;
import esmj3dfo3.data.subrecords.FGGS;
import esmj3dfo3.data.subrecords.FGTS;
import esmj3dfo3.data.subrecords.PNAM;
import esmj3dfo3.data.subrecords.SNAM_c;
import esmj3dfo3.data.subrecords.UNAM;
import esmj3dfo3.data.subrecords.XNAM;

public class RACE extends RECO
{
	public ZString EDID = null;

	public LString FULL = null;

	public DESC DESC = null;

	public XNAM XNAM = null;

	public DATA DATA = null;

	public DNAM DNAM = null;

	public CNAM_b CNAM = null;

	public ATTR ATTR = null;

	public boolean NAM0 = false;

	// each index is an int idx and may be followed by a modl/modb/icon 
	public INDX[] INDXs = null;

	public MODL[] MODLs = null;

	public MODB[] MODBs = null;

	public ZString[] ICONs = null;

	public boolean NAM1 = false;

	public boolean MNAM = false;

	public boolean FNAM = false;

	public HNAM_b HNAM = null;

	public FormID ENAM = null;

	public FGGS FGGS = null;

	public FGGA FGGA = null;

	public FGTS FGTS = null;

	public SNAM_c SNAM = null;

	public PNAM PNAM = null;

	public UNAM UNAM = null;

	//data data

	public RACE(Record recordData)
	{
		super(recordData);

		ArrayList<INDX> INDXsl = new ArrayList<INDX>();
		ArrayList<MODL> MODLsl = new ArrayList<MODL>();
		ArrayList<MODB> MODBsl = new ArrayList<MODB>();
		ArrayList<ZString> ICONsl = new ArrayList<ZString>();

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
			else if (sr.getType().equals("DESC"))
			{
				DESC = new DESC(bs);
			}
			else if (sr.getType().equals("DATA"))
			{
				DATA = new DATA(bs);
			}
			else if (sr.getType().equals("DNAM"))
			{
				DNAM = new DNAM(bs);
			}
			else if (sr.getType().equals("CNAM"))
			{
				CNAM = new CNAM_b(bs);
			}
			else if (sr.getType().equals("ATTR"))
			{
				ATTR = new ATTR(bs);
			}
			else if (sr.getType().equals("NAM0"))
			{
				NAM0 = true;
			}
			else if (sr.getType().equals("INDX"))
			{
				INDXsl.add(new INDX(bs));
			}
			else if (sr.getType().equals("MODL"))
			{
				MODLsl.add(new MODL(bs));
			}
			else if (sr.getType().equals("MODT"))
			{

			}
			else if (sr.getType().equals("ICON"))
			{
				ICONsl.add(new ZString(bs));
			}
			else if (sr.getType().equals("NAM1"))
			{
				NAM1 = true;
			}
			else if (sr.getType().equals("NAM2"))
			{
				NAM1 = true;
			}
			else if (sr.getType().equals("MNAM"))
			{
				MNAM = true;
			}
			else if (sr.getType().equals("FNAM"))
			{
				FNAM = true;
			}
			else if (sr.getType().equals("HNAM"))
			{
				HNAM = new HNAM_b(bs);
			}
			else if (sr.getType().equals("ENAM"))
			{
				ENAM = new FormID(bs);
			}
			else if (sr.getType().equals("FGGS"))
			{
				FGGS = new FGGS(bs);
			}
			else if (sr.getType().equals("FGGA"))
			{
				FGGA = new FGGA(bs);
			}
			else if (sr.getType().equals("FGTS"))
			{
				FGTS = new FGTS(bs);
			}
			else if (sr.getType().equals("SNAM"))
			{
				SNAM = new SNAM_c(bs);
			}
			else if (sr.getType().equals("PNAM"))
			{
				PNAM = new PNAM(bs);
			}
			else if (sr.getType().equals("UNAM"))
			{
				UNAM = new UNAM(bs);
			}
			else if (sr.getType().equals("YNAM"))
			{

			}
			else if (sr.getType().equals("ONAM"))
			{

			}
			else if (sr.getType().equals("VTCK"))
			{

			}
			else if (sr.getType().equals("MODD"))
			{

			}
			else
			{
				System.out.println("unhandled : " + sr.getType() + " in record " + recordData + " in " + this);
			}

			// transfer to arrays

			INDXs = new INDX[INDXsl.size()];
			INDXsl.toArray(INDXs);

			MODLs = new MODL[MODLsl.size()];
			MODLsl.toArray(MODLs);

			MODBs = new MODB[MODBsl.size()];
			MODBsl.toArray(MODBs);

			ICONs = new ZString[ICONsl.size()];
			ICONsl.toArray(ICONs);

			//extract data data
			if (DATA != null)
			{

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

	public class ATTR
	{
		public byte[] unknown;

		public ATTR(byte[] bytes)
		{
			unknown = bytes;
		}
	}

	public class CNAM_b
	{
		public byte unknown;

		public CNAM_b(byte[] bytes)
		{
			unknown = ESMByteConvert.extractByte(bytes, 0);
		}
	}

	public class HNAM_b
	{
		public byte[] unknown;

		public HNAM_b(byte[] bytes)
		{
			unknown = bytes;
		}
	}

	public class INDX
	{
		public int idx;

		public INDX(byte[] bytes)
		{
			idx = ESMByteConvert.extractInt(bytes, 0);
		}
	}

}
