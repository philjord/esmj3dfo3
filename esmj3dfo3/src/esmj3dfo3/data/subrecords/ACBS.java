package esmj3dfo3.data.subrecords;

import tools.io.ESMByteConvert;

public class ACBS
{
	public int flags;

	public static int FEMALE_MASK = 0x000001; // 	Female

	public static int ESSENTIAL_MASK = 0x000002; // 	Essential

	public static int CHAR_GEN_FACE_MASK = 0x000004; // 	 

	public static int RESPAWN_MASK = 0x000008; //	Respawn

	public static int AUTO_CALC_STATS_MASK = 0x000010; // 	Auto-calc stats

	public ACBS(byte[] bytes)
	{
		flags = ESMByteConvert.extractInt(bytes, 0);
		//etc
	}

	public boolean isFemale()
	{
		return (flags & FEMALE_MASK) > 0;
	}

	public boolean isEssential()
	{
		return (flags & ESSENTIAL_MASK) > 0;
	}

	public boolean isRespawn()
	{
		return (flags & RESPAWN_MASK) > 0;
	}

	public boolean isAutoCalcStats()
	{
		return (flags & AUTO_CALC_STATS_MASK) > 0;
	}

}
