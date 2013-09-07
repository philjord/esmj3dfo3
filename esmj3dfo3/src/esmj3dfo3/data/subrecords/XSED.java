package esmj3dfo3.data.subrecords;

import esmj3d.data.shared.subrecords.ZString;

public class XSED
{
	public ZString string;

	public XSED(byte[] bytes)
	{
		string = new ZString(bytes);
	}
}
