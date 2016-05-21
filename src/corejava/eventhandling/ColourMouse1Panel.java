package corejava.eventhandling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColourMouse1Panel extends JPanel {
	public ColourMouse1Panel() {
		setBackground(Color.BLACK);
		addMouseMotionListener(new ColourMouseChanger());
	}
	
	private class ColourMouseChanger extends MouseMotionAdapter {
		@Override
		public void mouseMoved(MouseEvent event) {
			if (event.getX() > getWidth() / 2) {
				setBackground(Color.BLACK);
			} else {
				setBackground(Color.WHITE);
			}
		}
	}
}
