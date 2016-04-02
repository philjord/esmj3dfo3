package esmj3dfo3.data.records;

import java.util.ArrayList;
import java.util.List;

import esmj3d.data.shared.records.CommonREFR;
import esmj3d.data.shared.subrecords.FormID;
import esmj3d.data.shared.subrecords.XMBO;
import esmj3d.data.shared.subrecords.XPRM;
import esmj3dfo3.data.subrecords.XSED;
import esmmanager.common.data.record.Record;
import esmmanager.common.data.record.Subrecord;

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

		List<Subrecord> subrecords = recordData.getSubrecords();
		for (int i = 0; i < subrecords.size(); i++)
		{
			Subrecord sr = subrecords.get(i);
			byte[] bs = sr.getSubrecordData();

			//also in tes5
			if (sr.getSubrecordType().equals("XPRM"))
			{
				XPRM = new XPRM(bs);
			}
			else if (sr.getSubrecordType().equals("XMBO"))
			{
				XMBO = new XMBO(bs);
			}
			else if (sr.getSubrecordType().equals("XRMR"))
			{
				XRMR = bs;
			}
			else if (sr.getSubrecordType().equals("XLRM"))
			{
				XLMRs.add(new FormID(bs));
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
			else if (sr.getSubrecordType().equals("XTRI"))
			{
			}
			else if (sr.getSubrecordType().equals("XOCP"))
			{
			}
			else if (sr.getSubrecordType().equals("XMBR"))
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
			else if (sr.getSubrecordType().equals("XNDP"))
			{
			}
			else if (sr.getSubrecordType().equals("SCTX"))
			{
			}

			//not in tes5
			else if (sr.getSubrecordType().equals("XSED"))
			{
				XSED = new XSED(bs);
			}
			else if (sr.getSubrecordType().equals("XRDS"))
			{
			}
			else if (sr.getSubrecordType().equals("XHLP"))
			{
			}
			else if (sr.getSubrecordType().equals("XLTW"))
			{
			}
			else if (sr.getSubrecordType().equals("XORD"))
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
			else if (sr.getSubrecordType().equals("XIBS"))
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
			else if (sr.getSubrecordType().equals("MMRK"))
			{
			}
			else if (sr.getSubrecordType().equals("CNAM"))
			{
			}
			else if (sr.getSubrecordType().equals("BNAM"))
			{
			}
			else if (sr.getSubrecordType().equals("MNAM"))
			{
			}
			else if (sr.getSubrecordType().equals("NNAM"))
			{
			}
			else if (sr.getSubrecordType().equals("XSRF"))
			{
			}
			else if (sr.getSubrecordType().equals("XSRD"))
			{
			}
			else if (sr.getSubrecordType().equals("XATO"))
			{
			}
			else if (sr.getSubrecordType().equals("WMI1"))
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
