package mavenInheritance;

public class ConstructorPrgm 
{
	public ConstructorPrgm()
	{
		System.out.println("First Constructor");
		
	}
	public ConstructorPrgm(int a)
	{
		this();
		System.out.println("Value of A:"+a);
	}

	public static void main(String[] args) 
	{
		ConstructorPrgm ob = new ConstructorPrgm(10);
		// TODO Auto-generated method stub

	}

}
