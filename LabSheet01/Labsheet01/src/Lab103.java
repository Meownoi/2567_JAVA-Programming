import javax.swing.JOptionPane;
public class Lab103 {

	public static void main(String[] args) {
		String timeInput = JOptionPane.showInputDialog(null,"Input time parking (minutes):",JOptionPane.QUESTION_MESSAGE);
		
		int time = Integer.parseInt(timeInput);		
		int hours = time/ 60;
        int remainingMinutes = time % 60;
        
        double fee = (hours * 50) + (remainingMinutes * 0.25);

        String message = "You parking " + hours + " Hour " + remainingMinutes + "  Minute." + "\nAmount to be paid is " + fee + " baht";
        JOptionPane.showMessageDialog(null, message, "message",JOptionPane.INFORMATION_MESSAGE);
        
	
	}

}