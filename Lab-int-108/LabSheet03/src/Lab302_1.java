import javax.swing.JOptionPane;
public class Lab302_1 {

	public static void main(String[] args) {
		
		String inputEmail;
		
		boolean chkEmail = false;
		while(true) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail: ");
			while(inputEmail.startsWith("@")||inputEmail.startsWith(" ")) {
				inputEmail = JOptionPane.showInputDialog("Input your e-mail, again: ");
				
			}
			chkEmail = inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("hotmail.com");
			if(chkEmail) {
				JOptionPane.showMessageDialog(null, "Your e-mail is " + inputEmail);
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
				continue;
			}
			
		}
		
		
	}

}
