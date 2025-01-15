import java.util.*;
public class testEmployeeInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//create two employee object
		employee emp1 = new employee();
		employee emp2 = new employee();
		
		//input data for first employee
		System.out.println("Enter details for Employee 1:");
		System.out.print("Name: ");
		String empName1 = scan.nextLine();
		System.out.print("House Worked: ");
		int  empHouseWorked1 = scan.nextInt();
		System.out.print("Hourly Rate: ");
		double empHouelyRate1 = scan.nextDouble();
		
		
		emp1.setEmployeeDetails(empName1, empHouseWorked1, empHouelyRate1);
		Line('-');
		emp1.displayEmployeeDetails();
		Line('*');
		
		scan.nextLine();
		
		//input data for second employee
		System.out.println("\nEnter details for Employee 2:");
		System.out.print("Name: ");
		String empName2 = scan.nextLine();
		System.out.print("House Worked: ");
		int  empHouseWorked2 = scan.nextInt();
		System.out.print("Hourly Rate: ");
		double empHouelyRate2 = scan.nextDouble();
		
		emp2.setEmployeeDetails(empName2, empHouseWorked2, empHouelyRate2);
		Line('-');
		emp2.displayEmployeeDetails();
		Line('*');
		
		
		
		scan.close();
	}//end of main method
	
	//Line method
	public static void Line(char symbol) {
		//System.out.println("-------------------------------");
		for(int i=1;i<50;i++) {
			System.out.print(symbol);
		}
		
	}


}
