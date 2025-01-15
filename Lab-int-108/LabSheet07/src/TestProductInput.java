import java.util.Scanner;

public class TestProductInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Product prod = new Product();
		
		System.out.print("Product Name: ");
		String pridName = scan.nextLine();
		System.out.print("Product Price: ");
		int  prodPrice = scan.nextInt();
		System.out.print("Enter VAT Rate(%): ");
		double prodVAT = scan.nextDouble();
		
		prod.setProductDetails(pridName, prodPrice, prodVAT);
		System.out.println();
		prod.displayProductDetails();

		scan.close();
	}

	}
