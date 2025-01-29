
public class product {
	private String productID;
	private int productUnit;
	private double productPrice;
	
	//setter & getter
	public void setId(String pId) {
		this.productID = pId;
	}
	
	public String getId() {
		return productID;
	}
	
	public void setUnit(int proUnit) {
		this.productUnit = proUnit;
	}
	
	public int getUnit() {
		return this.productUnit;
	}
	
	public void setPrice(double proPrice) {
		this.productPrice = proPrice;
	}
	
	public double getPrice() {
		return productPrice;
	}
	
	public double calculate() {
		return productUnit + productPrice;
	}
	
	

}
