package corejava.eventhandling.circle;

import javax.swing.*;

/**
 * (Hard) Use Circle and CirclePanel from the event-handling project.
 * Now, make AddRemoveCirclePanel and AddRemoveCircleFrame. Update CircleFrame3
 * and CirclePanel3 so that the logic in 'mousePressed' adds a circle when you
 * left-click anywhere, but removes a circle if you right-click on top of an
 * existing circle.
 * 
 * Below: AddRemoveCircleFrame
 * @author m
 */

public class AddRemoveCircleFrame extends JFrame {
	public AddRemoveCircleFrame() {
		super("adding and removing circles");
		setContentPane(new AddRemoveCirclePanel());
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AddRemoveCircleFrame();
	}
}
