
public class DemoCar {

	public static void main(String[] args) {
		Car car = new Car("Chevrolet","Cruze",2009,150000.0);
		car.displayCarDetail();
		
		Space();
		//update
		System.out.println("Update Car Details: ");
		car.setCompanyName("Toyota");
		car.setModelName("Corolla");
		car.setYear(2015);
		car.displayCarDetail();
		//test invalid
		car.setYear(1000);
		car.setModelName(" ");
		car.setCompanyName("");

	}
	
	public static void Space() {
		System.out.println();
	}

}
