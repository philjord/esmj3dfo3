package esmj3dfo3.data.subrecords;

import esmj3d.data.shared.subrecords.ZString;

public class XSED
{
	public String string;

	public XSED(byte[] bytes)
	{
		string = ZString.toString(bytes);
	}
}
