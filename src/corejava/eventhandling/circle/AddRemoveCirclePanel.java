package corejava.eventhandling.circle;

import java.awt.event.*;
import javax.swing.*;

/**
 * (Hard) Use Circle and CirclePanel from the event-handling project.
 * Now, make AddRemoveCirclePanel and AddRemoveCircleFrame. Update CircleFrame3
 * and CirclePanel3 so that the logic in 'mousePressed' adds a circle when you
 * left-click anywhere, but removes a circle if you right-click on top of an
 * existing circle.
 * 
 * Below: AddRemoveCirclePanel
 * @author m
 */

public class AddRemoveCirclePanel extends CirclePanel {
	public AddRemoveCirclePanel() {
		radius = 30;
		addMouseListener(new AddRemoveCircleListener());
	}
	
	/**
	 * helper methods to add and remove circles
	 */
	private void addCircle(int x, int y) {
		circles.add(new Circle(x, y, radius));	// invokes 'circles' in CirclePanel
	}
	
	private void removeCircle(int x, int y) {
		/**
		 * if Circle c in circles Array contains point (x, y), 
		 * then remove it from the Array.
		 */
		for (Circle c : circles) {
			if (c.containsPoint(x, y)) {
				circles.remove(c);
				break;
			}
		}
	}
	
	/**
	 * named inner class 'AddRemoveCircleListener'
	 */
	private class AddRemoveCircleListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent event) {
			int x = event.getX();
			int y = event.getY();
			if (SwingUtilities.isRightMouseButton(event) || event.isControlDown()) {
				removeCircle(x, y);
			} else {
				addCircle(x, y);
			}
			repaint();
		}
	}
}
