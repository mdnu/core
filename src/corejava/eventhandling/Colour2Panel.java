package corejava.eventhandling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Colour2Panel extends JPanel implements MouseListener {
	public Colour2Panel() {
		setBackground(Color.BLACK);
		addMouseListener(this);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		if (getBackground() == Color.BLACK) {
			setBackground(Color.WHITE);
		} else {
			setBackground(Color.BLACK);
		}
	}
	
	/**
	 * all below are empty, we only need mousePressed.
	 * (this is an inelegant solution).
	 */
	@Override
	public void mouseClicked(MouseEvent e) {}
	
	@Override
	public void mouseReleased(MouseEvent e) {}
	
	@Override
	public void mouseEntered(MouseEvent e) {}
	
	@Override
	public void mouseExited(MouseEvent e) {}
}
