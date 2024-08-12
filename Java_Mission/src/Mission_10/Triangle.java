package Mission_10;

public class Triangle {
	double width;
	double height;
	
	
	public Triangle() {
	
	}


	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}


	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}
	
	public double getArea() {
		return width * height / 2;
	}
	
	
	
	
	

}
