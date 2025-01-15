public class Product {
	
	private String name;
	private double price;
	private double vat;
	
	public void setProductDetails(String nName, double nPrice, double vatRate) {
		name = nName;
		price = nPrice;
		vat = vatRate;
	}
	
	public double calculateTotalPrice() {
		return price += price*(vat/100);
	}
	
	public void displayProductDetails() {
		System.out.println("Product Details : ");
		System.out.println("Product Name : "+name);
		System.out.println("Price (Before VAT): "+price);
		System.out.println("Price (After  VAT): "+calculateTotalPrice());

	}
	 
}