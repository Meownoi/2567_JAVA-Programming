import java.util.*;
public class Ex403 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fullName; //the input line entered by user.
		String firstName;//the first name, extracted from the input.
		
		System.out.print("Please enter your name, seperated by a space.");
		System.out.print(":");
		fullName = input.nextLine();
		
		int space = fullName.indexOf(' ');//find space bar
		firstName = fullName.substring(0,space);//get first name
		//System.out.print(firstName);
		
		
		//to get the middle name
		System.out.println(abberviatName(fullName)+firstName);
		input.close();
	}//end of main method
	
	public static String abberviatName(String fName) {
		String initailLetter="";
		
		for(int i = 0;i<fName.length();i++) {
			if(fName.charAt(i)== ' ') {
				initailLetter = (initailLetter+fName.charAt(i+1)).toUpperCase();
				initailLetter = initailLetter+".";
			}
			
		}//end for
		return initailLetter;
	}//end of abb method

}
