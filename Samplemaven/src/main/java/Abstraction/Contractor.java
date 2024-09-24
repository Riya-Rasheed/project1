package Abstraction;

public class Contractor extends Employee 
{
	 private int paymentPerHour;
	 private int workingHours;
	 public Contractor(int paymentPerHour, int workingHours) 
	 {
	        this.paymentPerHour = paymentPerHour;
	        this.workingHours = workingHours;
	 }
	 public int calculateSalary() 
	 {
	        return paymentPerHour * workingHours;
	 }
}
