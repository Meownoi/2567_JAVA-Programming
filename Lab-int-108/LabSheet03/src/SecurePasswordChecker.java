import java.util.*;
public class SecurePasswordChecker {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter your password(type 'exit' to quit): ");
			String password = scan.nextLine();
			
			if(password.equalsIgnoreCase("exit")) {
				System.out.println("Programm terminate");
				break;
			}
			
			String errors = " ";
			if(password.length()<8) 
			{
				errors += "- Password must be at least 8 character long.\n";
				
			}
			boolean hasUpperCase = false;
			boolean hasLowerCase = false;
			boolean hasDgit = false;
			
			for(int i =0 ; i<password.length() ; i++) 
			{
				char ch = password.charAt(i);
				if(ch >= 'A' && ch<='Z') {
					hasUpperCase = true;
				}else if(ch >= 'a' && ch <='z') {
					hasLowerCase = true;
				}else if(ch >='0'&&ch<='9')
				{
					hasDgit = true;
				}
			}
			if(!hasUpperCase) {
				errors += "- Password must cuntain at least one uppercase letter(A-Z).\n";
			}
			if(!hasLowerCase) {
				errors += "- Password must cuntain at least one lowercase letter(a-z).\n";
			}
			if(!hasDgit) {
				errors += "- Password must cuntain at least one Digit(0-9).\n";
			}
			
			//display errors or success message
			if(errors.isEmpty()) {
				System.out.println("Your password is secure.");
				break;
			}else {
				System.out.print("Password validation errors.");
				System.out.println(errors);
			}
			
		}//end while
		scan.close();
	}

}
