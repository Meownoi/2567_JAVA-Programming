import javax.swing.*;
public class Lab203 {

	public static void main(String[] args) {
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input your weight:")); 
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input your height:")); 
		
		double BMI = weight * (height*height);
		if(BMI <18.5) {
			JOptionPane.showMessageDialog(null, "BMI = " + BMI + "\nYou're Underweight");
		}
	}

}
