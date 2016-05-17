package corejava.collections.shapes;

/**
 * Shape interface
 * @author m
 */

public interface Shape {
	double getArea();
	
	/**
	 * Method for retrieving the sum of areas of shapes in an array.
	 * @param shapes
	 * @return sum
	 */
	public static double sumAreas(Shape[] shapes) {
		double sum = 0.0;
		for (Shape s : shapes) {
			sum += s.getArea();
		}
		return sum;
	}
}
