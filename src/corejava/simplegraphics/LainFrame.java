package corejava.simplegraphics;

import javax.swing.*;

/**
 * Save an image into your project folder. Make a popup window that
 * draws the image. Remember that the image goes in a location relative
 * to the root of the compiled code. next, draw some graffiti on it.
 * @author m
 */

public class LainFrame extends JFrame {
	/**
	 * constructor
	 */
	public LainFrame(String relativePath) {
		super("let's all love lain");
		setContentPane(new LainPanel(relativePath));
		/**
		 * above calls LainPanel constructor and retrieves relativePath
		 * from the main method below.
		 */
		setSize(703, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LainFrame("images/Lain.gif");
	}
}
