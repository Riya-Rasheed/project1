package Abstraction;

public class FullTimeEmployee extends Employee 
{
	private int hourlyRate;
    private static final int HOURS_PER_DAY = 8;
    public FullTimeEmployee(int hourlyRate) 
    {
        this.hourlyRate = hourlyRate;
    }
    public int calculateSalary() 
    {
        return hourlyRate * HOURS_PER_DAY;
    }



	public static void main(String[] args) 
	{
			
			
		       
		        Employee contractor = new Contractor(50, 160); 
		        Employee fullTimeEmployee = new FullTimeEmployee(30); 

		       
		        System.out.println("Contractor Salary: " + contractor.calculateSalary());
		        System.out.println("Full-Time Employee Salary: " + fullTimeEmployee.calculateSalary());
     }
}
