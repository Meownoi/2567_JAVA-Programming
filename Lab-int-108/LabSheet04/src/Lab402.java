import javax.swing.*;
public class Lab402 {

	public static void main(String[] args) {
		
		JOptionPane.showInputDialog("Input Year: ");
		int year;
		
		checkYear();
		isLeapYear();

	}
	
	public static boolean checkYear(int year) {
		return year >=1000&&year<=3000;
	}
	
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 !=0)||(year%400==0);
	}

}
