package esmj3dfo3.data.records;

import java.util.ArrayList;

import tools.io.ESMByteConvert;
import esmLoader.common.data.record.Record;
import esmLoader.common.data.record.Subrecord;
import esmj3d.data.shared.records.CommonCELL;
import esmj3d.data.shared.subrecords.FormID;

public class CELL extends CommonCELL
{

	public DATA DATA;

	public byte musicType = 1;

	public int XRNK = 0;

	public FormID LTMP = null;

	public FormID XCMO = null;

	public FormID XCAS = null;

	public FormID XEZN = null;

	public FormID XCIM;

	public CELL(Record recordData)
	{
		super(recordData);

		ArrayList<Subrecord> subrecords = recordData.getSubrecords();
		for (int i = 0; i < subrecords.size(); i++)
		{
			Subrecord sr = subrecords.get(i);
			byte[] bs = sr.getSubrecordData();

			if (sr.getSubrecordType().equals("DATA"))
			{
				DATA = new DATA(bs);
			}
			// in tes4
			else if (sr.getSubrecordType().equals("XCMT"))
			{
				musicType = bs[0];
			}
			else if (sr.getSubrecordType().equals("XRNK"))
			{
				XRNK = ESMByteConvert.extractInt(bs, 0);
			}
			// in tes5
			else if (sr.getSubrecordType().equals("LNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("LTMP"))
			{
				LTMP = new FormID(bs);
			}
			else if (sr.getSubrecordType().equals("XCMO"))
			{
				XCMO = new FormID(bs);
			}
			else if (sr.getSubrecordType().equals("XCIM"))
			{
				XCIM = new FormID(bs);
			}
			else if (sr.getSubrecordType().equals("XCAS"))
			{
				XCAS = new FormID(bs);
			}
			else if (sr.getSubrecordType().equals("XEZN"))
			{
				XEZN = new FormID(bs);
			}
			// diff from xnam in tes5
			else if (sr.getSubrecordType().equals("XNAM"))
			{

			}
			// only in fo3
			else if (sr.getSubrecordType().equals("XCET"))
			{

			}
			else
			{
				// no longer possible with CommonCELL
				//System.out.println("unhandled : " + sr.getSubrecordType() + " in record " + recordData + " in " + this);
			}

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
