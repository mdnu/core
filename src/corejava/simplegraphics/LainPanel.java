package corejava.simplegraphics;

import java.awt.*;
import javax.swing.*;

/**
 * Save an image into your project folder. Make a popup window that
 * draws the image. Remember that the image goes in a location relative
 * to the root of the compiled code. next, draw some graffiti on it.
 * @author m
 */

public class LainPanel extends JPanel {
	/**
	 * private image (instance field)
	 */
	private Image image;
	
	/**
	 * constructor
	 */
	public LainPanel(String relativePath) {
		image = Toolkit.getDefaultToolkit().getImage(relativePath);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, this);
		g.fillRect(175, 500, 200, 5);
		g.fillRect(250, 510, 200, 5);
	}
}
