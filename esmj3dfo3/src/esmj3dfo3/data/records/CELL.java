package esmj3dfo3.data.records;

import java.util.ArrayList;

import tools.io.ESMByteConvert;
import esmLoader.common.data.record.Record;
import esmLoader.common.data.record.Subrecord;
import esmj3d.data.shared.records.InstRECO;
import esmj3d.data.shared.subrecords.LString;
import esmj3d.data.shared.subrecords.ZString;
import esmj3dfo3.data.subrecords.XCLR;

public class CELL extends InstRECO
{
	public ZString EDID;

	public LString FULL;

	public DATA DATA;

	public byte musicType = 1;

	public int XOWN = -1;

	public int XGLB = -1;

	public int XCCM = -1;

	public int XCWT = -1;

	public int XRNK = 0;

	public byte[] XCLL = null; //Lighting for interior cell

	public XCLR[] XCLRs; // array of region ids

	public float XCLW = Float.NEGATIVE_INFINITY; //water height if not 0

	public CELL(Record recordData)
	{
		super(recordData);

		ArrayList<Subrecord> subrecords = recordData.getSubrecords();
		for (int i = 0; i < subrecords.size(); i++)
		{
			Subrecord sr = subrecords.get(i);
			byte[] bs = sr.getSubrecordData();

			ArrayList<XCLR> XCLRsl = new ArrayList<XCLR>();

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
			else if (sr.getSubrecordType().equals("XCLL"))
			{
				XCLL = bs;
			}
			else if (sr.getSubrecordType().equals("XCLC"))
			{
				x = ESMByteConvert.extractInt(bs, 0);
				y = ESMByteConvert.extractInt(bs, 4);

				//8-12? another int?
			}
			else if (sr.getSubrecordType().equals("XCLR"))
			{
				XCLRsl.add(new XCLR(bs));
			}
			else if (sr.getSubrecordType().equals("XCLW"))
			{
				XCLW = ESMByteConvert.extractFloat(bs, 0);
			}
			else if (sr.getSubrecordType().equals("XCWT"))
			{
				XCWT = ESMByteConvert.extractInt(bs, 0);
			}
			else if (sr.getSubrecordType().equals("XOWN"))
			{
				XOWN = ESMByteConvert.extractInt(bs, 0);
			}
			else if (sr.getSubrecordType().equals("XCMT"))
			{
				musicType = bs[0];
			}
			else if (sr.getSubrecordType().equals("XRNK"))
			{
				XRNK = ESMByteConvert.extractInt(bs, 0);
			}
			else if (sr.getSubrecordType().equals("LTMP"))
			{

			}
			else if (sr.getSubrecordType().equals("LNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("XCIM"))
			{

			}
			else if (sr.getSubrecordType().equals("XEZN"))
			{

			}
			else if (sr.getSubrecordType().equals("XCAS"))
			{

			}
			else if (sr.getSubrecordType().equals("XCMO"))
			{

			}
			else if (sr.getSubrecordType().equals("XNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("XCET"))
			{

			}
			else if (sr.getSubrecordType().equals("XCCM"))
			{

			}
			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in " + recordData);
			}

			XCLRs = new XCLR[XCLRsl.size()];
			XCLRsl.toArray(XCLRs);
		}
	}

	public String showDetails()
	{
		return "CELL : (" + formId + "|" + Integer.toHexString(formId) + ") " + EDID.str + " : " + FULL.str;
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
