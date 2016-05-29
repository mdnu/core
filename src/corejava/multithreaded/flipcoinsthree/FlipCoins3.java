package corejava.multithreaded.flipcoinsthree;
import java.awt.*;
import java.util.concurrent.*;
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

public class FlipCoins3 extends JFrame {
	public FlipCoins3() {
		super("flipping coins");
		getContentPane().setLayout(new GridLayout(5, 1));
		/**
		 * Familiar logic below, slightly modified.
		 */
		int poolSize = 20;
		ExecutorService tasks = Executors.newFixedThreadPool(poolSize);
		for (int i = 0; i < 10; i++) {
			JLabel label = new JLabel("label #" + i);
			label.setFont(new Font("SansSerif", Font.PLAIN, 60));
			tasks.execute(new CoinFlipperLabeled(label));	// call to CoinFlipperLabeled. Executes its overriden 'run' method.
			add(label);
		}
		setSize(1600, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FlipCoins3();
	}
}
