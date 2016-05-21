package corejava.eventhandling;

import javax.swing.*;

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
