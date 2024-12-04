import java.util.*;
public class Lab209 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final double BASE_SALARY = 1000.0;
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1;
		
		
		int sales;
		double salary;
		
		while(true) {
			System.out.print("Enter gross sales for the salesperson(or -1 to end): ");
			sales = input.nextInt();
			
			//check for sentinel value
			if(sales==SENTINEL) {
				break;
			}
			//compute salary
			salary = BASE_SALARY + (sales * COMMISSION_RATE);
			//Display the salary
			System.out.printf("The saleperson's salary is : $%,.2f%n%n",salary);
			
			
		}//end while
		System.out.println("bye");
		
		
		input.close();
	}

}
