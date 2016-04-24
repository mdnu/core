/**
 * Create an array of 4 random numbers (each between 0 and 1). Use one-step array allocation. 
 * Loop down the array and print out the values.
 */

package corejava.basicsyntax;

public class FourNums {

	public static void main(String[] args) {
		double[] values = {Math.random(), Math.random(), Math.random(), Math.random()};
		for (double value : values) {
			System.out.println(value);
		}
	}
}
