package esmj3dfo3.data;

import java.util.HashSet;
import java.util.List;

import esmj3d.data.shared.records.LAND;
import esmj3d.data.shared.records.LTEX;
import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.records.TXST;
import esmj3dfo3.data.records.ACHR;
import esmj3dfo3.data.records.ACRE;
import esmj3dfo3.data.records.ACTI;
import esmj3dfo3.data.records.ADDN;
import esmj3dfo3.data.records.ALCH;
import esmj3dfo3.data.records.AMMO;
import esmj3dfo3.data.records.ANIO;
import esmj3dfo3.data.records.ARMA;
import esmj3dfo3.data.records.ARMO;
import esmj3dfo3.data.records.ASPC;
import esmj3dfo3.data.records.AVIF;
import esmj3dfo3.data.records.BOOK;
import esmj3dfo3.data.records.BPTD;
import esmj3dfo3.data.records.CAMS;
import esmj3dfo3.data.records.CELL;
import esmj3dfo3.data.records.CLAS;
import esmj3dfo3.data.records.CLMT;
import esmj3dfo3.data.records.CONT;
import esmj3dfo3.data.records.CPTH;
import esmj3dfo3.data.records.CREA;
import esmj3dfo3.data.records.CSTY;
import esmj3dfo3.data.records.DEBR;
import esmj3dfo3.data.records.DIAL;
import esmj3dfo3.data.records.DOBJ;
import esmj3dfo3.data.records.DOOR;
import esmj3dfo3.data.records.ECZN;
import esmj3dfo3.data.records.EFSH;
import esmj3dfo3.data.records.ENCH;
import esmj3dfo3.data.records.EXPL;
import esmj3dfo3.data.records.EYES;
import esmj3dfo3.data.records.FACT;
import esmj3dfo3.data.records.FLST;
import esmj3dfo3.data.records.FURN;
import esmj3dfo3.data.records.GLOB;
import esmj3dfo3.data.records.GMST;
import esmj3dfo3.data.records.GRAS;
import esmj3dfo3.data.records.HAIR;
import esmj3dfo3.data.records.HDPT;
import esmj3dfo3.data.records.IDLE;
import esmj3dfo3.data.records.IDLM;
import esmj3dfo3.data.records.IMAD;
import esmj3dfo3.data.records.IMGS;
import esmj3dfo3.data.records.INGR;
import esmj3dfo3.data.records.IPCT;
import esmj3dfo3.data.records.IPDS;
import esmj3dfo3.data.records.KEYM;
import esmj3dfo3.data.records.LGTM;
import esmj3dfo3.data.records.LIGH;
import esmj3dfo3.data.records.LSCR;
import esmj3dfo3.data.records.LVLC;
import esmj3dfo3.data.records.LVLI;
import esmj3dfo3.data.records.LVLN;
import esmj3dfo3.data.records.MESG;
import esmj3dfo3.data.records.MGEF;
import esmj3dfo3.data.records.MICN;
import esmj3dfo3.data.records.MISC;
import esmj3dfo3.data.records.MSTT;
import esmj3dfo3.data.records.MUSC;
import esmj3dfo3.data.records.NAVI;
import esmj3dfo3.data.records.NOTE;
import esmj3dfo3.data.records.NPC_;
import esmj3dfo3.data.records.PACK;
import esmj3dfo3.data.records.PERK;
import esmj3dfo3.data.records.PROJ;
import esmj3dfo3.data.records.PWAT;
import esmj3dfo3.data.records.QUST;
import esmj3dfo3.data.records.RACE;
import esmj3dfo3.data.records.RADS;
import esmj3dfo3.data.records.REFR;
import esmj3dfo3.data.records.REGN;
import esmj3dfo3.data.records.RGDL;
import esmj3dfo3.data.records.SCOL;
import esmj3dfo3.data.records.SCPT;
import esmj3dfo3.data.records.SOUN;
import esmj3dfo3.data.records.SPEL;
import esmj3dfo3.data.records.STAT;
import esmj3dfo3.data.records.TACT;
import esmj3dfo3.data.records.TERM;
import esmj3dfo3.data.records.TREE;
import esmj3dfo3.data.records.VTYP;
import esmj3dfo3.data.records.WATR;
import esmj3dfo3.data.records.WEAP;
import esmj3dfo3.data.records.WTHR;
import esmj3dfo3.data.subrecords.LVLO;
import esmmanager.common.data.record.IRecordStore;
import esmmanager.common.data.record.Record;

public class RecordToRECO
{
	//TODO: is this just for testing only?? it doesn't do anything
	public static void makeRECOsForCELL(IRecordStore master, Record cellRecord, List<Record> children)
	{
		new CELL(cellRecord);

		for (Record record : children)
		{
			try
			{
				if (record.getRecordType().equals("REFR"))
				{
					REFR refr = new REFR(record);
					makeREFR(refr, master);
				}
				else if (record.getRecordType().equals("LVLN"))
				{
					LVLN lvln = new LVLN(record);
					makeLVLN(lvln, master);
				}
				else if (record.getRecordType().equals("LVLC"))
				{
					LVLC lvlc = new LVLC(record);
					makeLVLC(lvlc, master);
				}
				else if (record.getRecordType().equals("ACHR"))
				{
					ACHR achr = new ACHR(record);
					makeACHR(achr, master);
				}
				else if (record.getRecordType().equals("LAND"))
				{
					new LAND(record);
				}
				else if (record.getRecordType().equals("PGRD"))
				{

				}
				else if (record.getRecordType().equals("PGRE"))
				{

				}
				else if (record.getRecordType().equals("NAVM"))
				{

				}
				else
				{
					System.out.println("Record type not converted to RECO " + record.getRecordType());
				}
			}
			catch (NullPointerException e)
			{
				// probably just a bum pointer in the ESM
			}

		}
	}

	private static RECO makeREFR(REFR refr, IRecordStore master)
	{
		// doesn't exist in fallout.esm
		if (refr.NAME.formId == 32 || refr.NAME.formId == 23)
			return null;

		Record baseRecord = master.getRecord(refr.NAME.formId);

		RECO reco = makeRECO(baseRecord);
		if (reco instanceof LVLC)
		{
			reco = makeLVLC((LVLC) reco, master);
		}
		else if (reco instanceof LVLN)
		{
			reco = makeLVLN((LVLN) reco, master);
		}

		return reco;

	}

	private static RECO makeACHR(ACHR achr, IRecordStore master)
	{
		Record baseRecord = master.getRecord(achr.NAME.formId);
		if (baseRecord.getRecordType().equals("NPC_"))
		{
			return new NPC_(baseRecord);
		}
		else
		{
			System.out.println("ACHR record type not converted to j3d " + baseRecord.getRecordType());
		}

		return null;
	}

	private static RECO makeLVLN(LVLN lvln, IRecordStore master)
	{
		// TODO: randomly picked for now
		LVLO[] LVLOs = lvln.LVLOs;

		int idx = (int) (Math.random() * LVLOs.length);
		idx = idx == LVLOs.length ? 0 : idx;

		Record baseRecord = master.getRecord(LVLOs[idx].itemFormId);

		if (baseRecord.getRecordType().equals("CREA"))
		{
			return new CREA(baseRecord);
		}

		else if (baseRecord.getRecordType().equals("NPC_"))
		{
			// it is in fact a pointer across to another leveled creature (LVLC)
			return new NPC_(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("LVLC"))
		{
			// it is in fact a pointer across to another leveled creature (LVLC)
			makeLVLC(new LVLC(baseRecord), master);
		}
		else if (baseRecord.getRecordType().equals("LVLN"))
		{
			// it is in fact a pointer across to another leveled character (LVLN)
			makeLVLN(new LVLN(baseRecord), master);
		}
		else
		{
			System.out.println("LVLN record type not converted to j3d " + baseRecord.getRecordType());
		}

		return null;
	}

	public static RECO makeLVLC(LVLC lvlc, IRecordStore master)
	{
		// TODO: randomly picked for now
		LVLO[] LVLOs = lvlc.LVLOs;

		int idx = (int) (Math.random() * LVLOs.length);
		idx = idx == LVLOs.length ? 0 : idx;

		Record baseRecord = master.getRecord(LVLOs[idx].itemFormId);

		if (baseRecord.getRecordType().equals("CREA"))
		{
			return new CREA(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("NPC_"))
		{
			// it is in fact a pointer across to another leveled creature (LVLC)
			return new NPC_(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("LVLC"))
		{
			// it is in fact a pointer across to another leveled creature (LVLC)
			makeLVLC(new LVLC(baseRecord), master);
		}
		else if (baseRecord.getRecordType().equals("LVLN"))
		{
			// it is in fact a pointer across to another leveled character (LVLN)
			makeLVLN(new LVLN(baseRecord), master);
		}
		else
		{
			System.out.println("LVLC record type not converted to j3d " + baseRecord.getRecordType());
		}

		return null;
	}

	public static RECO makeRECO(Record baseRecord)
	{

		if (baseRecord.getRecordType().equals("GMST"))
		{
			return new GMST(baseRecord);
		}

		else if (baseRecord.getRecordType().equals("TXST"))
		{
			return new TXST(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("MICN"))
		{
			return new MICN(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("GLOB"))
		{
			return new GLOB(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("CLAS"))
		{
			return new CLAS(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("FACT"))
		{
			return new FACT(baseRecord);
		}

		else if (baseRecord.getRecordType().equals("HDPT"))
		{
			return new HDPT(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("HAIR"))
		{
			return new HAIR(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("EYES"))
		{
			return new EYES(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("RACE"))
		{
			return new RACE(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("SOUN"))
		{
			return new SOUN(baseRecord);
		}

		else if (baseRecord.getRecordType().equals("ASPC"))
		{
			return new ASPC(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("MGEF"))
		{
			return new MGEF(baseRecord);
		}

		else if (baseRecord.getRecordType().equals("SCPT"))
		{
			return new SCPT(baseRecord);
		}

		else if (baseRecord.getRecordType().equals("LTEX"))
		{
			return new LTEX(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("ENCH"))
		{
			return new ENCH(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("SPEL"))
		{
			return new SPEL(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("ACTI"))
		{
			return new ACTI(baseRecord);
		}

		else if (baseRecord.getRecordType().equals("TACT"))
		{
			return new TACT(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("TERM"))
		{
			return new TERM(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("ARMO"))
		{
			return new ARMO(baseRecord);
		}

		else if (baseRecord.getRecordType().equals("BOOK"))
		{
			return new BOOK(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("CONT"))
		{
			return new CONT(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("DOOR"))
		{
			return new DOOR(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("INGR"))
		{
			return new INGR(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("LIGH"))
		{
			return new LIGH(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("MISC"))
		{
			return new MISC(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("STAT"))
		{
			return new STAT(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("SCOL"))
		{
			return new SCOL(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("MSTT"))
		{
			return new MSTT(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("PWAT"))
		{
			return new PWAT(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("GRAS"))
		{
			return new GRAS(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("TREE"))
		{
			return new TREE(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("FURN"))
		{
			return new FURN(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("WEAP"))
		{
			return new WEAP(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("AMMO"))
		{
			return new AMMO(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("NPC_"))
		{
			return new NPC_(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("CREA"))
		{
			return new CREA(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("KEYM"))
		{
			return new KEYM(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("ALCH"))
		{
			return new ALCH(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("IDLM"))
		{
			return new IDLM(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("NOTE"))
		{
			return new NOTE(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("PROJ"))
		{
			return new PROJ(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("LVLI"))
		{
			return new LVLI(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("WTHR"))
		{
			return new WTHR(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("CLMT"))
		{
			return new CLMT(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("REGN"))
		{
			return new REGN(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("NAVI"))
		{
			return new NAVI(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("DIAL"))
		{
			return new DIAL(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("QUST"))
		{
			return new QUST(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("IDLE"))
		{
			return new IDLE(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("PACK"))
		{
			return new PACK(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("CSTY"))
		{
			return new CSTY(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("LSCR"))
		{
			return new LSCR(baseRecord);
		}

		else if (baseRecord.getRecordType().equals("ANIO"))
		{
			return new ANIO(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("WATR"))
		{
			return new WATR(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("EFSH"))
		{
			return new EFSH(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("EXPL"))
		{
			return new EXPL(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("DEBR"))
		{
			return new DEBR(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("IMGS"))
		{
			return new IMGS(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("IMAD"))
		{
			return new IMAD(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("FLST"))
		{
			return new FLST(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("PERK"))
		{
			return new PERK(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("BPTD"))
		{
			return new BPTD(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("ADDN"))
		{
			return new ADDN(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("AVIF"))
		{
			return new AVIF(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("RADS"))
		{
			return new RADS(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("CAMS"))
		{
			return new CAMS(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("CPTH"))
		{
			return new CPTH(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("VTYP"))
		{
			return new VTYP(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("IPCT"))
		{
			return new IPCT(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("IPDS"))
		{
			return new IPDS(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("ARMA"))
		{
			return new ARMA(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("ECZN"))
		{
			return new ECZN(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("MESG"))
		{
			return new MESG(baseRecord);
		}

		else if (baseRecord.getRecordType().equals("RGDL"))
		{
			return new RGDL(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("DOBJ"))
		{
			return new DOBJ(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("LGTM"))
		{
			return new LGTM(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("MUSC"))
		{
			return new MUSC(baseRecord);
		}
		//********************* special cases below, called for testing only
		else if (baseRecord.getRecordType().equals("LVLC"))
		{
			return new LVLC(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("LVLN"))
		{
			return new LVLN(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("CELL"))
		{
			return new CELL(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("GRUP"))
		{
			//return new GRUP(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("REFR"))
		{
			return new REFR(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("ACHR"))
		{
			return new ACHR(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("ACRE"))
		{
			return new ACRE(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("NAVM"))
		{
			//return new NAVM(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("PGRE"))
		{
			//return new PGRE(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("LAND"))
		{
			return new LAND(baseRecord);
		}

		//FALLOUTNV ONLY!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		else if (baseRecord.getRecordType().equals("IMOD"))
		{
			//return new IMOD(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("REPU"))
		{
			//return new REPU(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("RCPE"))
		{
			//return new RCPE(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("RCCT"))
		{
			//return new RCCT(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("CHIP"))
		{
			//return new CHIP(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("CSNO"))
		{
			//return new CSNO(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("LSCT"))
		{
			//return new LSCT(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("MSET"))
		{
			//return new MSET(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("ALOC"))
		{
			//return new ALOC(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("CHAL"))
		{
			//return new CHAL(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("AMEF"))
		{
			//return new AMEF(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("CCRD"))
		{
			//return new CCRD(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("CMNY"))
		{
			//return new CMNY(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("CDCK"))
		{
			//return new CDCK(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("DEHY"))
		{
			//return new DEHY(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("HUNG"))
		{
			//return new HUNG(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("SLPD"))
		{
			//return new SLPD(baseRecord);
		}

		else
		{
			if (!constructorsShowen.contains(baseRecord.getRecordType()))
			{
				System.out.println("else if (baseRecord.getRecordType().equals(\"" + baseRecord.getRecordType() + "\"))");
				System.out.println("{");
				System.out.println("return new " + baseRecord.getRecordType() + "(baseRecord);");
				System.out.println("}");
				constructorsShowen.add(baseRecord.getRecordType());
			}
		}
		return null;
	}

	private static HashSet<String> constructorsShowen = new HashSet<String>();

}
