
public class TestEmplyees {
	public static void main(String[] args) {
		// create two Employee object
		Employees emp1 = new Employees();
		Employees emp2 = new Employees();
		
		//Set employee details
		emp1.setEmployeeDetails("Natcha", 45, 20.0);
		emp2.setEmployeeDetails("Attakorn", 38, 25.0);
		
		//Display employee details
		System.out.println("Employee 1 Details");
		emp1.displayEmployeeDetails();
		
		System.out.println("\nEmployee 2 Details");
		emp2.displayEmployeeDetails();

	}

}
