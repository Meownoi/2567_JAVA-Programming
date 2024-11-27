import java.util.*;
import java.text.*;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//กำหนด object ในการรับขอมูลทาง Keyboard
		
			Scanner input = new Scanner(System.in);
			//กำหนด object ในการจัดรูปแบบตัวเลข
			DecimalFormat frm = new DecimalFormat("#,###.00");
			//รับและแสดงผลช้อมูลชื่อสิ้นค้า
			System.out.print("Input product name: ");
			String productName = input.nextLine();
			//แสดงและรับข้อมูลจำนวนสินค้า
			System.out.print("Input product unit: ");
			int productUnit = input.nextInt();
			//รับข้อมูลราคาสินค้า
			System.out.print("Input price per unit: ");
			float productPrice = input.nextFloat();
			System.out.println();//เว้น 1 บรรทัด
			//คำนวนหาผลรวมของราคาสินค้า
			float totalPricrOfProduct = productUnit * productPrice;
			System.out.println("Total Price is "+frm.format(totalPricrOfProduct)+" baht.");
			//คำนวนภาษีเพิ่ม 7%
			
			//float totalwithVat = totalPricrOfProduct + (totalPricrOfProduct*7/100);
			float totalwithVat = totalPricrOfProduct * 1.07f;
			System.out.println("Add VAT 7% is "+frm.format(totalwithVat)+" baht.");
			System.out.println();//เว้น 1 บรรทัด
			//Output using String.format and printf
			String frmtotalwithVat = String.format("%,.2f",totalwithVat);
			System.out.println("Output using String.format");
			System.out.printf("Add VAT 7%% is "+frmtotalwithVat+ " baht.");
			System.out.println();//เว้น 1 บรรทัด
			System.out.printf("\nOutput using printf");
			System.out.printf("\nAdd VAT 7%% is "+frmtotalwithVat+ " baht.");
			
			
			input.close();
	}

}
