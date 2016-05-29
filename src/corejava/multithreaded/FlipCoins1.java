package corejava.multithreaded;
import java.util.concurrent.*;

/**
 * First exercise on multithreading.
 * To visualize task: Basically, what we do is have five people flip a coin
 * one thousand times - all at the same time. If any of them flip three 
 * heads in a row, we make a note of it in the output. 
 * @author m
 */

public class FlipCoins1 {

	public static void main(String[] args) {
		int poolSize = 10;
		/** Make a task list (initially empty): */
		ExecutorService tasks = Executors.newFixedThreadPool(poolSize);
		/** 
		 * Add tasks to list, using 'CoinFlipper' as runnable.
		 * Since i < 5, we use 5 threads.*/
		for (int i = 0; i < 5; i++) {
			tasks.execute(new CoinFlipper());	// invokes CoinFlipper run() method
		}
		tasks.shutdown();
	}
}
