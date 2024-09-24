package Encapsulation;

public class Person 
{
	private int id;
	public void setid(int id)
	{
		this.id = id;
	}
	public void getid()
	{
		System.out.println(id);
	}
	public void validid()
	{
		if(id==1||id==2||id==3)
		{
			System.out.println("Valid id");
		}
		else
			System.out.println("Invalid id");
	}

}
