package Polymorphism;

public class Onseason 
{
	float onseasondiscount;
	public void discount(int price1,int price2)
	{
		onseasondiscount = (price1+price2)*0.4f;
		System.out.println("Onseason discount is :"+onseasondiscount);
	}

}
