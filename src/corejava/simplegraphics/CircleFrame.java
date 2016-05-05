package corejava.simplegraphics;

import java.awt.*;
import javax.swing.*;

/**
 * Make a black window that draws 500 small white circles at 
 * RANDOM locations within the window frame. The drawing code
 * should not know the panel size ahead of time. (i.e. we use
 * getWidth() and getHeight() methods). Interactively stretch
 * the frame to be different sizes and be sure your drawing
 * changes accordingly.
 * @author m
 */

public class CircleFrame extends JFrame {
	/**
	 * constructor
	 */
	public CircleFrame() {
		super("drawing shapes...");	// call JFrame constructor
		setContentPane(new CirclePanel(Color.BLACK));	// call CirclePanel constructor
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	/**
	 * main
	 */
	public static void main(String[] args) {
		new CircleFrame();
	}
}
