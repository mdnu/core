package corejava.oopbasics;

public class SquareTest {
	public static void main(String[] args) {
		Square[] squares = new Square[100];
		
		for (int i = 0; i < squares.length; i++) {
			double width = 10 * Math.random();
			squares[i] = new Square(width);
		}
		
		double minWidth = Double.MAX_VALUE;
		double minArea = Double.MAX_VALUE;
		double maxWidth = 0.0;
		double maxArea = 0.0;
		for (Square s : squares) {
			double width = s.getWidth();
			double area = s.getArea();
			if (width < minWidth) {
				minWidth = width;
			}
			if (area < minArea) {
				minArea = area;
			}
			
			if (width > maxWidth) {
				maxWidth = width;
			}
			if (area > maxArea) {
				maxArea = area;
			}
		}
		System.out.println("min width: " + minWidth + 
						"\nmin area: " + minArea + 
						"\nmax width: " + maxWidth +  
						"\nmax area: " + maxArea);
		double sum = 0.0;
		for (Square s : squares) {
			s.setArea(maxArea);
			sum += s.getArea();
		}
		System.out.println("setting all squares to have max area...");
		System.out.println("sum of all squares with identical max area: " + sum);
		System.out.println("100 times max area: " + 100 * maxArea);
	}
}
