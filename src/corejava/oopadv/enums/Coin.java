/*
 * 1. Make a Coin enum with instances named HEADS and TAILS.
 * 2. Make a static flip method that returns Coin.HEADS and Coin.TAILS
 * with equal probability.
 */

package corejava.oopadv.enums;

public enum Coin {
	HEADS, TAILS;
	
	/** Returns Coin.HEADS and Coin.TAILS with equal probability. */
	public static Coin flip() {
		if (Math.random() < 0.5) {
			return HEADS;
		} else {
			return TAILS;
		}
	}
}
