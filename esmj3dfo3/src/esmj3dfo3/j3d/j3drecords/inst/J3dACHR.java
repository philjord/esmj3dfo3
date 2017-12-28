package esmj3dfo3.j3d.j3drecords.inst;

import esmio.common.data.record.IRecordStore;
import esmio.common.data.record.Record;
import esmj3d.j3d.j3drecords.inst.J3dRECOChaInst;
import esmj3dfo3.data.records.ACHR;
import esmj3dfo3.data.records.NPC_;
import esmj3dfo3.j3d.j3drecords.type.J3dNPC_;
import utils.source.MediaSources;

public class J3dACHR extends J3dRECOChaInst
{
	public J3dACHR(ACHR achr, IRecordStore master, MediaSources mediaSources)
	{
		super(achr);
		Record baseRecord = master.getRecord(achr.NAME.formId);
		if (baseRecord.getRecordType().equals("NPC_"))
		{
			NPC_ npc_ = new NPC_(baseRecord);
			setJ3dRECOType(new J3dNPC_(npc_, master, mediaSources));
		}
		else
		{
			System.out.println("ACHR record type not converted to j3d " + baseRecord.getRecordType());
		}
	}
}
