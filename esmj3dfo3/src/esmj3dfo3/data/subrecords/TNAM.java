package esmj3dfo3.data.subrecords;

import utils.ESMByteConvert;

public class TNAM
{
	public float turningSpeed;

	public TNAM(byte[] bytes)
	{
		turningSpeed = ESMByteConvert.extractFloat(bytes, 0);
	}
}
