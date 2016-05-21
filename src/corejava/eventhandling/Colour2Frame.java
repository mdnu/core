package corejava.eventhandling;

import javax.swing.*;

/**
 * Repeat the previous problem, but this time put the mousePressed method
 * directly in the JPanel subclass.
 * @author m
 */

public class Colour2Frame extends JFrame {
	public Colour2Frame() {
		super("main JPanel implements MouseListener");
		setContentPane(new Colour2Panel());	// call to Colour2Panel
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Colour2Frame();
	}
}
