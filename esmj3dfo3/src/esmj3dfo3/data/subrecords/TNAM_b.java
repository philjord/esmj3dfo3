package esmj3dfo3.data.subrecords;

import utils.ESMByteConvert;

public class TNAM_b
{
	public float turningSpeed;

	public TNAM_b(byte[] bytes)
	{
		turningSpeed = ESMByteConvert.extractFloat(bytes, 0);
	}
}
