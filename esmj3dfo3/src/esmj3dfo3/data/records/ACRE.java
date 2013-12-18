package esmj3dfo3.data.records;

import java.util.ArrayList;

import tools.io.ESMByteConvert;
import esmLoader.common.data.record.Record;
import esmLoader.common.data.record.Subrecord;
import esmj3d.data.shared.records.InstRECO;
import esmj3d.data.shared.subrecords.FormID;
import esmj3d.data.shared.subrecords.ZString;
import esmj3dfo3.data.subrecords.XRGD;

//TODO: does not appear in oblivion esm and I cna't load esp files yet
public class ACRE extends InstRECO
{

	public ZString EDID = null;

	public FormID NAME = null;

	public FormID XESP = null;

	public FormID XOWN = null;

	public FormID XGLB = null;

	public XRGD XRGD = null;

	public ACRE(Record recordData)
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
			else if (sr.getType().equals("NAME"))
			{
				NAME = new FormID(bs);
			}
			else if (sr.getType().equals("XESP"))
			{
				XESP = new FormID(bs);
			}
			else if (sr.getType().equals("XOWN"))
			{
				XOWN = new FormID(bs);
			}
			else if (sr.getType().equals("XGLB"))
			{
				XGLB = new FormID(bs);
			}
			else if (sr.getType().equals("XSCL"))
			{
				scale = ESMByteConvert.extractFloat(bs, 0);
			}
			else if (sr.getType().equals("DATA"))
			{
				this.extractInstData(bs);
			}
			else if (sr.getType().equals("XRGD"))
			{
				XRGD = new XRGD(bs);
			}
			else if (sr.getType().equals("XMRC"))
			{

			}
			else if (sr.getType().equals("XLKR"))
			{

			}
			else if (sr.getType().equals("XLCM"))
			{

			}
			else if (sr.getType().equals("XAPD"))
			{

			}
			else if (sr.getType().equals("XAPR"))
			{

			}
			else if (sr.getType().equals("XEZN"))
			{

			}
			else if (sr.getType().equals("XRGB"))
			{

			}
			else if (sr.getType().equals("XEMI"))
			{

			}
			else if (sr.getType().equals("XRDS"))
			{

			}
			else if (sr.getType().equals("XPRD"))
			{

			}
			else if (sr.getType().equals("XPPA"))
			{

			}
			else if (sr.getType().equals("INAM"))
			{

			}
			else if (sr.getType().equals("SCHR"))
			{

			}
			else if (sr.getType().equals("TNAM"))
			{

			}
			else if (sr.getType().equals("XATO"))
			{

			}
			else
			{
				System.out.println("unhandled : " + sr.getType() + " in record " + recordData + " in " + this);
			}

		}
	}
}
