package corejava.collections.shapes;

import corejava.oopmore.Rectangle;

public class Square extends Rectangle {
	
	/**
	 * Builds a Square object with given side parameter
	 * for both its width and height.
	 * @param side
	 */
	public Square(double side) {
		super(side, side);
	}
	
	private void setSides(double side) {
		super.setWidth(side);
		super.setHeight(side);
	}
	
	/**
	 * Sets both width and height.
	 * Identical in function to setWidth method.
	 */
	@Override
	public void setHeight(double height) {
		setSides(height);
	}
	
	/**
	 * Sets both width and height.
	 * Identical in function to setHeight method.
	 */
	@Override
	public void setWidth(double width) {
		setSides(width);
	}
	
	/**
	 * Sets the area by modifying the (common) length of the sides.
	 * Resulting area may not be exactly what is set, due to roundoff error
	 * when working with values of type double.
	 */
	public void setArea(double area) {
		setSides(Math.sqrt(area));
	}
}

