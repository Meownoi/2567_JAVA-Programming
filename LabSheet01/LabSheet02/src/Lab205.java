import javax.swing.*;
import java.text.DecimalFormat;
import java.util.*;
public class Lab205 {

	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		//System.out.print(balance);
		int moneyWithdraw = Integer.parseInt(JOptionPane.showInputDialog("Your balance " + balance + "\nInput money to withdraw:")); 

		if(moneyWithdraw > balance) 
		{
			JOptionPane.showMessageDialog(null, "ERROR!! : Cannot withdraw more than balance , money you me kae nee ai stupid lmao",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if (moneyWithdraw>50000) {
			JOptionPane.showMessageDialog(null, "ERROR!! : Cannot withdraw more than 50K Ai lop mak!!!",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if(moneyWithdraw%100!=0) {
			JOptionPane.showMessageDialog(null, "ERROR!! : Cannot withdraw "+(moneyWithdraw%100)+" baht.",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
			
		}
		else {
			JOptionPane.showMessageDialog(null, "You withdraw " + moneyWithdraw + " baht." + "\n1,000 = "+(moneyWithdraw/1000)
					+"\n500 = "+ ((moneyWithdraw%1000)/500)
					+"\n100 = "+((moneyWithdraw%500)/100));
		}
	}

}
