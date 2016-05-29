package corejava.multithreaded.flipcoinsthree;
import javax.swing.*;

/**
 * Third exercise on multithreading.
 * This time we put five JLabel objects (components that display strings) 
 * in a JFrame, and use the JLabel to count the # of flips that are heads.
 * Each thread flips 1000 coins and prints the # of heads in the label,
 * updating the count as each head is found.
 * Uses 'StaticJLabels' as a template.
 * @author m
 */

public class CoinFlipperLabeled implements Runnable {
	private JLabel label;
	
	/**
	 * Constructor.
	 */
	public CoinFlipperLabeled(JLabel label) {
		//label.setText(String.format("Heads: %3d", 0));
		this.label = label;
	}
	
	/**
	 * Override 'run'
	 * This is where we place the logic that was originally
	 * in the CoinFlipper class, though modified.
	 */
	@Override
	public void run() {
		pause(200);
		int numHeads = 0;
		for (int i = 0; i < 1000; i++) {
			double coin = Math.random();
			if (coin < 0.5) {
				numHeads++;
			}
			label.setText(String.format("%s heads: %3d", Thread.currentThread().getName(),numHeads));
			pause(5);
		}
	}
	
	/**
	 * Helper class 'pause'
	 * pauses the thread within 'millis' milliseconds.
	 */
	private static void pause(int millis) {
		try {
			Thread.sleep(millis);
		} catch(InterruptedException ie) {}
	}
}
