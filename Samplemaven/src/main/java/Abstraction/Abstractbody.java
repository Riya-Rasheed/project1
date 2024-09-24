package Abstraction;

public class Abstractbody extends AbstractClass 
{
	public void display()
	{
		System.out.println("Implementation of abstract method");
	}
	public void print()
	{
		System.out.println("Child method invokes");
	}

	public static void main(String[] args) 
	{
		Abstractbody obj = new Abstractbody();
		obj.display();
		obj.print();
		obj.show();
		// TODO Auto-generated method stub

	}

}
