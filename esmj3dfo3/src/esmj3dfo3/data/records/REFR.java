package esmj3dfo3.data.records;

import java.util.ArrayList;

import utils.ESMByteConvert;
import esmLoader.common.data.record.Record;
import esmLoader.common.data.record.Subrecord;
import esmj3d.data.shared.records.InstRECO;
import esmj3d.data.shared.subrecords.FormID;
import esmj3d.data.shared.subrecords.XTEL;
import esmj3d.data.shared.subrecords.ZString;
import esmj3dfo3.data.subrecords.TNAM_c;
import esmj3dfo3.data.subrecords.XACT;
import esmj3dfo3.data.subrecords.XCNT;
import esmj3dfo3.data.subrecords.XESP_b;
import esmj3dfo3.data.subrecords.XLCM;
import esmj3dfo3.data.subrecords.XLOC;
import esmj3dfo3.data.subrecords.XLOD;
import esmj3dfo3.data.subrecords.XSED;

public class REFR extends InstRECO
{
	public FormID NAME;

	public ZString EDID;

	public FormID XOWN;

	public XTEL XTEL;

	public FormID XTRG;

	public XSED XSED;

	public XLOD XLOD;

	public XLOC XLOC;

	public XESP_b XESP;

	public XLCM XLCM;

	public XACT XACT;

	public XCNT XCNT;

	public TNAM_c TNAM;

	public byte[] XPRM; // primitve data for bounds type objects

	public byte[] XMBO; // multi bounds objects info

	public int XRMR = 0; //related to multi bounds somehow

	public ArrayList<Integer> XLMRs = new ArrayList<Integer>(); // multi bounds references to other objects in collection

	public boolean ONAM = false;

	public REFR(Record recordData)
	{
		super(recordData);

		ArrayList<Subrecord> subrecords = recordData.getSubrecords();
		for (int i = 0; i < subrecords.size(); i++)
		{
			Subrecord sr = subrecords.get(i);
			byte[] bs = sr.getSubrecordData();

			if (sr.getSubrecordType().equals("NAME"))
			{
				NAME = new FormID(bs);
			}
			else if (sr.getSubrecordType().equals("EDID"))
			{
				EDID = new ZString(bs);
			}
			else if (sr.getSubrecordType().equals("OBND"))
			{

			}
			else if (sr.getSubrecordType().equals("XMRK"))
			{

			}
			else if (sr.getSubrecordType().equals("FNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("FULL"))
			{

			}
			else if (sr.getSubrecordType().equals("XOWN"))
			{
				XOWN = new FormID(bs);
			}
			else if (sr.getSubrecordType().equals("XSCL"))
			{
				scale = ESMByteConvert.extractFloat(bs, 0);
			}
			else if (sr.getSubrecordType().equals("XTEL"))
			{
				XTEL = new XTEL(bs);
			}
			else if (sr.getSubrecordType().equals("XTRG"))
			{
				XTRG = new FormID(bs);
			}
			else if (sr.getSubrecordType().equals("XSED"))
			{
				XSED = new XSED(bs);
			}
			else if (sr.getSubrecordType().equals("XLOD"))
			{
				XLOD = new XLOD(bs);
			}

			else if (sr.getSubrecordType().equals("XLOC"))
			{
				XLOC = new XLOC(bs);
			}
			else if (sr.getSubrecordType().equals("XESP"))
			{
				XESP = new XESP_b(bs);
			}
			else if (sr.getSubrecordType().equals("XLCM"))
			{
				XLCM = new XLCM(bs);
			}
			else if (sr.getSubrecordType().equals("XACT"))
			{
				XACT = new XACT(bs);
			}
			else if (sr.getSubrecordType().equals("XCNT"))
			{
				XCNT = new XCNT(bs);
			}
			else if (sr.getSubrecordType().equals("TNAM"))
			{
				TNAM = new TNAM_c(bs);
			}
			else if (sr.getSubrecordType().equals("ONAM"))
			{
				ONAM = true;
			}
			else if (sr.getSubrecordType().equals("DATA"))
			{
				this.extractInstData(bs);
			}
			else if (sr.getSubrecordType().equals("XRDS"))
			{

			}
			else if (sr.getSubrecordType().equals("XPRM"))
			{
				XPRM = bs;
			}
			else if (sr.getSubrecordType().equals("XMBO"))
			{
				// multibounds object
				XMBO = bs;
			}
			else if (sr.getSubrecordType().equals("XRMR"))
			{
				XRMR = ESMByteConvert.extractInt(bs, 0);
			}
			else if (sr.getSubrecordType().equals("XLRM"))
			{
				XLMRs.add(ESMByteConvert.extractInt(bs, 0));
			}

			else if (sr.getSubrecordType().equals("XEMI"))
			{

			}
			else if (sr.getSubrecordType().equals("XRGD"))
			{

			}
			else if (sr.getSubrecordType().equals("XAPD"))
			{

			}
			else if (sr.getSubrecordType().equals("XAPR"))
			{

			}
			else if (sr.getSubrecordType().equals("XLKR"))
			{

			}
			else if (sr.getSubrecordType().equals("XPWR"))
			{

			}
			else if (sr.getSubrecordType().equals("XPOD"))
			{

			}
			else if (sr.getSubrecordType().equals("XHLP"))
			{

			}
			else if (sr.getSubrecordType().equals("XTRI"))
			{

			}
			else if (sr.getSubrecordType().equals("XLTW"))
			{

			}
			else if (sr.getSubrecordType().equals("XOCP"))
			{

			}
			else if (sr.getSubrecordType().equals("XORD"))
			{

			}
			else if (sr.getSubrecordType().equals("XMBR"))
			{

			}
			else if (sr.getSubrecordType().equals("XRAD"))
			{

			}
			else if (sr.getSubrecordType().equals("XAMT"))
			{

			}
			else if (sr.getSubrecordType().equals("XAMC"))
			{

			}
			else if (sr.getSubrecordType().equals("RCLR"))
			{

			}
			else if (sr.getSubrecordType().equals("XPRD"))
			{

			}
			else if (sr.getSubrecordType().equals("XPPA"))
			{

			}
			else if (sr.getSubrecordType().equals("INAM"))
			{

			}
			else if (sr.getSubrecordType().equals("SCHR"))
			{

			}
			else if (sr.getSubrecordType().equals("XIBS"))
			{

			}
			else if (sr.getSubrecordType().equals("XNDP"))
			{

			}
			else if (sr.getSubrecordType().equals("XRDO"))
			{

			}
			else if (sr.getSubrecordType().equals("XCLP"))
			{

			}
			else if (sr.getSubrecordType().equals("SCDA"))
			{

			}
			else if (sr.getSubrecordType().equals("SCRO"))
			{

			}
			else if (sr.getSubrecordType().equals("SCTX"))
			{

			}else if (sr.getSubrecordType().equals("MMRK"))
			{

			}else if (sr.getSubrecordType().equals("CNAM"))
			{

			}else if (sr.getSubrecordType().equals("BNAM"))
			{

			}else if (sr.getSubrecordType().equals("MNAM"))
			{

			}else if (sr.getSubrecordType().equals("NNAM"))
			{

			}else if (sr.getSubrecordType().equals("XSRF"))
			{

			}else if (sr.getSubrecordType().equals("XSRD"))
			{

			}else if (sr.getSubrecordType().equals("XATO"))
			{

			}else if (sr.getSubrecordType().equals("WMI1"))
			{

			}
			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in " + recordData);
			}
		}

	}

}
