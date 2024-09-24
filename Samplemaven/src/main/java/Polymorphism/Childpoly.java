package Polymorphism;

public class Childpoly extends Parentpoly
{
	public void display(String name,int age)
	{
		super.display("Kollam",12);
		System.out.println("Polymorphism");
	}

	public static void main(String[] args) 
	{
		Childpoly obj1 = new Childpoly();
		obj1.display("Riya",25);
		// TODO Auto-generated method stub

	}

}
