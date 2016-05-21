package corejava.eventhandling;

import java.awt.event.*;

public class Colour1Listener extends MouseAdapter {
	private Colour1Panel window;
	
	public Colour1Listener(Colour1Panel window) {
		this.window = window;
	}
	
	@Override
	public void mousePressed(MouseEvent event) {
		window.swapColours();	// call to swapColours method
	}
}
