package oopbasics;

public class Circle {
	public double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return (Math.PI * radius * radius);
	}
	
	public void setArea(double area) {
		radius = Math.sqrt(area / Math.PI);
	}
	
	public void printInfo() {
		System.out.println("radius: " + radius + ", area: " + getArea());
	}
}
