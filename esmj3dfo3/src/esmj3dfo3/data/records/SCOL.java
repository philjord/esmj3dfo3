package esmj3dfo3.data.records;

import java.util.ArrayList;

import esmLoader.common.data.record.Record;
import esmLoader.common.data.record.Subrecord;
import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.FormID;
import esmj3d.data.shared.subrecords.MODL;
import esmj3d.data.shared.subrecords.ZString;

public class SCOL extends RECO
{
	public ZString EDID = null;

	public MODL MODL = null;

	// pointers to forms of STAT that this collection was made up of, only useful for the GECK, not me.
	public ArrayList<DistantSTAT> distantSTATs = new ArrayList<DistantSTAT>();

	public SCOL(Record recordData)
	{
		super(recordData);
		ArrayList<Subrecord> subrecords = recordData.getSubrecords();
		for (int i = 0; i < subrecords.size(); i++)
		{
			Subrecord sr = subrecords.get(i);
			byte[] bs = sr.getData();

			if (sr.getType().equals("EDID"))
			{
				EDID = new ZString(bs);
			}
			else if (sr.getType().equals("OBND"))
			{

			}
			else if (sr.getType().equals("MODL"))
			{
				MODL = new MODL(bs);
			}
			else if (sr.getType().equals("MODT"))
			{
				MODL.addMODTSub(bs);
			}

			else if (sr.getType().equals("ONAM"))
			{
				distantSTATs.add(new DistantSTAT(bs));
			}
			else if (sr.getType().equals("DATA"))
			{
				distantSTATs.get(distantSTATs.size() - 1).setData(bs);
			}

			else
			{
				System.out.println("unhandled : " + sr.getType() + " in record " + recordData + " in " + this);
			}

		}
	}

	private class DistantSTAT
	{
		public FormID statFormId = null;

		// position data for each original piece
		public byte[] data = null;

		public DistantSTAT(byte[] bs)
		{
			statFormId = new FormID(bs);
		}

		public void setData(byte[] bs)
		{
			data = bs;
		}
	}
}
