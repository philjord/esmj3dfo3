package esmj3dfo3.data.subrecords;

import utils.ESMByteConvert;

public class RNAM
{
	public byte attackReach;

	public RNAM(byte[] bytes)
	{
		attackReach = ESMByteConvert.extractByte(bytes, 0);
	}
}
