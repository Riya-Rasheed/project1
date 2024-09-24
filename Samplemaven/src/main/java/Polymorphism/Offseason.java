package Polymorphism;
import java.util.Scanner;
import java.util.scanner;

public class Offseason extends Onseason 
{
	float offseasondiscount;
	public void discount(int price1,int price2)
	{
		offseasondiscount = (price1+price2)*0.15f;
		System.out.println("Offseasondiscount is :"+offseasondiscount);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Season");
		String season = sc.next();
		System.out.println("Enter the rate of product 1");
		int p1 = sc.nextInt();
		System.out.println("Enter thee rate of product 2");
		int p2 = sc.nextInt();
		Offseason obj1 = new Offseason();
		Onseason obj2 = new Onseason();
		
		if(season.equals("Offseason"))
		{
			obj1.discount(p1,p2);
		}
		else if(season.equals("Onseason"))
		{
			obj2.discount(p1,p2);
		}
		else
		{
			System.out.println("Invalid Result");
		}
		// TOelseDO Auto-generated method stub

	}

}
