package corejava.eventhandling;

import javax.swing.*;

/**
 * Repeat the previous problem, but this time use a named inner class.
 * @author m
 */

public class Colour3Frame extends JFrame {
	public Colour3Frame() {
		super("use a named inner class in JPanel");
		setContentPane(new Colour3Panel());	// call to Colour3Panel
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Colour3Frame();
	}
}
