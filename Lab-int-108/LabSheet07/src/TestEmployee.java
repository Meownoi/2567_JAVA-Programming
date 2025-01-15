
public class TestEmployee {

	public static void main(String[] args) {
		//create two employee object
		employee emp1 = new employee();
		employee emp2 = new employee();
		
		
		emp1.setEmployeeDetails("Nutcha",  45, 20);
		emp2.setEmployeeDetails("Attakorn", 38, 25.0);
		
		//Display employee details
		System.out.println("Employee 1 Details");
		emp1.displayEmployeeDetails();
		
		System.out.println();
		
		System.out.println("Employee 2 Details");
		emp2.displayEmployeeDetails();
		

	}

}
