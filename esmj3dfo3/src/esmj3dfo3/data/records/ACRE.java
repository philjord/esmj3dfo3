package esmj3dfo3.data.records;

import java.util.ArrayList;

import utils.ESMByteConvert;
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
			byte[] bs = sr.getSubrecordData();

			if (sr.getSubrecordType().equals("EDID"))
			{
				EDID = new ZString(bs);
			}
			else if (sr.getSubrecordType().equals("NAME"))
			{
				NAME = new FormID(bs);
			}
			else if (sr.getSubrecordType().equals("XESP"))
			{
				XESP = new FormID(bs);
			}
			else if (sr.getSubrecordType().equals("XOWN"))
			{
				XOWN = new FormID(bs);
			}
			else if (sr.getSubrecordType().equals("XGLB"))
			{
				XGLB = new FormID(bs);
			}
			else if (sr.getSubrecordType().equals("XSCL"))
			{
				scale = ESMByteConvert.extractFloat(bs, 0);
			}
			else if (sr.getSubrecordType().equals("DATA"))
			{
				this.extractInstData(bs);
			}
			else if (sr.getSubrecordType().equals("XRGD"))
			{
				XRGD = new XRGD(bs);
			}
			else if (sr.getSubrecordType().equals("XMRC"))
			{

			}
			else if (sr.getSubrecordType().equals("XLKR"))
			{

			}
			else if (sr.getSubrecordType().equals("XLCM"))
			{

			}
			else if (sr.getSubrecordType().equals("XAPD"))
			{

			}
			else if (sr.getSubrecordType().equals("XAPR"))
			{

			}else if (sr.getSubrecordType().equals("XEZN"))
			{

			}else if (sr.getSubrecordType().equals("XRGB"))
			{

			}
			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in " + recordData);
			}

		}
	}

}
