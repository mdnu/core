package corejava.oopmore;

/**
 * Represents a simple Rectangle.
 * @author m
 * 
 */
public class Rectangle {
	public double width, height;
	
	/**
	 * Builds a Rectangle with given width and height.
	 * @param width
	 * @param height
	 */
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	/**
	 * Returns the current width.
	 * @return
	 */
	public double getWidth() {
		return width;
	}
	
	/**
	 * Returns the current height.
	 * @return
	 */
	public double getHeight() {
	return height;
	}
	
	/**
	 * Sets the current Rectangle width.
	 * @param width
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	
	/**
	 * Sets the current Rectangle height.
	 * @param height
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	/**
	 * Computes and returns the current area.
	 * @return
	 */
	public double getArea() {
		return (width * height);
	}
	
	@Override
	public String toString() {
		return "rectangle(width: " + width + 
						", height: " + height + 
						", area:" + getArea() + ")";
	}
}
