package Exception;

public class ChildLicenceException {

	public static void check(int age) throws LicenceException 
	{
		if(age>18)
		{
			System.out.println("Eligible");
		}
		else
		{
			throw new LicenceException("Not Eligible");
		}

	}
	public static void main(String[]args)
	{
		try
		{
			ChildLicenceException.check(15);
		}
		catch(LicenceException e)
		{
			System.out.println(e);
		}
	}
}
