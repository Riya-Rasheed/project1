package superkey;

public class Child extends Parent {
	
	String color = "Black";
	String b;
	public Child(String cute)
	{
		super(10);
		System.out.println("Child class constructor");
	}
	public void display()
	{	
		super.display();
		System.out.println("child class method");
		System.out.println("Color:"+color);
		System.out.println(super.color);
	}
	public static void main(String[] args) 
	{
		Child obj1 = new Child("Sana");
		System.out.println(obj1.color);
		obj1.display();
		// TODO Auto-generated method stub

	}

}
