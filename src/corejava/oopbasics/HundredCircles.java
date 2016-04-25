package corejava.oopbasics;

/**
 * @author m
 *
 */
public class HundredCircles {

	public static void main(String[] args) {
		Circle[] circles = new Circle[100];
		for (int i = 0; i < circles.length; i++) {
			circles[i] = new Circle(10*Math.random());
		}
		
		double minArea = Double.MAX_VALUE;
		double maxArea = 0.0;
		double sum = 0.0;
		for (Circle c : circles) {
			double area = c.getArea();
			sum += area;
			if (area < minArea) {
				minArea = area;
			}
			if (area > maxArea) {
				maxArea = area;
			}
		}
		System.out.println("largest area: " + maxArea + 
						"\nsmallestArea: " + minArea + 
						"\nsum: " + sum);
	}
}
