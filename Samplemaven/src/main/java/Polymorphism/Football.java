package Polymorphism;

public class Football extends Sports 
{
	public void play()
	{
		super.play();
		System.out.println("Te selected one is Football");
	}

	public static void main(String[] args) 
	{
		Football ob = new Football();
		ob.play();
		Cricket ob1 = new Cricket();
		ob1.play();
		Hockey ob2 = new Hockey();
		ob2.play();
		// TODO Auto-generated method stub

	}

}
