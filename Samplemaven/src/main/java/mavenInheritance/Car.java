package mavenInheritance;

public class Car extends SingleInheritance  
{	
	String model = "BALENO";
	public void display()
	{
		System.out.println("Casual Car");
	}
	public static void main(String[] args) 
	{
		Car c = new Car();
		c.details();
		c.display();
		System.out.println("Speed:"+c.speed);
		System.out.println("Model:"+c.model);
		// TODO Auto-generated method stub

	}

}
