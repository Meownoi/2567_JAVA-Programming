
public class Car {
	private String companyName;
	private String modelName;
	private int year;
	private double mileage;
	
	//Default Constructor
	Car(){
		companyName = "Unknown";
		modelName = "Unknown";
		year = 2000;
		mileage = 0.0;
		//this("Unknown","Unknown",2000,0.0);
	}
	
	//Parameterize Constructor
	Car(String companyName,String modelName,int year,double mileage){
		setCompanyName(companyName);
		setModelName(modelName);
		//Default Product Year 2000 if in put wrong
		setYear(year);
		this.mileage = mileage;
		
		
	}
	
	//getter and setter method()
	public void setCompanyName(String companyName) {
		if(companyName != null && !companyName.trim().isEmpty()) {
			this.companyName = companyName;
		}else {
			System.out.println("Error: invalid company name");
		}
	}
	
	public void setModelName(String modelName) {
		if(modelName != null && !modelName.trim().isEmpty()) {
			this.modelName = modelName;
		}else {
			System.out.println("Error: invalid model name");
		}
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		if(year<1886) {
			System.out.println("Error: invalid Year!");
		}else {
			this.year = year;
		}
	}
	
	public double getMileage() {
		return this.mileage;
	}
	
	//Display Method
	public void displayCarDetail() {
		System.out.println("company Name: " + companyName);
		System.out.println("model name: " + modelName);
		System.out.println("year : " + year);
		System.out.println("mileage: " + mileage);
	}
	
	
	

}
