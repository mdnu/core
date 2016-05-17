package corejava.collections;

/**
 * Test the NumbersMap Map class by creating your own Maps of number names.
 * @author m
 *
 */

public class NumbersMapTest {

	public static void main(String[] args) {
		NumbersMap mapper = new NumbersMap();
		System.out.println("english names");
		printNumbers(mapper, 31);
		String[] frenchNumbers = {"zero", "un", "deux", "trois",
						"quatre", "cinq", "six", "sept",
						"huit", "neuf", "dix", "onze",
						"douze", "treize", "quatorze", "quinze",
						"seize", "dix-sept", "dix-huit", "dix-neuf",
						"vignt"};
		mapper = new NumbersMap(frenchNumbers);
		System.out.println("french names");
		printNumbers(mapper, 31);
	}
	
	/**
	 * helper class method for printing out numbers.
	 */
	private static void printNumbers(NumbersMap mapper, int n) {
		for (int i = 0; i < n; i++) {
			System.out.printf("the value of %s is %s.%n", i, mapper.wordForNumber(i));
		}
	}
}
