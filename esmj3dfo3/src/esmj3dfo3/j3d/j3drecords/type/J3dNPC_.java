package esmj3dfo3.j3d.j3drecords.type;

import javax.media.j3d.Group;

import nif.NifToJ3d;
import nif.character.NifCharacter;
import utils.ESConfig;
import utils.source.MeshSource;
import utils.source.SoundSource;
import utils.source.TextureSource;
import esmLoader.common.data.record.IRecordStore;
import esmLoader.common.data.record.Record;
import esmj3d.data.shared.subrecords.CNTO;
import esmj3d.data.shared.subrecords.MODL;
import esmj3d.j3d.j3drecords.type.J3dRECOType;
import esmj3dfo3.data.records.ARMO;
import esmj3dfo3.data.records.LVLI;
import esmj3dfo3.data.records.NPC_;
import esmj3dfo3.data.records.RACE;
import esmj3dfo3.data.records.WEAP;
import esmj3dfo3.data.subrecords.LVLO;

public class J3dNPC_ extends J3dRECOType
{
	//private boolean upper = false;

	//private boolean lower = false;

	//private boolean hand = false;

	//private boolean foot = false;

	//private boolean shield = false;

	//private boolean female = false;

	public J3dNPC_(NPC_ npc_, IRecordStore master, MeshSource meshSource, TextureSource textureSource, SoundSource soundSource)
	{
		super(npc_, null);
		//String path = npc_.MODL.getPath();

		//female = npc_.ACBS.isFemale();

		Record rrec = master.getRecord(npc_.RNAM.formId);
		RACE race = new RACE(rrec);

		//attach neutral head models
		MODL[] modls = race.MODLs;
		Group head = NifToJ3d.loadShapes(modls[0].model.str, meshSource, textureSource).getVisualRoot();

		// some of these have bad textures
		/*for (int i = 1; i < modls.length; i++)
		 {
		 head.addChild(NifToJ3d.loadShapes(new File(NifConstants.NIF_PATH + modls[i].model)));
		 }*/
		addChild(head);

		CNTO[] cntos = npc_.CNTOs;
		for (int i = 0; i < cntos.length; i++)
		{
			//	int count = cntos[i].count;
			Record rec = master.getRecord(cntos[i].itemFormId);
			if (rec.getRecordType().equals("WEAP"))
			{
				WEAP weap = new WEAP(rec);
				addWEAP(weap);
			}
			else if (rec.getRecordType().equals("ARMO"))
			{
				//ARMO armo = new ARMO(rec);
			}
			else if (rec.getRecordType().equals("AMMO"))
			{
				//AMMO ammo = new AMMO(rec);
			}
			else if (rec.getRecordType().equals("MISC"))
			{
				//MISC misc = new MISC(rec);
			}
			else if (rec.getRecordType().equals("KEYM"))
			{
				//KEYM keym = new KEYM(rec);
			}
			else if (rec.getRecordType().equals("INGR"))
			{
				//INGR keym = new INGR(rec);
			}
			else if (rec.getRecordType().equals("LIGH"))
			{
				//LIGH ligh = new LIGH(rec);
			}
			else if (rec.getRecordType().equals("ALCH"))
			{
				//ALCH alch = new ALCH(rec);
			}
			else if (rec.getRecordType().equals("BOOK"))
			{
				//BOOK book = new BOOK(rec);
			}
			else if (rec.getRecordType().equals("NOTE"))
			{
				//NOTE book = new NOTE(rec);
			}
			else if (rec.getRecordType().equals("LVLI"))
			{
				LVLI lvli = new LVLI(rec);
				LVLO[] LVLOs = lvli.LVLOs;

				int idx = (int) (Math.random() * LVLOs.length);
				idx = idx == LVLOs.length ? 0 : idx;

				Record baseRecord = master.getRecord(LVLOs[idx].itemFormId);
				if (baseRecord.getRecordType().equals("ARMO"))
				{
					ARMO armo = new ARMO(baseRecord);
					armo.getClass();
				}
				else if (baseRecord.getRecordType().equals("LVLI"))
				{
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
				else if (baseRecord.getRecordType().equals("WEAP"))
				{
					WEAP weap = new WEAP(baseRecord);
					addWEAP(weap);
				}
				else
				{
					System.out.println("LVLI record type not converted to j3d " + baseRecord.getRecordType());
				}
			}
			else
			{
				System.out.println("NPC_ has unknown contained item " + rec.getRecordType());
			}

		}

		String skeletonNifFile = ESConfig.TES_MESH_PATH + "characters\\_male\\skeleton.nif";

		String[] fileNames = new String[5];
		fileNames[0] = ESConfig.TES_MESH_PATH + "characters\\_male\\femaleupperbody.nif";
		fileNames[1] = ESConfig.TES_MESH_PATH + "characters\\head\\headfemale.nif";
		fileNames[2] = ESConfig.TES_MESH_PATH + "armor\\headgear\\lucassimmshat\\m\\lucassimmshat.nif";
		fileNames[3] = ESConfig.TES_MESH_PATH + "armor\\wastelandmerchant01\\glovefl.nif";
		fileNames[4] = ESConfig.TES_MESH_PATH + "armor\\wastelandmerchant01\\glovefr.nif";

		NifCharacter nifCharacter = new NifCharacter(skeletonNifFile, fileNames, meshSource, textureSource, ESConfig.TES_MESH_PATH
				+ "characters\\_male\\idleanims\\lookingaround.kf");
		addChild(nifCharacter);

	}

	private void addWEAP(WEAP weap)
	{
		weap.getClass();
	}

	@Override
	public void renderSettingsUpdated()
	{
		// TODO Auto-generated method stub
		
	}

}
