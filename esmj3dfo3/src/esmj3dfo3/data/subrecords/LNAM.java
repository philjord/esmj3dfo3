package esmj3dfo3.data.subrecords;

import utils.ESMByteConvert;

public class LNAM
{
	public float hairLength;

	public LNAM(byte[] bytes)
	{
		hairLength = ESMByteConvert.extractFloat(bytes, 0);
	}
}
