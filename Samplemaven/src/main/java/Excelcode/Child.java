package Excelcode;

import java.io.IOException;


public class Child 
{

	public static void main(String[] args) throws IOException 
	{
		String s1 = Excelread.readStringData(0,0);
		System.out.println(s1);
		
		String s2 = Excelread.readIntegerData(2,1);
		System.out.println(s2);

	}

}
