package esmj3dfo3.data.records;

import java.util.ArrayList;

import esmLoader.common.data.record.Record;
import esmLoader.common.data.record.Subrecord;
import esmj3d.data.shared.records.CommonREFR;
import esmj3d.data.shared.subrecords.FormID;
import esmj3d.data.shared.subrecords.XMBO;
import esmj3d.data.shared.subrecords.XPRM;
import esmj3dfo3.data.subrecords.XSED;

public class REFR extends CommonREFR
{
	public XSED XSED;

	//OCCLUSION DATA
	public XPRM XPRM; // primitve data for bounds type objects, see occulsion in spacetrader

	//OCCLUSION DATA
	public XMBO XMBO; // multi bounds objects info 

	public byte[] XRMR; //XRMR 	reference marker 	struct 	ubyte - count of following XLRM, ubyte[3] - seems to be flags 0x10000 - seen in 0x000C6B47, 48 

	public ArrayList<FormID> XLMRs = new ArrayList<FormID>(); //XLRM 	location room marker 	formid 	REFR usually to a STAT

	public REFR(Record recordData)
	{
		super(recordData);

		ArrayList<Subrecord> subrecords = recordData.getSubrecords();
		for (int i = 0; i < subrecords.size(); i++)
		{
			Subrecord sr = subrecords.get(i);
			byte[] bs = sr.getData();

			//also in tes5
			if (sr.getType().equals("XPRM"))
			{
				XPRM = new XPRM(bs);
			}
			else if (sr.getType().equals("XMBO"))
			{
				XMBO = new XMBO(bs);
			}
			else if (sr.getType().equals("XRMR"))
			{
				XRMR = bs;
			}
			else if (sr.getType().equals("XLRM"))
			{
				XLMRs.add(new FormID(bs));
			}
			else if (sr.getType().equals("XEMI"))
			{
			}
			else if (sr.getType().equals("XRGD"))
			{
			}
			else if (sr.getType().equals("XAPD"))
			{
			}
			else if (sr.getType().equals("XAPR"))
			{
			}
			else if (sr.getType().equals("XLKR"))
			{
			}
			else if (sr.getType().equals("XPWR"))
			{
			}
			else if (sr.getType().equals("XPOD"))
			{
			}
			else if (sr.getType().equals("XTRI"))
			{
			}
			else if (sr.getType().equals("XOCP"))
			{
			}
			else if (sr.getType().equals("XMBR"))
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
			else if (sr.getType().equals("XNDP"))
			{
			}
			else if (sr.getType().equals("SCTX"))
			{
			}

			//not in tes5
			else if (sr.getType().equals("XSED"))
			{
				XSED = new XSED(bs);
			}
			else if (sr.getType().equals("XRDS"))
			{
			}
			else if (sr.getType().equals("XHLP"))
			{
			}
			else if (sr.getType().equals("XLTW"))
			{
			}
			else if (sr.getType().equals("XORD"))
			{
			}
			else if (sr.getType().equals("XRAD"))
			{
			}
			else if (sr.getType().equals("XAMT"))
			{
			}
			else if (sr.getType().equals("XAMC"))
			{
			}
			else if (sr.getType().equals("RCLR"))
			{
			}
			else if (sr.getType().equals("XIBS"))
			{
			}
			else if (sr.getType().equals("XRDO"))
			{
			}
			else if (sr.getType().equals("XCLP"))
			{
			}
			else if (sr.getType().equals("SCDA"))
			{
			}
			else if (sr.getType().equals("SCRO"))
			{
			}
			else if (sr.getType().equals("MMRK"))
			{
			}
			else if (sr.getType().equals("CNAM"))
			{
			}
			else if (sr.getType().equals("BNAM"))
			{
			}
			else if (sr.getType().equals("MNAM"))
			{
			}
			else if (sr.getType().equals("NNAM"))
			{
			}
			else if (sr.getType().equals("XSRF"))
			{
			}
			else if (sr.getType().equals("XSRD"))
			{
			}
			else if (sr.getType().equals("XATO"))
			{
			}
			else if (sr.getType().equals("WMI1"))
			{
			}
			else
			{
				//CommonREFR makes this no use now
				//	System.out.println("unhandled : " + sr.getSubrecordType() + " in record " + recordData + " in " + this);
			}
		}

	}

}
