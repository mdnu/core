package corejava.eventhandling;

import java.awt.*;
import javax.swing.*;

public class Colour1Panel extends JPanel {
	public Colour1Panel() {
		setBackground(Color.BLACK);
		addMouseListener(new Colour1Listener(this));	// call to Colour1Listener
	}
	
	public void swapColours() {
		if (getBackground() == Color.BLACK) {
			setBackground(Color.WHITE);
		} else {
			setBackground(Color.BLACK);
		}
	}
}
