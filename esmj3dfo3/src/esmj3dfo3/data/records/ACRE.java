package esmj3dfo3.data.records;

import java.util.List;

import esfilemanager.common.data.record.Record;
import esfilemanager.common.data.record.Subrecord;
import esmj3d.data.shared.records.InstRECO;
import esmj3d.data.shared.subrecords.FormID;
import esmj3d.data.shared.subrecords.XESP;

import esmj3dfo3.data.subrecords.XRGD;
import tools.io.ESMByteConvert;

//TODO: does not appear in oblivion esm and I cna't load esp files yet
public class ACRE extends InstRECO
{

	

	public FormID NAME = null;

	public FormID XESP = null;

	public FormID XOWN = null;

	public FormID XGLB = null;

	public XRGD XRGD = null;

	public ACRE(Record recordData)
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
			else if (sr.getSubrecordType().equals("NAME"))
			{
				NAME = new FormID(bs);
			}
			else if (sr.getSubrecordType().equals("XESP"))
			{
				xesp = new XESP(bs);
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

			}
			else if (sr.getSubrecordType().equals("XEZN"))
			{

			}
			else if (sr.getSubrecordType().equals("XRGB"))
			{

			}
			else if (sr.getSubrecordType().equals("XEMI"))
			{

			}
			else if (sr.getSubrecordType().equals("XRDS"))
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
			else if (sr.getSubrecordType().equals("TNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("XATO"))
			{

			}
			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in record " + recordData + " in " + this);
			}

		}
	}
}
