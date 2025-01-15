
public class Employees {
	
	private String name;
	private int hourWorked;
	private double hourlyRate;
	
	//Method to set employee details
	public void setEmployeeDetails(String empName,int hours,double rate) {
		name = empName;
		hourWorked = hours;
		hourlyRate = rate;
	}
	//Method to calculate salary
	public double calculateSalary() {
		double salary = hourWorked * hourlyRate;
		if(hourWorked > 40) {
			double bouus = salary * 0.10;
			salary += bouus;
		}
		return salary;
	}
	//Method to display employee details
	public void displayEmployeeDetails() {
		System.out.println("Name: "+ name);
		System.out.println("Hours Worked: "+ hourWorked);
		System.out.println("Hourly Rate: "+ hourlyRate);
		System.out.println("Total Salary: "+ calculateSalary());
	}
	

}