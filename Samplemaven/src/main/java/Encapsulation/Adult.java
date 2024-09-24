package Encapsulation;

public class Adult 
{
	private String name;
	private String place;
	private int age;

	public void setter(String name,String place,int age)
	{
		this.name = name;
		this.place =place;
		this.age = age;
	}
	
	public void getter()
	{
		System.out.println(name);
		System.out.println(place);
		System.out.println(age);
	}
	
	

}
