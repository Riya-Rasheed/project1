package Aggregations;

public class Student 
{
	String name;
	int age,rollno;
	Address add;
	public Student(String name,int age,int rollno,Address ad)
	{
		this.name=name;
		this.age=age;
		this.rollno=rollno;
		this.add=add;
	}
	public void display()
	{
		System.out.println("Student name:"+name);
		System.out.println("Student age:"+age);
		System.out.println("Student rollno:"+rollno);
		System.out.println("House number:"+add.hno);
		System.out.println("Hose name:"+add.hname);
		System.out.println("City:"+city);
		System.out.println("Pincode:"+pincode);
}
		public static void main(String[] args) 
{
			//Address obj1 =new Address("Dharul","Kollam,691010,215");
			//Student obj = new Student("Riya",25,12,obj1);
			//obj.display();
		// TODO Auto-generated method stub

	}

}
