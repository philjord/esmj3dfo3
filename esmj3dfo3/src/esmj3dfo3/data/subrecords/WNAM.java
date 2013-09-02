package esmj3dfo3.data.subrecords;

import utils.ESMByteConvert;

public class WNAM
{
	public float footWeight;

	public WNAM(byte[] bytes)
	{
		footWeight = ESMByteConvert.extractFloat(bytes, 0);
	}
}
