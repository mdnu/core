package corejava.collections.shapes;

/**
 * Circle model class
 * @author m
 */

public class Circle implements Shape {
	
	/**
	 * instance variable 'radius'
	 */
	private double radius;
	

	/**
	 * constructor
	 */
	public Circle(double radius) {
		this.radius = radius;
	}
	
	/**
	 * getters and setters
	 */
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**
	 * public method for calculating area of Circle
	 */
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	/**
	 * public method for setting the area of the Circle object
	 */
	public void setArea(double area) {
		radius = Math.sqrt(area / Math.PI);
	}
}
