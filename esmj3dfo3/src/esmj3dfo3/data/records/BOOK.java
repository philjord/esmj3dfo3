package esmj3dfo3.data.records;

import java.util.List;

import esfilemanager.common.data.record.Record;
import esfilemanager.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.DESC;
import esmj3d.data.shared.subrecords.FormID;
import esmj3d.data.shared.subrecords.LString;
import esmj3d.data.shared.subrecords.MODL;
import esmj3d.data.shared.subrecords.ZString;


public class BOOK extends RECO
{
	

	public LString FULL;

	public DATA DATA;

	public MODL MODL;

	public String ICON;

	public DESC DESC;

	public FormID SCRI;

	/*
	 * DATA Subrecord
	 
	 This subrecord is always 10 bytes long (confirmed) and holds the book data.
	 Name 	Type/Size 	Info
	 Flags 	1 (byte) 	Book flags
	 
	 0x0001 = Scroll 
	 0x0002 = Can't be taken 
	 
	 Teaches 	1 (byte) 	Which skill the book teaches. See TES4Mod:Skill Indices for details. Set to 0xFF if no skill is taught.
	 Value 	4 (word) 	Book value
	 Weight 	4 (float) 	Book weight
	 */
	public BOOK(Record recordData)
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
			else if (sr.getSubrecordType().equals("DESC"))
			{
				DESC = new DESC(bs);
			}
			else if (sr.getSubrecordType().equals("DATA"))
			{
				DATA = new DATA(bs);
			}
			else if (sr.getSubrecordType().equals("MODL"))
			{
				MODL = new MODL(bs);
			}
			else if (sr.getSubrecordType().equals("MODT"))
			{
				MODL.addMODTSub(bs);
			}
			else if (sr.getSubrecordType().equals("ICON"))
			{
				ICON = ZString.toString(bs);
			}
			else if (sr.getSubrecordType().equals("SCRI"))
			{
				SCRI = new FormID(bs);
			}
			else if (sr.getSubrecordType().equals("OBND"))
			{

			}
			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in record " + recordData + " in " + this);
			}
		}
	}

	@Override
	public String showDetails()
	{
		return super.showDetails() + " : " + (MODL != null ? MODL.model : "");
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
