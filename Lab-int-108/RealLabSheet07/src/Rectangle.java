
public class Rectangle {
	//private two attribute
	/*private float length;
	private float width;
	
	//default Constructor
	Rectangle(){
		length = 1.0f;
		width = 1.0f;
	}*/
	//private two attribute
	
	private float length=1.0f;
	private float width=1.0f;
	
	//default Constructor
		Rectangle(){}
		
		//Parameterize Constructor
		Rectangle(float length,float width){
			this.length=length;
			this.width=width;
		}
		
		public float getLength() {
			return this.length;
		}
		
		public void setLength(float length) {
			this.length = length;
		}
		
		public float getWidth() {
			return this.width;
		}
		
		public void setWidth(float width) {
			this.width = width;
		}
	
		//Medthod to calculate area
		public double getArea() {
			return this.length * this.width;
		}
		
		//Medthod to calculate perimeter
		public double getPerimeter() {
			return 2 * (this.length + this.width);
		}
		
		//method display
		public String showData() {
			return "Rectangle[length = " + this.length + ",width = "+ this.width+"]";
		}
		
		//Medthod to display using toString
		public String toString() {
			return "Rectangle[length = " + this.length + ",width = "+ this.width+"]";
		}

}
