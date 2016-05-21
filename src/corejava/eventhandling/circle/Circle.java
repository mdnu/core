package corejava.eventhandling.circle;

import java.awt.*;

/**
 * (Hard) Use Circle and CirclePanel from the event-handling project.
 * Now, make AddRemoveCirclePanel and AddRemoveCircleFrame. Update CircleFrame3
 * and CirclePanel3 so that the logic in 'mousePressed' adds a circle when you
 * left-click anywhere, but removes a circle if you right-click on top of an
 * existing circle.
 * 
 * Below: Circle model class.
 * @author m
 */

public class Circle {
	private final int x, y, radius;
	
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getRadius() {
		return radius;
	}
	
	/**
	 * given a Graphics object, draw the Circle centred around its
	 * current position.
	 */
	
	public void draw(Graphics g) {
		g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
	}
	
	/**
	 * checks if point is contained inside the circle.
	 */
	public boolean containsPoint(int testX, int testY) {
		return (distance(testX, testY, x, y) <= radius);
	}
	
	/**
	 * helper method to calculate distance
	 */
	private double distance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}
}
