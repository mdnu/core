package oopbasics;

public class Square {
	public double width;
	
	public Square(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getArea() {
		return (width * width);
	}
	
	public void setArea(double area) {
		width = Math.sqrt(area);
	}
}
