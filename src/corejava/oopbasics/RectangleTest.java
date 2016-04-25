package corejava.oopbasics;

public class RectangleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle[] rectangles = new Rectangle[100];
		
		for (int i = 0; i < rectangles.length; i++) {
			double width = 20 * Math.random();
			double height = 10 * Math.random();
			rectangles[i] = new Rectangle(width, height);
		}
		
		double minWidth = Double.MAX_VALUE;
		double minHeight = Double.MAX_VALUE;
		double minArea = Double.MAX_VALUE;
		double maxWidth = 0.0;
		double maxHeight = 0.0;
		double maxArea = 0.0;
		for (Rectangle r : rectangles) {
			double width = r.getWidth();
			double height = r.getHeight();
			double area = r.getArea();
			if (width < minWidth) {
				minWidth = width;
			}
			if (height < minHeight) {
				minHeight = height;
			}
			if (area < minArea) {
				minArea = area;
			}
			
			if (width > maxWidth) {
				maxWidth = width;
			}
			if (height > maxHeight) {
				maxHeight = height;
			}
			if (area > maxArea) {
				maxArea = area;
			}
		}
		System.out.println("min width: " + minWidth + 
						"\nmin height: " + minHeight + 
						"\nmin area: " + minArea + 
						"\nmax width: " + maxWidth + 
						"\nmax height: " + maxHeight + 
						"\nmax area: " + maxArea);
	}
}
