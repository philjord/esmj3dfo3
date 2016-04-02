package esmj3dfo3.j3d.j3drecords.type;

import java.util.ArrayList;

import javax.vecmath.Color3f;

import esmj3d.data.shared.subrecords.CNTO;
import esmj3d.data.shared.subrecords.MODL;
import esmj3d.j3d.BethRenderSettings;
import esmj3d.j3d.j3drecords.type.J3dRECOTypeCha;
import esmj3dfo3.data.records.ARMO;
import esmj3dfo3.data.records.LVLI;
import esmj3dfo3.data.records.LVLN;
import esmj3dfo3.data.records.NPC_;
import esmj3dfo3.data.records.RACE;
import esmj3dfo3.data.records.WEAP;
import esmj3dfo3.data.subrecords.LVLO;
import esmmanager.common.data.record.IRecordStore;
import esmmanager.common.data.record.Record;
import nif.character.NifCharacter;
import tools3d.utils.scenegraph.Fadable;
import utils.ESConfig;
import utils.source.MediaSources;

public class J3dNPC_ extends J3dRECOTypeCha
{
	private String helmetStr = null;

	private String headStr = null;

	private String bodyStr = null;

	private String handLStr = null;

	private String handRStr = null;

	// TODO: worn vs carried weaps
	private String weapStr = null;

	private boolean female = false;

	public J3dNPC_(NPC_ npc_, IRecordStore master, MediaSources mediaSources)
	{
		super(npc_);

		female = npc_.ACBS.isFemale();

		Record rrec = master.getRecord(npc_.RNAM.formId);
		RACE race = new RACE(rrec);
		MODL[] modls = race.MODLs;

		// the defaults
		if (female)
		{
			headStr = ESConfig.TES_MESH_PATH + "characters\\head\\headfemale.nif";
			bodyStr = ESConfig.TES_MESH_PATH + "characters\\_male\\femaleupperbody.nif";
			handLStr = ESConfig.TES_MESH_PATH + "characters\\_male\\femalelefthand.nif";
			handRStr = ESConfig.TES_MESH_PATH + "characters\\_male\\femalerighthand.nif";
		}
		else
		{
			headStr = modls[0].model.str;
			bodyStr = ESConfig.TES_MESH_PATH + "characters\\_male\\upperbody.nif";
			handLStr = ESConfig.TES_MESH_PATH + "characters\\_male\\lefthand.nif";
			handRStr = ESConfig.TES_MESH_PATH + "characters\\_male\\righthand.nif";
		}

		// deal with templates first
		if (npc_.TPLT != null)
		{
			Record trec = master.getRecord(npc_.TPLT.formId);
			if (trec.getRecordType().equals("NPC_"))
			{
				NPC_ npcTemplate = new NPC_(trec);
				organiseCNTOs(npcTemplate.CNTOs, master);
			}
			else if (trec.getRecordType().equals("LVLN"))
			{
				LVLN lvln = new LVLN(trec);
				organiseLVLN(lvln, master);
			}
		}

		// now sort out overrrides of any template at this level
		organiseCNTOs(npc_.CNTOs, master);

		String skeletonNifFile = ESConfig.TES_MESH_PATH + "characters\\_male\\skeleton.nif";

		ArrayList<String> fileNames = new ArrayList<String>();
		fileNames.add(headStr);
		fileNames.add(helmetStr);
		fileNames.add(bodyStr);
		fileNames.add(handLStr);
		fileNames.add(handRStr);
		fileNames.add(weapStr);

		ArrayList<String> idleAnimations = new ArrayList<String>();
		idleAnimations.addAll(mediaSources.getMeshSource().getFilesInFolder(ESConfig.TES_MESH_PATH + "characters\\_male\\idleanims"));

		//idleAnimations.add(ESConfig.TES_MESH_PATH + "characters\\_male\\idleanims\\lookingaround.kf");

		nifCharacter = new NifCharacter(skeletonNifFile, fileNames, mediaSources, idleAnimations);
		addChild(nifCharacter);

		setOutline(new Color3f(1.0f, 1.0f, 0f));
		if (!BethRenderSettings.isOutlineChars())
			((Fadable) nifCharacter).setOutline(null);

	}

	private void organiseLVLN(LVLN lvln, IRecordStore master)
	{
		// TODO: randomly picked for now
		LVLO[] LVLOs = lvln.LVLOs;

		int idx = (int) (Math.random() * LVLOs.length);
		idx = idx == LVLOs.length ? 0 : idx;

		Record baseRecord = master.getRecord(LVLOs[idx].itemFormId);

		if (baseRecord.getRecordType().equals("NPC_"))
		{
			NPC_ npcTemplate = new NPC_(baseRecord);
			organiseCNTOs(npcTemplate.CNTOs, master);
		}
		else if (baseRecord.getRecordType().equals("LVLN"))
		{
			LVLN lvln2 = new LVLN(baseRecord);
			organiseLVLN(lvln2, master);
		}
		else
		{
			System.out.println("LVLN record type not converted to j3d " + baseRecord.getRecordType());
		}

	}

	private void organiseCNTOs(CNTO[] cntos, IRecordStore master)
	{
		for (int i = 0; i < cntos.length; i++)
		{
			//	int count = cntos[i].count;
			Record baseRecord = master.getRecord(cntos[i].itemFormId);
			organiseItem(baseRecord, master);
		}
	}

	private void organiseLVLI(LVLI lvli, IRecordStore master)
	{
		LVLO[] LVLOs = lvli.LVLOs;

		int idx = (int) (Math.random() * LVLOs.length);
		idx = idx == LVLOs.length ? 0 : idx;

		Record baseRecord = master.getRecord(LVLOs[idx].itemFormId);
		organiseItem(baseRecord, master);

	}

	private void organiseItem(Record baseRecord, IRecordStore master)
	{
		if (baseRecord.getRecordType().equals("WEAP"))
		{
			WEAP weap = new WEAP(baseRecord);
			addWEAP(weap);
		}
		else if (baseRecord.getRecordType().equals("ARMO"))
		{
			ARMO armo = new ARMO(baseRecord);
			addARMO(armo);
		}
		else if (baseRecord.getRecordType().equals("MISC"))
		{
		}
		else if (baseRecord.getRecordType().equals("AMMO"))
		{
		}
		else if (baseRecord.getRecordType().equals("INGR"))
		{
		}
		else if (baseRecord.getRecordType().equals("ALCH"))
		{
		}
		else if (baseRecord.getRecordType().equals("SLGM"))
		{
		}
		else if (baseRecord.getRecordType().equals("CMNY"))
		{
		}
		else if (baseRecord.getRecordType().equals("KEYM"))
		{
		}
		else if (baseRecord.getRecordType().equals("LVLI"))
		{
			LVLI lvli2 = new LVLI(baseRecord);
			organiseLVLI(lvli2, master);
		}
		else
		{
			System.out.println("LVLI record type not converted to j3d " + baseRecord.getRecordType());
		}
	}

	private void addARMO(ARMO armo)
	{
		MODL m = armo.MODL;
		if (female && armo.MOD3 != null)
		{
			m = armo.MOD3;
		}

		helmetStr = armo.BMDT.isHair() ? m.model.str : helmetStr;
		bodyStr = armo.BMDT.isUpperBody() ? m.model.str : bodyStr;
		handLStr = armo.BMDT.isHand() ? m.model.str : handLStr;
		handRStr = armo.BMDT.isHand() ? m.model.str : handRStr;
	}

	private void addWEAP(WEAP weap)
	{
		if (weap.MODL != null)
		{
			weapStr = weap.MODL.model.str;
		}
		else
		{
			//TODO:  male female H2H models		 see WEAP	
		}

	}

}
