package corejava.generics;

import java.util.Arrays;

/**
 * Test class for NumbersMapTwo.
 * We test varargs for the wordsForNumbers method.
 * Based on the original NumbersMapTest class in corejava.collections.
 * @author m
 */

public class NumbersMapTwoTest {

	public static void main(String[] args) {
		NumbersMapTwo mapper = new NumbersMapTwo();
		System.out.println("english names, one at a time:");
		printNumbers(mapper, 6);
		System.out.println("english names, as a group:");
		printNumbers(mapper);
		System.out.println();
		String[] frenchNumbers = {"zero", "un", "deux", "trois",
						"quatre", "cinq"};
		mapper = new NumbersMapTwo(frenchNumbers);
		System.out.println("french names, one at a time:");
		printNumbers(mapper, 6);
		System.out.println("french names, as a group:");
		printNumbers(mapper);
	}
	
	/**
	 * helper class method for printing out numbers.
	 */
	private static void printNumbers(NumbersMapTwo mapper, int n) {
		for (int i = 0; i < n; i++) {
			System.out.printf("the value of %s is %s.%n", i, mapper.wordForNumber(i));
		}
	}
	
	/**
	 * new helper class method, similar to above but handles varargs.
	 */
	private static void printNumbers(NumbersMapTwo mapper) {
		String[] output = mapper.wordsForNumbers(0, 1, 2, 3, 4, 5);
		System.out.printf("names for [0, 1, 2, 3, 4, 5] are %s.%n", Arrays.asList(output));
	}
}
