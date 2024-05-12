package esmj3dfo3.data.records;

import java.util.List;

import esfilemanager.common.data.record.Record;
import esfilemanager.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;


public class INGR extends RECO
{
	

	public INGR(Record recordData)
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
			else if (sr.getSubrecordType().equals("EFID"))
			{
			}
			else if (sr.getSubrecordType().equals("EFIT"))
			{
			}
			else if (sr.getSubrecordType().equals("ENID"))
			{
			}
			else if (sr.getSubrecordType().equals("ENIT"))
			{
			}
			else if (sr.getSubrecordType().equals("ETYP"))
			{
			}
			else if (sr.getSubrecordType().equals("DATA"))
			{
			}
			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in record " + recordData + " in " + this);
			}
		}
	}

}
