import java.util.*;
public class StockProduct {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        product[] productList = new product[4];

	        for (int i = 0; i < productList.length; i++) {
	            productList[i] = new product();

	            System.out.print("Input product ID: ");
	            productList[i].setId(scanner.nextLine());

	            int unit;
	            do {
	                System.out.print("Input product unit: ");
	                unit = scanner.nextInt();
	                if (unit > 0) {
	                    productList[i].setUnit(unit);
	                } else {
	                    System.out.println("Unit must be greater than 0.");
	                }
	            } while (unit <= 0);

	            double price;
	            do {
	                System.out.print("Input product price: ");
	                price = scanner.nextDouble();
	                if (price > 0) {
	                    productList[i].setPrice(price);
	                } else {
	                    System.out.println("Price must be greater than 0.");
	                }
	            } while (price <= 0);

	            scanner.nextLine(); // Consume newline
	        }

	        double totalStockValue = 0;
	        Line();

	        for (product product : productList) {
	            double productValue = product.calculate();
	            totalStockValue += productValue;

	            System.out.printf("Product ID: %s | Unit: %d | Price per unit: %.2f | Total value: %.2f\n",
	                    product.getId(), product.getUnit(), product.getPrice(), productValue);
	        }

	        Line();
	        System.out.printf("Total price of all products: %.2f baht\n", totalStockValue);

	        scanner.close();
	    }
    
    public static void Line() {
    	for(int i=1 ; i<60;i++) {
    		System.out.print("-");
    	}
    }
    
}