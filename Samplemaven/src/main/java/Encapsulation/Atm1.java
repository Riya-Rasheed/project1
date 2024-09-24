package Encapsulation;

public class Atm1 
{
	private int pin_no;
	
	public void setPin_no(int pin_no)
	{
		this.pin_no = pin_no;
	}
	
	public void getPin_no()
	{
		System.out.println(pin_no);
	}
	
	public void Validpin_no()
	{
		if(pin_no==1001||pin_no==1234||pin_no==1212)
		{
			System.out.println("Valid pin");
		}
		
		else
		{
			System.out.println("Invalid pin");
		}
	}
}
	