
public class employee {
	//private attribute
	private String name;
	private int houseWorked;
	private double hourlyRate;
	
	//Method to set employee details
	public void setEmployeeDetails(String empName,int hours,double rate) {
		name = empName;
		houseWorked = hours;
		hourlyRate = rate;
	}
	
	//Method to calculate salary
	public double calculateSalary() {
		double salary = houseWorked * hourlyRate;
		if(houseWorked > 40) 
		{
			double bonus = salary * 0.10;
			salary += bonus;
		}
			return salary;
	}
	//Method to display employee details
	public void displayEmployeeDetails() {
		System.out.println("\nName: "+ name);
		System.out.println("Hours Worked: "+ houseWorked);
		System.out.println("Hourly Rate: "+ hourlyRate);
		System.out.println("Total Salary: "+ calculateSalary());


		
	}
}
		
