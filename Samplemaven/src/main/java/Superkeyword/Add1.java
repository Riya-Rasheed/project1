package Superkeyword;

public class Add1 extends Add 
{
	int dv,dv1;
	public void dv()
	{
		int s=super.addition(10, 20);
		
		if(s%10==0)
		{
			System.out.println("The given sum is divisible by 10");
			
		}
		else
		{
			System.out.println("The given sum is not divisible by 10");
		}
	}
	

	public static void main(String[] args) 
	{
		Add1 obj = new Add1();
		obj.dv();
		// TODO Auto-generated method stub

	}

}
