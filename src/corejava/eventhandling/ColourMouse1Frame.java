package corejava.eventhandling;

import javax.swing.*;

/**
 * Make a popup window that is black when the mouse is on the left side of the
 * window, and white when it is on the right side of the window. Use a MouseMotionListener
 * or MouseMotionAdapter, and the mouseMoved method. This method gets re-fired every few
 * pixels.
 * @author m
 */

public class ColourMouse1Frame extends JFrame {
	public ColourMouse1Frame() {
		super("use MouseMotionListener");
		setContentPane(new ColourMouse1Panel());
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ColourMouse1Frame();
	}
}
