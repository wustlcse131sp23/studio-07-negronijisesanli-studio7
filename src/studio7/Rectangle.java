package studio7;

public class Rectangle {
	private double length;
	private double width;
//	private double area;
//	private double perimeter;
//	
//	public Rectangle() {
//		length = 0;
//		width = 0;
//		area = 0;
//		perimeter = 0;
//	}
//	
	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	public double getArea(){
		return length * width;
	}
	
	public double getPerimeter() {
		return 2 * (length + width);
	}
	
	public boolean isSquare() {
		return length == width;
	}
	
	public boolean isSmaller(Rectangle in) {
		return this.getArea()<in.getArea();
	}
	
	public static void main(String[] args) {
		Rectangle a = new Rectangle(0.8, 0.3);
		Rectangle b = new Rectangle(0.4, 0.4);
		System.out.println(a.getArea());
		System.out.println(b.getArea());
		System.out.println(a.getPerimeter());
		System.out.println(a.isSquare());
		System.out.println(a.isSmaller(b));
	}

}
