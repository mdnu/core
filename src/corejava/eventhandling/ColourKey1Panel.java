package corejava.eventhandling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColourKey1Panel extends JPanel {
	public ColourKey1Panel() {
		setBackground(Color.BLACK);
		addKeyListener(new ColourKeyChanger());	// call to ColourKeyChanger named inner class
		setFocusable(true);
		requestFocusInWindow();
	}
	
	private class ColourKeyChanger extends KeyAdapter {
		@Override
		public void keyTyped(KeyEvent event) {
			String key = String.valueOf(event.getKeyChar());
			switch (key) {
			case "r" : setBackground(Color.RED); break;
			case "o" : setBackground(Color.ORANGE); break;
			case "y" : setBackground(Color.YELLOW); break;
			case "g" : setBackground(Color.GREEN); break;
			case "b" : setBackground(Color.BLUE); break;
			case "v" : setBackground(Color.MAGENTA); break;
			}
		}
	}
}
