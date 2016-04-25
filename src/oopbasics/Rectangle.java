package oopbasics;

public class Rectangle {
	public double width, height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
	return height;
	}
	
	public double getArea() {
		return (width * height);
	}
}
