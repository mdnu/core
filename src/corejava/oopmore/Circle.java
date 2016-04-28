package corejava.oopmore;

/**
 * Represents a simple Circle.
 * @author m
 * 
 */
public class Circle {
	private double radius;
	
	/** 
	 * Builds a Circle object with given input radius 
	 * @param radius
	 */
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/** 
	 * Returns current radius. Units are same as the area's units.
	 * @return radius
	 */
	public double getRadius() {
		return radius;
	}
	
	/** 
	 * Sets the current radius.
	 * @param radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/** 
	 * Calculates the area of the current Circle object.
	 * @return Area
	 */
	public double getArea() {
		return (Math.PI * radius * radius);
	}
	
	/** 
	 * Sets the Circle area by changing the Circle radius.
	 * The resulting area may not be exactly what is set, due to roundoff
	 * error when working with values of type double.
	 * @param area
	 */
	public void setArea(double area) {
		radius = Math.sqrt(area / Math.PI);
	}
	
	/** 
	 * Prints info about the Circle object
	 */
	@Override
	public String toString() {
		return ("circle(radius: " + radius + ", area: " + getArea() + ")");
	}
}
