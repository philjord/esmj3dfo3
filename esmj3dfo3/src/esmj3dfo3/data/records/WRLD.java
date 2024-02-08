package esmj3dfo3.data.records;

import java.util.List;

import esfilemanager.common.data.record.Record;
import esfilemanager.common.data.record.Subrecord;
import esmj3d.data.shared.records.CommonWRLD;
import esmj3d.data.shared.subrecords.ZString;
import esmj3dfo3.data.subrecords.SNAM_d;
import tools.io.ESMByteConvert;


// skyrim is after fo3 so it's between these 2
//https://en.uesp.net/wiki/Oblivion_Mod:Mod_File_Format/WRLD
// FO3?	
//https://en.uesp.net/wiki/Skyrim_Mod:Mod_File_Format/WRLD

//https://geck.uesp.net/wiki/Main_Page might describe what's possible

public class WRLD extends CommonWRLD
{
	public SNAM_d SNAM = null;

	public ZString ICON = null;
	
	public int PNAM = 0;

	public WRLD(Record recordData)
	{
		super(recordData);
		List<Subrecord> subrecords = recordData.getSubrecords();
		for (int i = 0; i < subrecords.size(); i++)
		{
			Subrecord sr = subrecords.get(i);
			byte[] bs = sr.getSubrecordData();

			if (sr.getSubrecordType().equals("SNAM"))
			{
				SNAM = new SNAM_d(bs);
			}
			else if (sr.getSubrecordType().equals("ICON"))
			{
				ICON = new ZString(bs);
			}
			else if (sr.getSubrecordType().equals("NAM0"))
			{
				//
			}
			else if (sr.getSubrecordType().equals("NAM9"))
			{
				//
			}
			else if (sr.getSubrecordType().equals("OFST"))
			{
				//
			}
			else if (sr.getSubrecordType().equals("MNAM"))
			{
				//
			}

			else if (sr.getSubrecordType().equals("XEZN"))
			{
				//
			}
			else if (sr.getSubrecordType().equals("PNAM"))
			{
				PNAM = ESMByteConvert.extractShort(bs, 0);
				/*PNAM 	unknown 	uint16 	Use flags - Set if parts are inherited from parent worldspace WNAM
				    0x01 - Use Land Data (DNAM)
				    0x02 - Use LOD Data (NAM3, NAM4)
				    0x04 - Use Map Data (MNAM, MODL)
				    0x08 - Use Water Data (NAM2)
				    0x10 - unknown
				    0x20 - Use Climate Data (CNAM)
				    0x40 - Use Sky Cell 
				    */
			}
			else if (sr.getSubrecordType().equals("NAM3"))
			{
				//
			}
			else if (sr.getSubrecordType().equals("NAM4"))
			{
				//
			}
			else if (sr.getSubrecordType().equals("ONAM"))
			{
				//
			}
			else if (sr.getSubrecordType().equals("INAM"))
			{
				//
			}
			else if (sr.getSubrecordType().equals("ZNAM"))
			{
				//
			}
			else if (sr.getSubrecordType().equals("NNAM"))
			{
				//
			}
			else if (sr.getSubrecordType().equals("XNAM"))
			{
				//
			}
			else
			{
				//	System.out.println("unhandled : " + sr.getSubrecordType() + " in record " + recordData + " in " + this);
			}
		}
	}

}
