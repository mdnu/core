package corejava.simplegraphics;

import java.awt.*;
import javax.swing.*;

/**
 * Make a black window that draws fifty small white circles at 
 * RANDOM locations within the window frame. The drawing code
 * should not know the panel size ahead of time. (i.e. we use
 * getWidth() and getHeight() methods). Interactively stretch
 * the frame to be different sizes and be sure your drawing
 * changes accordingly.
 * @author m
 */

public class CirclePanel extends JPanel {
	/**
	 * diameter constant
	 */
	private int diameter = 10;
	
	/**
	 * constructor
	 */
	public CirclePanel(Color bgColour) {
		setBackground(bgColour);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		/**
		 * drawing code should not know the panel size ahead of time.
		 * circles made of ovals with equal width and height.
		 */
		int maxX = getWidth();
		int maxY = getHeight();
		g.setColor(Color.WHITE);
		/**
		 * make 500 of these.
		 */
		for (int i = 0; i < 500; i++) {
			int x = (int)(Math.random() * maxX);	//	get random x co-ordinate as a % of max x length
			int y = (int)(Math.random() * maxY);	//	get random y co-ordinate as a % of max y length
			g.fillOval(x, y, diameter, diameter);
		}
	}
}
