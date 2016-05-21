package corejava.eventhandling;

import javax.swing.*;

/**
 * Event Handling #1: Using a separate mouse listener.
 * 
 * Make a popup window (JFrame) whose content pane (JPanel) toggles
 * back and forth between black and white each time you click the window.
 * Use a separate class as the mouse listener. 
 * 
 * Note that you don't need to manipulate any data structures in the JPanel
 * or call repaint (as in the more complex circle-drawing examples in lecture).
 * However, your mousePressed method still needs to be able to call the panel's
 * setBackground method (or call a custom method in te panel that uses
 * set-Background internally).
 * @author m
 */

public class Colour1Frame extends JFrame {
	public Colour1Frame() {
		super("separate class as a MouseListener");
		setContentPane(new Colour1Panel());	// call to Colour1Panel constructor
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Colour1Frame();
	}
}
