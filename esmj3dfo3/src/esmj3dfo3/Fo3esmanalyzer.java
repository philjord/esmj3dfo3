package esmj3dfo3;

import java.io.IOException;
import java.util.zip.DataFormatException;

import bsa.BSAFileSet;
import bsa.source.BsaMeshSource;
import bsa.source.BsaSoundSource;
import bsa.source.BsaTextureSource;

import utils.source.EsmSoundKeyToName;
import utils.source.MeshSource;
import utils.source.SoundSource;
import utils.source.TextureSource;
import utils.source.file.FileMeshSource;
import utils.source.file.FileSoundSource;
import utils.source.file.FileTextureSource;

import analyzer.EsmFormatAnalyzer;
import esmLoader.EsmFileLocations;
import esmLoader.common.PluginException;
import esmLoader.common.data.record.Record;
import esmLoader.loader.ESMManager;
import esmj3dfo3.data.RecordToRECO;
import esmj3dfo3.j3d.cell.J3dCellFactory;

public class Fo3esmanalyzer extends EsmFormatAnalyzer
{
	private static ESMManager esmManager;

	private static J3dCellFactory j3dCellFactory;

	public static void main(String args[])
	{
		EsmFormatAnalyzer.recordLoader = new RecordLoader()
		{
			public void loadRecord(Record rec)
			{
				RecordToRECO.makeRECO(rec);

				if (EsmFormatAnalyzer.LOAD_J3DCELLS && rec.getRecordType().equals("CELL"))
				{
					System.out.println("Trying to j3d cell " + rec.getFormID());
					long start = System.currentTimeMillis();
					if (j3dCellFactory.isWRLD(rec.getFormID()))
					{
						j3dCellFactory.makeBGWRLDPersistent(rec.getFormID(), false);
						j3dCellFactory.makeBGWRLDTemporary(rec.getFormID(), false);
						j3dCellFactory.makeBGWRLDDistant(rec.getFormID(), false);
					}
					else
					{
						j3dCellFactory.makeBGInteriorCELLPersistent(rec.getFormID(), false);
						j3dCellFactory.makeBGInteriorCELLTemporary(rec.getFormID(), false);
						j3dCellFactory.makeBGInteriorCELLDistant(rec.getFormID(), false);
					}
					System.out.println("Loaded in " + (System.currentTimeMillis() - start));
				}
			}
		};

		String fallout3File = EsmFileLocations.getFallout3EsmFile();

		System.out.println("loading file " + fallout3File);
		long start = System.currentTimeMillis();

		try
		{
			Thread.currentThread().setPriority(4);
			esmManager = ESMManager.getESMManager(fallout3File);
			Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
			System.out.println("Done in " + (System.currentTimeMillis() - start) + " analyzing...");
			SoundSource ss;
			TextureSource ts;
			MeshSource ms;
			if (EsmFormatAnalyzer.LOAD_BSA_FILES)
			{

				BSAFileSet bsaFileSet = new BSAFileSet(fallout3File, true, false);

				ss = new BsaSoundSource(bsaFileSet.getSoundArchives(), new EsmSoundKeyToName(esmManager));
				ts = new BsaTextureSource(bsaFileSet.getTextureArchives());
				ms = new BsaMeshSource(bsaFileSet.getMeshArchives());
			}
			else
			{
				ss = new FileSoundSource();
				ts = new FileTextureSource();
				ms = new FileMeshSource();
			}
			j3dCellFactory = new J3dCellFactory(esmManager, esmManager, ms, ts, ss);
			analyze(esmManager);
			System.out.println("done analyzing");

		}
		catch (PluginException e)
		{
			e.printStackTrace();
		}
		catch (DataFormatException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}