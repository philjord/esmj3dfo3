package esmj3dfo3.data.subrecords;

import utils.ESMByteConvert;

public class CSDC
{
	public byte chance;

	public CSDC(byte[] bytes)
	{
		chance = ESMByteConvert.extractByte(bytes, 0);
	}
}
