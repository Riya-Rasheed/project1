package Interface;

public class ChildInterface implements ParentInterface
{
	public void display()
	{
		System.out.println("Display the interest");
	}
	
	public void show()
	{
		System.out.println("Print the interest");
	}
	public void print()
	{
		System.out.println("Child print");
	}

	public static void main(String[] args) 
	{
		ParentInterface obj = new ChildInterface();
		obj.display();
		obj.show();
		//obj.print();
		
		ChildInterface obj1 = new ChildInterface();
		obj1.print();
		// TODO Auto-generated method stub

	}

}
