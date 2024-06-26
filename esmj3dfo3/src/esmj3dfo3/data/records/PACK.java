package esmj3dfo3.data.records;

import java.util.List;

import esfilemanager.common.data.record.Record;
import esfilemanager.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;


public class PACK extends RECO
{

	

	public PACK(Record recordData)
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
			else if (sr.getSubrecordType().equals("PKDT"))
			{

			}
			else if (sr.getSubrecordType().equals("PSDT"))
			{

			}
			else if (sr.getSubrecordType().equals("DATA"))
			{

			}
			else if (sr.getSubrecordType().equals("PTDT"))
			{

			}
			else if (sr.getSubrecordType().equals("CTDA"))
			{

			}
			else if (sr.getSubrecordType().equals("PKDD"))
			{

			}
			else if (sr.getSubrecordType().equals("POBA"))
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
			else if (sr.getSubrecordType().equals("POEA"))
			{

			}
			else if (sr.getSubrecordType().equals("POCA"))
			{

			}
			else if (sr.getSubrecordType().equals("PLDT"))
			{

			}
			else if (sr.getSubrecordType().equals("SCDA"))
			{

			}
			else if (sr.getSubrecordType().equals("SCTX"))
			{

			}
			else if (sr.getSubrecordType().equals("PKPT"))
			{

			}
			else if (sr.getSubrecordType().equals("PLD2"))
			{

			}
			else if (sr.getSubrecordType().equals("SCRO"))
			{

			}
			else if (sr.getSubrecordType().equals("PKW3"))
			{

			}
			else if (sr.getSubrecordType().equals("DATA"))
			{

			}
			else if (sr.getSubrecordType().equals("PTD2"))
			{

			}
			else if (sr.getSubrecordType().equals("PKFD"))
			{

			}
			else if (sr.getSubrecordType().equals("PKAM"))
			{

			}
			else if (sr.getSubrecordType().equals("PUID"))
			{

			}
			else if (sr.getSubrecordType().equals("CNAM"))
			{

			}
			else if (sr.getSubrecordType().equals("IDLF"))
			{

			}
			else if (sr.getSubrecordType().equals("IDLC"))
			{

			}
			else if (sr.getSubrecordType().equals("IDLT"))
			{

			}
			else if (sr.getSubrecordType().equals("IDLA"))
			{

			}
			else if (sr.getSubrecordType().equals("IDLB"))
			{

			}
			else if (sr.getSubrecordType().equals("PKED"))
			{

			}
			else if (sr.getSubrecordType().equals("PKE2"))
			{

			}
			else if (sr.getSubrecordType().equals("SLSD"))
			{

			}
			else if (sr.getSubrecordType().equals("SCVR"))
			{

			}
			else if (sr.getSubrecordType().equals("SCRV"))
			{

			}
			else
			{
				System.out.println("unhandled : " + sr.getSubrecordType() + " in record " + recordData + " in " + this);
			}

		}
	}
}
