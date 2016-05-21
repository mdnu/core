package corejava.eventhandling;

import javax.swing.*;

public class Colour4Frame extends JFrame {
	public Colour4Frame() {
		super("use an anonymous inner class");
		setContentPane(new Colour4Panel());	// call to Colour4Panel
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Colour4Frame();
	}
}
