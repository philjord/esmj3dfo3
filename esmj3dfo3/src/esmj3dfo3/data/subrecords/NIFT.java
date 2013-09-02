package esmj3dfo3.data.subrecords;

public class NIFT
{
	public byte[] unknown;

	public NIFT(byte[] bytes)
	{
		// always appears to be 4 bytes
		unknown = bytes;
	}
}
