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

	            double price;
	            do {
	                System.out.print("Input product price: ");
	                price = scanner.nextDouble();

	            scanner.nextLine(); // Consume newline
	        

	        double totalStockPrice = 0;
	        Line();

	        for (product product : productList) {
	            double productValue = product.calculate();
	            totalStockPrice += productValue;

	            System.out.printf("Product ID: %s  ,Unit: %d  ,Price per unit: %.2f , Total price: %.2f\n",
	                    product.getId(), product.getUnit(), product.getPrice(), productValue);
	        }

	        Line();
	        System.out.printf("Total price of all products: %.2f baht\n", totalStockPrice);

	        scanner.close();
	    }
    
    public static void Line() {
    	for(int i=1 ; i<60;i++) {
    		System.out.print("-");
    	}
    }
    
}