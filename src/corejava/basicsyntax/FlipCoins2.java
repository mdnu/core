/**
 * Change the coin-flipping program of problem #2 to flip a coin the number of 
 * times the user specifies. You can use any of the three approaches from the lecture 
 * (command-line args, JOptionPane, Scanner). Note the required “import” statements 
 * at the top if you use JOptionPane or Scanner. See the slides for details.
 */

package corejava.basicsyntax;

import java.util.Scanner;

public class FlipCoins2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();	// no check for illegal values!
		for (int i = 0; i < a; i++) {
			if (Math.random() < 0.5) {
				System.out.println("heads");
			} else {
				System.out.println("tails");
			}
		}
	}
}
