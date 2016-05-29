package corejava.multithreaded;

/**
 * Main CoinFlipper class (used by FlipCoins1.java)
 * 'run' method flips 1000 coins and prints out
 * whenever it sees three or more consecutive heads.
 * Implements Runnable.
 * @author m
 *
 */

public class CoinFlipper implements Runnable {
	@Override
	public void run() {
		//int number = 0;
		int numHeads = 0;
		for (int i = 0; i < 1000; i++) {
			double coin = Math.random();
			if (coin < 0.5) {
				numHeads++;
			} else {
				numHeads = 0;
			}
			if (numHeads >= 3) {
				System.out.printf("%s got %d heads in a row.%n", 
								Thread.currentThread().getName(), numHeads);
			}
			//number++;
			//if (i == 999) {
			//	System.out.println(number);
			//}	// used to verify that indeed five threads each execute 1000 tasks concurrently.
		}
	}
}
