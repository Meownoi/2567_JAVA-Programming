import javax.swing.*;
public class Lab302 {

	public static void main(String[] args) {
		
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail: ");
		
		boolean validateEmail = true;
		
		validateEmail = inputEmail.startsWith("@")||inputEmail.contains(" ");
		
		while(validateEmail != true) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail, again: ");
			
		}
		if(inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("hotmail.com")) {
			JOptionPane.showMessageDialog(null, "Your e-mail is" + inputEmail);
		}else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
		}
		
	}

}
