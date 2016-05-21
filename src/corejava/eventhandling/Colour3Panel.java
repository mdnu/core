package corejava.eventhandling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Colour3Panel extends JPanel {
	public Colour3Panel() {
		setBackground(Color.BLACK);
		addMouseListener(new Colour3Changer());
	}
	
	/**
	 * named inner class 'Colour3Changer'
	 * @author m
	 */
	private class Colour3Changer extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			if (getBackground() == Color.BLACK) {
				setBackground(Color.WHITE);
			} else {
				setBackground(Color.BLACK);
			}
		}
	}
}
