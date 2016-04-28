package corejava.oopmore;

/**
 * Test class for Square subclass of Rectangle model class.
 * @author m
 *
 */
public class SquareTest {

	public static void main(String[] args) {
		/**
		 * Test cases:
		 * Create squares, change their width/height, then
		 * print out their various parameters.
		 */
		System.out.println("creating square with side 10...");
		Square s = new Square(10);
		System.out.println(s + "\n");
		
		System.out.println("setting square width to 5...");
		s.setWidth(5);
		System.out.println("retrieving new info...");
		System.out.println(s + "\n");
		
		System.out.println("setting square height to 6...");
		s.setHeight(6);
		System.out.println("retrieving new info...");
		System.out.println(s + "\n");
		
		System.out.println("setting square area to 49...");
		s.setArea(49);
		System.out.println("retrieving new info...");
		System.out.println(s);
	}
}
