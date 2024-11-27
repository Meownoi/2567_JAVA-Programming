import javax.swing.*;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Input Product Name :");
		
		String strProductUnit = JOptionPane.showInputDialog("Input Product Unit :");
		int productUnit = Integer.parseInt(strProductUnit);
		
		double productPrice = Double.parseDouble(JOptionPane.showInputDialog("Input Price Per Unit"));
		
		double totalPriceOfProduct = productUnit * productPrice;
		
		double totalWithVat = totalPriceOfProduct *1.07;
		String frmTotalPriceOfProduct = String.format("%,.2f", totalPriceOfProduct);
		String frmtotalWithVat = String.format("%,.2f", totalWithVat);
		
		JOptionPane.showMessageDialog(null,"Total Price is "+frmTotalPriceOfProduct+" baht."+ "\nAdd VAT 7% is "+frmtotalWithVat+" baht.");
	}

}
