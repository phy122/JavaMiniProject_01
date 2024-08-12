package Mission_10;

public class Rectangle {
	
	double width;
	double height;
	
	public Rectangle() {

	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	public double getArea() {
		return width * height;
	}
	
	
	
	

}
