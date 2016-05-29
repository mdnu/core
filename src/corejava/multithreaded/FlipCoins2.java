package corejava.multithreaded;
import java.util.concurrent.*;

/**
 * Second exercise on multithreading.
 * This time, we make only one instance of our main class.
 * i.e. we don't use the CoinFlipper class but rather we directly
 * implement Runnable.
 * 
 * To visualize task: Basically, what we do is have five people flip a coin
 * one thousand times - all at the same time. If any of them flip three 
 * heads in a row, we make a note of it in the output. 
 * @author m
 */

public class FlipCoins2 implements Runnable {
	public static void main(String[] args) {
		/**
		 * note that you cannot do tasks.execute(this) directly
		 * from the main method. When we're in 'main,' no instance
		 * of the surrounding class has been instantiated, so there
		 * is no "this" to use. So we have to make a call to the
		 * constructor which executes tasks.execute(this).
		 * 
		 * Similarly, we cannot make an instance of an inner class
		 * directly from the main method for the same reason.
		 */
		new FlipCoins2();
	}
	
	/**
	 * Constructor.
	 * This is where we implement the logic that was originally
	 * in FlipCoins1's 'main' method.
	 */
	public FlipCoins2() {
		int poolSize = 10;
		ExecutorService tasks = Executors.newFixedThreadPool(poolSize);
		for (int i = 0; i < 5; i++) {
			tasks.execute(this);	// executes the overriden 'run' below.
		}
		tasks.shutdown();
	}
	
	/**
	 * Override 'run'
	 * This is where we place the logic that was originally
	 * in the CoinFlipper class.
	 */
	@Override
	public void run() {
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
		}
	}
}
