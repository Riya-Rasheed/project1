package Encapsulation;

public class Student 
{
	private int rollno;
	private String name;
	private String dept;
	
	public void setter(int rollno,String name,String dept)
	{
		this.rollno = rollno;
		this.name = name;
		this.dept = dept;
	}
	public void getter()
	{
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(dept);
	}
		



}
