/**
 * Create an array of 100 random numbers. Use two-step array allocation. 
 * After the array has been created, print out the sum of the square roots of the values.
 */

package corejava.basicsyntax;

public class HundredNums {

	public static void main(String[] args) {
		double[] numbers = new double[100];
		
		for (int i = 0; i < 100; i++) {
			numbers[i] = Math.random();
		}
		
		double sum = 0.0;
		for (double number : numbers) {
			sum += Math.sqrt(number);
		}
		System.out.println(sum);
	}
}
