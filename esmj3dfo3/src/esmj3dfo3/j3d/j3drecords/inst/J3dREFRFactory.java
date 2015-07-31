package esmj3dfo3.j3d.j3drecords.inst;

import javax.media.j3d.Node;

import utils.ESUtils;
import utils.source.MediaSources;
import esmLoader.common.data.record.IRecordStore;
import esmLoader.common.data.record.Record;
import esmj3d.data.shared.records.RECO;
import esmj3d.data.shared.subrecords.MODL;
import esmj3d.j3d.LODNif;
import esmj3d.j3d.TreeMaker;
import esmj3d.j3d.j3drecords.inst.J3dRECODynInst;
import esmj3d.j3d.j3drecords.inst.J3dRECOInst;
import esmj3d.j3d.j3drecords.inst.J3dRECOStatInst;
import esmj3d.j3d.j3drecords.type.J3dCONT;
import esmj3d.j3d.j3drecords.type.J3dDOOR;
import esmj3d.j3d.j3drecords.type.J3dRECOType;
import esmj3d.j3d.j3drecords.type.J3dRECOTypeGeneral;
import esmj3dfo3.data.records.ACTI;
import esmj3dfo3.data.records.ADDN;
import esmj3dfo3.data.records.ALCH;
import esmj3dfo3.data.records.AMMO;
import esmj3dfo3.data.records.ARMO;
import esmj3dfo3.data.records.BOOK;
import esmj3dfo3.data.records.CONT;
import esmj3dfo3.data.records.CREA;
import esmj3dfo3.data.records.DOOR;
import esmj3dfo3.data.records.FURN;
import esmj3dfo3.data.records.GRAS;
import esmj3dfo3.data.records.KEYM;
import esmj3dfo3.data.records.LIGH;
import esmj3dfo3.data.records.LVLC;
import esmj3dfo3.data.records.MISC;
import esmj3dfo3.data.records.MSTT;
import esmj3dfo3.data.records.NOTE;
import esmj3dfo3.data.records.NPC_;
import esmj3dfo3.data.records.PWAT;
import esmj3dfo3.data.records.REFR;
import esmj3dfo3.data.records.SCOL;
import esmj3dfo3.data.records.SOUN;
import esmj3dfo3.data.records.STAT;
import esmj3dfo3.data.records.TACT;
import esmj3dfo3.data.records.TERM;
import esmj3dfo3.data.records.TREE;
import esmj3dfo3.data.records.WEAP;
import esmj3dfo3.data.subrecords.LVLO;
import esmj3dfo3.j3d.j3drecords.type.J3dCREA;
import esmj3dfo3.j3d.j3drecords.type.J3dLIGH;
import esmj3dfo3.j3d.j3drecords.type.J3dNPC_;
import esmj3dfo3.j3d.j3drecords.type.J3dSOUN;

public class J3dREFRFactory
{
	private static J3dRECODynInst makeJ3dRECODynInst(REFR refr, RECO reco, MODL modl, boolean makePhys, MediaSources mediaSources)
	{
		if (modl != null)
		{
			J3dRECODynInst j3dinst = new J3dRECODynInst(refr, true, makePhys);
			j3dinst.setJ3dRECOType(new J3dRECOTypeGeneral(reco, modl.model.str, makePhys, mediaSources));
			return j3dinst;
		}
		else
		{
			System.out.println("null modl there " + reco);
			return null;
		}
	}

	private static J3dRECOStatInst makeJ3dRECOStatInst(REFR refr, RECO reco, MODL modl, boolean makePhys, MediaSources mediaSources)
	{
		if (modl != null)
		{
			J3dRECOStatInst j3dinst = new J3dRECOStatInst(refr, true, makePhys);
			String statNif = modl.model.str;

			// megatongatehouse01_lod_pa.nif is the lod for the dist "post atomic" (I believe)

			if (!makePhys)
			{
				if (reco.isFlagSet(RECO.VisibleWhenDistant_Flag))
				{
					String statLod = statNif.substring(0, statNif.toLowerCase().indexOf(".nif")) + "_lod.nif";
					if (mediaSources.getMeshSource().nifFileExists(statLod))
					{
						j3dinst.setJ3dRECOType(//
								new J3dRECOTypeGeneral(reco, statNif, makePhys, mediaSources),//
								J3dRECOTypeGeneral.loadNif(statLod, false, mediaSources));
					}
					else
					{
						System.out.println("Nif " + statNif + " isFlagSet(RECO.VisibleWhenDistant_Flag) but " + statLod + " no exist");
					}
				}
				else if (reco.isFlagSet(RECO.HasTreeLOD_Flag))
				{
					String statLod = statNif.substring(0, statNif.toLowerCase().indexOf(".nif")) + "_lod_flat.nif";
					if (mediaSources.getMeshSource().nifFileExists(statLod))
					{
						j3dinst.setJ3dRECOType(//
								new J3dRECOTypeGeneral(reco, statNif, makePhys, mediaSources),//
								J3dRECOTypeGeneral.loadNif(statLod, false, mediaSources));
					}
					else
					{
						statLod = statNif.substring(0, statNif.toLowerCase().indexOf(".nif")) + "_lod.nif";
						if (mediaSources.getMeshSource().nifFileExists(statLod))
						{
							j3dinst.setJ3dRECOType(//
									new J3dRECOTypeGeneral(reco, statNif, makePhys, mediaSources),//
									J3dRECOTypeGeneral.loadNif(statLod, false, mediaSources));
						}
						else
						{
							System.out.println("  nif " + statNif + " isFlagSet(RECO.HasTreeLOD_Flag) but " + statLod + " no exist");
						}
					}
				}
				else
				{
					j3dinst.setJ3dRECOType(new J3dRECOTypeGeneral(refr, statNif, makePhys, mediaSources));
				}
			}
			else
			{
				j3dinst.setJ3dRECOType(new J3dRECOTypeGeneral(refr, statNif, makePhys, mediaSources));
			}
			return j3dinst;
		}
		else
		{
			// ACTI script or 
			//collision marker probably has a valid OBND 
			//System.out.println("no MODL there. " + stat);
			return null;
		}
	}

	public static Node makeJ3DReferFar(REFR refr, IRecordStore master, MediaSources mediaSources)
	{
		Record baseRecord = master.getRecord(refr.NAME.formId);

		String type = baseRecord.getRecordType();
		if (type.equals("ACTI") || type.equals("SCOL") || type.equals("STAT"))
		{
			RECO reco = null;
			String nif = null;
			if (type.equals("ACTI"))
			{
				ACTI acti = new ACTI(baseRecord);
				nif = acti.MODL.model.str;
				reco = acti;
			}
			else if (type.equals("SCOL"))
			{
				//SCOL are just exactly like STATS
				SCOL scol = new SCOL(baseRecord);
				nif = scol.MODL.model.str;
				reco = scol;
			}
			else if (type.equals("STAT"))
			{
				STAT stat = new STAT(baseRecord);
				nif = stat.MODL.model.str;
				reco = stat;
			}

			if (reco.isFlagSet(RECO.VisibleWhenDistant_Flag))
			{
				String statLod = nif.substring(0, nif.toLowerCase().indexOf(".nif")) + "_lod.nif";
				if (mediaSources.getMeshSource().nifFileExists(statLod))
				{
					J3dRECOStatInst j3dinst = new J3dRECOStatInst(refr, false, false);
					j3dinst.addNodeChild(new LODNif(statLod, mediaSources));
					return j3dinst;
				}
				else
				{
					System.out.println("Nif " + nif + " isFlagSet(RECO.VisibleWhenDistant_Flag) but " + statLod + " no exist");
				}
			}
			else if (reco.isFlagSet(RECO.HasTreeLOD_Flag))
			{
				String statLod = nif.substring(0, nif.toLowerCase().indexOf(".nif")) + "_lod_flat.nif";
				//falloutNV uses just the _lod
				if (mediaSources.getMeshSource().nifFileExists(statLod))
				{
					J3dRECOStatInst j3dinst = new J3dRECOStatInst(refr, false, false);
					j3dinst.addNodeChild(new LODNif(statLod, mediaSources));
					return j3dinst;
				}
				else
				{
					statLod = nif.substring(0, nif.toLowerCase().indexOf(".nif")) + "_lod.nif";
					if (mediaSources.getMeshSource().nifFileExists(statLod))
					{
						J3dRECOStatInst j3dinst = new J3dRECOStatInst(refr, false, false);
						j3dinst.addNodeChild(new LODNif(statLod, mediaSources));
						return j3dinst;
					}
					else
					{
						System.out.println("  nif " + statLod + " isFlagSet(RECO.HasTreeLOD_Flag) but " + statLod + " no exist");
					}
				}
			}

		}
		else if (type.equals("TREE"))
		{
			TREE tree = new TREE(baseRecord);
			String treeNif = tree.MODL.model.str;
			Node node = TreeMaker.makeTreeFar(refr, false, mediaSources, treeNif, tree.billBoardWidth, tree.billBoardHeight);
			return node;
		}
		else
		{
			System.out.println("Far REFR record type not converted to j3d " + baseRecord.getRecordType());
		}

		return null;
	}

	public static J3dRECOInst makeJ3DRefer(REFR refr, boolean makePhys, IRecordStore master, MediaSources mediaSources)
	{
		// doesn't exist in fallout.esm
		if (refr.NAME.formId == 32 || refr.NAME.formId == 23)
			return null;

		//doesn't work as xesp can be a cell or world ref
		/*if (refr.XESP != null)
		{
			Record enableParent = master.getRecord(refr.XESP.parentId);
			if ((enableParent.getRecordFlags1() & 0x800) != 0)
			{
				System.out.println("parent enable says off");
				return null;
			}
		}*/

		Record baseRecord = master.getRecord(refr.NAME.formId);

		if (baseRecord.getRecordType().equals("ACTI"))
		{
			ACTI acti = new ACTI(baseRecord);
			return makeJ3dRECOStatInst(refr, acti, acti.MODL, makePhys, mediaSources);
		}
		else if (baseRecord.getRecordType().equals("ADDN"))
		{
			ADDN addn = new ADDN(baseRecord);
			return makeJ3dRECODynInst(refr, addn, addn.MODL, makePhys, mediaSources);
		}
		else if (baseRecord.getRecordType().equals("ALCH"))
		{
			ALCH alch = new ALCH(baseRecord);
			return makeJ3dRECODynInst(refr, alch, alch.MODL, makePhys, mediaSources);
		}
		else if (baseRecord.getRecordType().equals("AMMO"))
		{
			AMMO ammo = new AMMO(baseRecord);
			return makeJ3dRECODynInst(refr, ammo, ammo.MODL, makePhys, mediaSources);
		}
		else if (baseRecord.getRecordType().equals("ARMO"))
		{
			ARMO armo = new ARMO(baseRecord);
			return makeJ3dRECODynInst(refr, armo, armo.MODL, makePhys, mediaSources);
		}
		else if (baseRecord.getRecordType().equals("BOOK"))
		{
			BOOK book = new BOOK(baseRecord);
			return makeJ3dRECODynInst(refr, book, book.MODL, makePhys, mediaSources);
		}
		else if (baseRecord.getRecordType().equals("CONT"))
		{
			J3dRECOStatInst j3dinst = new J3dRECOStatInst(refr, new J3dCONT(new CONT(baseRecord), makePhys, mediaSources), true, makePhys);
			return j3dinst;
		}
		else if (baseRecord.getRecordType().equals("FURN"))
		{
			FURN furn = new FURN(baseRecord);
			return makeJ3dRECOStatInst(refr, furn, furn.MODL, makePhys, mediaSources);
		}
		else if (baseRecord.getRecordType().equals("GRAS"))
		{
			GRAS gras = new GRAS(baseRecord);
			return makeJ3dRECOStatInst(refr, gras, gras.MODL, makePhys, mediaSources);
		}
		else if (baseRecord.getRecordType().equals("KEYM"))
		{
			KEYM keym = new KEYM(baseRecord);
			return makeJ3dRECODynInst(refr, keym, keym.MODL, makePhys, mediaSources);
		}
		else if (baseRecord.getRecordType().equals("MISC"))
		{
			MISC misc = new MISC(baseRecord);
			return makeJ3dRECODynInst(refr, misc, misc.MODL, makePhys, mediaSources);
		}
		else if (baseRecord.getRecordType().equals("MSTT"))
		{
			MSTT mstt = new MSTT(baseRecord);
			return makeJ3dRECODynInst(refr, mstt, mstt.MODL, makePhys, mediaSources);
		}
		else if (baseRecord.getRecordType().equals("NOTE"))
		{
			NOTE note = new NOTE(baseRecord);
			return makeJ3dRECODynInst(refr, note, note.MODL, makePhys, mediaSources);
		}
		else if (baseRecord.getRecordType().equals("PWAT"))
		{
			PWAT pwat = new PWAT(baseRecord);
			return makeJ3dRECOStatInst(refr, pwat, pwat.MODL, makePhys, mediaSources);
		}
		else if (baseRecord.getRecordType().equals("STAT"))
		{
			STAT stat = new STAT(baseRecord);
			return makeJ3dRECOStatInst(refr, stat, stat.MODL, makePhys, mediaSources);
		}
		else if (baseRecord.getRecordType().equals("SCOL"))
		{
			//SCOL are just exactly like STATS
			SCOL scol = new SCOL(baseRecord);
			return makeJ3dRECOStatInst(refr, scol, scol.MODL, makePhys, mediaSources);
		}
		else if (baseRecord.getRecordType().equals("TACT"))
		{
			TACT tact = new TACT(baseRecord);
			return makeJ3dRECOStatInst(refr, tact, tact.MODL, makePhys, mediaSources);
		}
		else if (baseRecord.getRecordType().equals("TERM"))
		{
			TERM term = new TERM(baseRecord);
			return makeJ3dRECOStatInst(refr, term, term.MODL, makePhys, mediaSources);
		}
		else if (baseRecord.getRecordType().equals("WEAP"))
		{
			WEAP weap = new WEAP(baseRecord);
			return makeJ3dRECODynInst(refr, weap, weap.MODL, makePhys, mediaSources);
		}
		else if (baseRecord.getRecordType().equals("ASPC"))
		{
			//ASPC aspc = new ASPC(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("IDLM"))
		{
			//IDLM idlm = new IDLM(baseRecord);
		}
		else if (baseRecord.getRecordType().equals("DOOR"))
		{
			if (refr.XTEL != null && !makePhys)
			{
				System.out.println("DOOR at " + ESUtils.makeTrans(refr.getTrans()));
			}
			return new J3dRECOStatInst(refr, new J3dDOOR(new DOOR(baseRecord), makePhys, mediaSources), true, makePhys);
		}
		else if (baseRecord.getRecordType().equals("LIGH"))
		{
			return new J3dRECOStatInst(refr, new J3dLIGH(new LIGH(baseRecord), makePhys, mediaSources), true, makePhys);
		}
		else if (baseRecord.getRecordType().equals("TREE"))
		{
			TREE tree = new TREE(baseRecord);
			String treeNif = tree.MODL.model.str;
			J3dRECOStatInst j3dinst = TreeMaker.makeTree(refr, makePhys, mediaSources, treeNif, tree.billBoardWidth, tree.billBoardHeight,
					false);
			return j3dinst;
		}
		else if (baseRecord.getRecordType().equals("SOUN"))
		{
			if (!makePhys)
			{
				return new J3dRECOStatInst(refr, new J3dSOUN(new SOUN(baseRecord), master, mediaSources.getSoundSource()), false, makePhys);
			}
		}
		else if (baseRecord.getRecordType().equals("LVLC"))
		{
			if (!makePhys)
			{
				LVLC lvlc = new LVLC(baseRecord);
				J3dRECODynInst j3dinst = new J3dRECODynInst(refr, false, makePhys);
				j3dinst.setJ3dRECOType(makeLVLC(lvlc, master, mediaSources));
				return j3dinst;
			}
		}
		else
		{
			System.out.println("REFR record type not converted to j3d " + baseRecord.getRecordType());
		}

		return null;
	}

	/** Note does not bother with teh ACRE or ACHR system
	 * 
	 * @param lvlc
	 * @param master
	 * @param meshSource
	 * @param textureSource
	 * @param soundSource
	 * @return
	 */
	protected static J3dRECOType makeLVLC(LVLC lvlc, IRecordStore master, MediaSources mediaSources)
	{
		// TODO: randomly picked for now
		LVLO[] LVLOs = lvlc.LVLOs;

		int idx = (int) (Math.random() * LVLOs.length);
		idx = idx == LVLOs.length ? 0 : idx;

		Record baseRecord = master.getRecord(LVLOs[idx].itemFormId);

		if (baseRecord.getRecordType().equals("LVLC"))
		{
			// it is in fact a pointer across to another leveled creature (LVLC)
			LVLC lvlc2 = new LVLC(baseRecord);
			return makeLVLC(lvlc2, master, mediaSources);
		}
		else if (baseRecord.getRecordType().equals("CREA"))
		{
			CREA crea = new CREA(baseRecord);
			return new J3dCREA(crea, master, mediaSources);
		}
		else if (baseRecord.getRecordType().equals("NPC_"))
		{
			// it is in fact a pointer across to another leveled creature (LVLC)
			NPC_ npc_ = new NPC_(baseRecord);
			return new J3dNPC_(npc_, master, mediaSources);

		}
		else
		{
			System.out.println("LVLC record type not converted to j3d " + baseRecord.getRecordType());
		}

		return null;
	}

}
