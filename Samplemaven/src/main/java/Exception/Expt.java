package Exception;

public class Expt 
{
	public static void main(String[] args) 
	{
		int a=20,b=30;
		int s=a+b;
		
		try
		{
			int result = 5/0;
			System.out.println("Execute try block");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Any number divided by zero is not possible "+s);
		}
		System.out.println("The whole code");
		// TODO Auto-generated method stub

	}

}
