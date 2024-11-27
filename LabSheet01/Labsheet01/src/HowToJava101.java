import java.util.*;
import java.text.*;
public class HowToJava101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		System.out.print("Input Product Name\t: ");
		String productName = input.nextLine();
		System.out.print("Input Product Unit\t\t: ");
		int productUnit = input.nextInt();
		System.out.print("input Product per unit\t: ");
		float productPrice = input.nextFloat();
		float totalProductPrice = productUnit * productPrice;
		System.out.println("-----------------------------------");
		System.out.println("Total Price is "+frm.format(totalProductPrice)+" baht.");
		System.out.println("-----------------------------------");
		System.out.print("How many discount (%)\t: ");
		int discount = input.nextInt();
		System.out.println("-----------------------------------");
		float totalDiscount = totalProductPrice*discount/100;
		float finalPrice = totalProductPrice - totalDiscount;
		System.out.print("Discount From "+ discount + "%"+"\t\t"+frm.format(totalDiscount)+" baht.");
		System.out.print("\nAmount to be paid\t\t"+frm.format(finalPrice)+" baht.");

		input.close();
	}

}
