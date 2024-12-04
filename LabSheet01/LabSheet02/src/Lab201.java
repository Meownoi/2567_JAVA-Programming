import javax.swing.*;
import java.text.DecimalFormat;
public class Lab201 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		
		DecimalFormat frm = new DecimalFormat();
		
		int numberOfCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		
		double totalPrice = BUFFET * numberOfCustomer;
		//System.out.printf("Among to be paid is %.2f baht." , totalPrice);
		
		int isMember;
		
		do {
			 isMember =  JOptionPane.showConfirmDialog(null,"Total price is " + frm.format(totalPrice) + " baht." + "\nDo you have a member card?");
		}while(isMember == JOptionPane.CANCEL_OPTION);
		if(isMember == JOptionPane.YES_OPTION)//ismember==0
		{
			double priceAfterDiscount = totalPrice * 0.90;//priceAfterDiscount = totalPrice-(totalPrice*10/100)
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(priceAfterDiscount) + " baht.");
		}else if(isMember==JOptionPane.NO_OPTION)//ismember==1
		{
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(totalPrice) + " baht.");
		}


	}

}
