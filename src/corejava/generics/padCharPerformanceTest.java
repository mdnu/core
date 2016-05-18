package corejava.generics;


/**
 * Do timing tests to compare the performance of the two versions
 * of padChar from the lecture. See if you can verify the performance
 * claims from the lecture. Use printf to control the # of decimal places
 * in the elapsed time you print.
 * 
 * Result: confirms that String concatenation executes in quadratic time O(n^2)
 * while StringBuilder executes in linear time O(n).
 * note: O(n^2) is slower than O(n) since n^2 > n for n > 1.
 * @author m
 *
 */

public class padCharPerformanceTest {

	public static void main(String[] args) {
		/**
		 * we specify the size of the padding (via variable 'size'),
		 * and we run five tests. after each test, we double the size.
		 */
		int size = 10_000;
		for (int i = 0; i < 5; i++) {
			timeAccess(size);
			size *= 2;
		}
	}
	
	/**
	 * helper method to compute time elapsed to pad an initially
	 * empty string. we pad using the character "a"
	 * @param size
	 */
	public static void timeAccess(int size) {
		/**
		 * tests using padChars1
		 */
		String temp = null;
		System.out.printf("size = %,d.%n", size);
		long startTime = System.nanoTime();	// start timer here.
		temp = CharUtils.padChars1(size, "a");
		long endTime = System.nanoTime();	// end timer here.
		double elapsedTime = ((double)(endTime - startTime)) / 1_000_000_000;	// elapsed time in seconds.
		/**
		 * print result:
		 */
		System.out.printf("padChar1(String) : %.3f seconds.%n", elapsedTime);	// to three decimal places.
		
		/**
		 * tests using padChars2
		 */
		temp = null;
		System.out.printf("size = %,d.%n", size);
		startTime = System.nanoTime();	// start timer here.
		temp = CharUtils.padChars2(size, "a");
		endTime = System.nanoTime();	// end timer here.
		elapsedTime = ((double)(endTime - startTime)) / 1_000_000_000;	// elapsed time in seconds.
		/**
		 * print result:
		 */
		System.out.printf("padChar2(String) : %.3f seconds.%n", elapsedTime);	// to three decimal places.
		/**
		 * test if temp is still null after running above tests.
		 */
		if (temp == null) {
			System.out.print("variable is null");	// block doesn't run if size != 0.
		}
	}
}
