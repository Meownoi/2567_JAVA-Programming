
public class testRectangle {

	public static void main(String[] args) {
		//test constructor
		Rectangle r1 = new Rectangle();
		System.out.println(r1.showData());
		Spacing();
		System.out.println("Display data using toString() method");
		System.out.println(r1); //System.out.println(r1.toString());
		Spacing();
		Rectangle r2 = new Rectangle(1.2f,3.4f);
		System.out.println(r2);
		
		//test setters and getter method()
		r1.setLength(5.6f);
		r1.setWidth(7.8f);
		System.out.print(r1);
		System.out.println("Length is "+ r1.getLength());
		System.out.println("Width is" + r1.getWidth());
		
		//test getArea() and getPerimeter()
		Spacing();
		System.out.printf("Area is %.2f%n", r1.getArea());
		System.out.printf("perimeter is %.2f%n", r1.getPerimeter());
		
		System.out.printf("Area is %.2f%n", r2.getArea());
		System.out.printf("perimeter is %.2f%n", r2.getPerimeter());

	}
	
	public static void Spacing() {
		System.out.println();
	}

}
