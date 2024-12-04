import java.util.*;
public class Lab102 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
		long minutes = scan.nextLong();
		long minuteYear = 60 * 24 * 365;
		long years = minutes / minuteYear;
		long remain = minutes % minuteYear;
		long days = remain / (60*24);
		
		System.out.print(""+ minutes + " minutes is approximately " + years + " years and " + days + " days");

		scan.close();
	}

}