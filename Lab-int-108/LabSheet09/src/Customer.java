
public class Customer {
	//private to attribute(instant variable)
	private int id;
	private String name;
	private int discount;
	
	
	//parameterize constructor
	Customer(int id,String name,int discount){
		this.id = id;
		this.name = name;
		this.discount = discount;
	}
	
	//Getter & setter 
	public int getID() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getDiscount() {
		return this.discount;
	}
	
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	//toString Method
	
	public String toString() {
		return getName()+"(" + getID() + ")(" + getDiscount() + "% )";
	}
}
