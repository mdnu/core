/**
 * Make a program that flips a coin 10 times, saying “heads” or “tails” each time. 
 * Recall that Math.random() returns a double between 0 and 1.
 */

package corejava.basicsyntax;

public class FlipCoins1 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (Math.random() < 0.5) {
				System.out.println("heads");
			} else {
				System.out.println("tails");
			}
		}
	}
}
