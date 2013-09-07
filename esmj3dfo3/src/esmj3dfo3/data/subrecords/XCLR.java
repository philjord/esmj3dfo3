package esmj3dfo3.data.subrecords;

import tools.io.ESMByteConvert;

public class XCLR
{
	public int regionFormId;

	public XCLR(byte[] bytes)
	{
		// from 4-24 bytes? first is definately a region id what are the others?
		regionFormId = ESMByteConvert.extractInt(bytes, 0);
	}
}
