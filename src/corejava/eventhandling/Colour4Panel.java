package corejava.eventhandling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Repeat the previous problem, but this time use an anonymous inner class.
 * @author m
 */

public class Colour4Panel extends JPanel {
	public Colour4Panel() {
		setBackground(Color.BLACK);
		addMouseListener(new MouseAdapter() {
			/**
			 * anonymous inner class in these braces.
			 * @param e
			 */
			@Override
			public void mousePressed(MouseEvent e) {
				if (getBackground() == Color.BLACK) {
					setBackground(Color.WHITE);
				} else {
					setBackground(Color.BLACK);
				}
			}
		});
	}
}
