package Exception;

public class SampleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 40;
		int b = 10;
		int sum = a+b;
		int arr[] = new int [10];
		
		try
		{
			int result = 5/0;
			arr[12] = 89;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Not divisible by 0");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception");
		}
		finally
		{
			System.out.println("Finally block");
		}
		System.out.println("Rest of the code"+sum);

	}

}
