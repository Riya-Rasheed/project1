package Exception;

import java.io.IOException;

public class Checked 
{
	public static void samp() throws IOException
	
	{
		throw new IOException();
	}

	public static void main(String[] args) throws IOException
	{
		samp();

	}

}
