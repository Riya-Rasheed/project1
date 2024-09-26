package Aggregations;

public class Student 
{
	String name;
	int age;
	Address add;
	
	public Student(String name,int age,Address add) {
		
		
		this.name=name;
		this.age=age;
		this.add = add;
	}
	
	public void display() {
		
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(add.housenumber);
		System.out.println(add.city);
		System.out.println(add.pin);
		System.out.println(add.state);
	}




public static void main(String[] args) {
	// TODO Auto-generated method stub

	Address obj1 = new Address(10,"Kollam",5,"kerala");
	Student obj2 = new Student("Riya",30,obj1);
	obj2.display();
}

}
