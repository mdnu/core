package corejava.eventhandling.circle;

import java.awt.Color;
import java.awt.Graphics;
import java.util.*;
import javax.swing.*;

/**
 * (Hard) Use Circle and CirclePanel from the event-handling project.
 * Now, make AddRemoveCirclePanel and AddRemoveCircleFrame. Update CircleFrame3
 * and CirclePanel3 so that the logic in 'mousePressed' adds a circle when you
 * left-click anywhere, but removes a circle if you right-click on top of an
 * existing circle.
 * 
 * Below: CirclePanel
 * @author m
 */

public class CirclePanel extends JPanel {
	protected int radius = 25;
	protected List<Circle> circles = new ArrayList<>();
	
	public CirclePanel() {
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
	}
	
	public int getRadius() {
		return radius;
	}
	
	public List<Circle> getCircles() {
		return circles;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Circle c : circles) {
			c.draw(g);
		}
	}
}
