package corejava.eventhandling;

import javax.swing.*;

/**
 * Make a popup window that turns R-O-Y-G-B-V when you press the corresp key.
 * Use a KeyListener or KeyAdapter and the keyTyped method.
 * 
 * Note: The notes show how to get a String from the keyEvent. However, panels
 * normally ignore keyboard events, so to make them respond, you must add these
 * two lines to the constructor of your JPanel subclass:
 * setFocusable(true);
 * requestFocusInWindow();
 * @author m
 */

public class ColourKey1Frame extends JFrame {
	public ColourKey1Frame() {
		super("use KeyListener");
		setContentPane(new ColourKey1Panel());	// call to ColourKey1Panel
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ColourKey1Frame();
	}
}
