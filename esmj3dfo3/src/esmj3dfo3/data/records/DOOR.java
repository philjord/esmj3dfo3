package esmj3dfo3.data.records;

import java.util.ArrayList;

import tools.io.ESMByteConvert;
import esmLoader.common.data.record.Record;
import esmLoader.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.FormID;
import esmj3d.data.shared.subrecords.LString;
import esmj3d.data.shared.subrecords.MODL;
import esmj3d.data.shared.subrecords.ZString;

public class DOOR extends RECO
{
	public ZString EDID;

	public LString FULL;

	public FormID SCRI;

	public MODL MODL;

	public int SNAM = -1; //open sound

	public int ANAM = -1; //close sound

	public byte FNAM = 0; //flags

	public DOOR(Record recordData)
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
			else if (sr.getSubrecordType().equals("FULL"))
			{
				FULL = new LString(bs);
			}
			else if (sr.getSubrecordType().equals("SCRI"))
			{
				SCRI = new FormID(bs);
			}
			else if (sr.getSubrecordType().equals("MODL"))
			{
				MODL = new MODL(bs);
			}
			else if (sr.getSubrecordType().equals("MODB"))
			{
				MODL.addMODBSub(bs);
			}
			else if (sr.getSubrecordType().equals("MODT"))
			{
				MODL.addMODTSub(bs);
			}
			else if (sr.getSubrecordType().equals("SNAM"))
			{
				SNAM = ESMByteConvert.extractInt(bs, 0);
			}
			else if (sr.getSubrecordType().equals("ANAM"))
			{
				ANAM = ESMByteConvert.extractInt(bs, 0);
			}
			else if (sr.getSubrecordType().equals("FNAM"))
			{
				FNAM = bs[0];
			}
			else if (sr.getSubrecordType().equals("OBND"))
			{

			}
			else if (sr.getSubrecordType().equals("DSTF"))
			{

			}
			else if (sr.getSubrecordType().equals("DEST"))
			{

			}
			else if (sr.getSubrecordType().equals("MODS"))
			{

			}
			else if (sr.getSubrecordType().equals("DMDL"))
			{

			}
			else if (sr.getSubrecordType().equals("DSTD"))
			{

			}
			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in " + recordData);
			}
		}
	}

	public String showDetails()
	{
		return "DOOR : (" + formId + "|" + Integer.toHexString(formId) + ") " + EDID.str;
	}

}
