package corejava.simplegraphics;

import java.awt.*;
import javax.swing.*;

/**
 * Make another version of the TicTacToe application, but this time 
 * the drawing code should not know the panel size ahead of time, but
 * instead use the panel's getWidth and getHeight methods to compute 
 * the size before drawing. Interactively stretch the frame to be
 * different sizes, and be sure your drawing changes accordingly.
 * Assume that the width and height are equal.
 * 
 * @author m
 */

public class TicTacToePanel2 extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		/**
		 * we should not know the panel size ahead of time.
		 * instead, we use getWidth and getHeight methods to compute
		 * the size before drawing.
		 */
		int sideLength = Math.min(getWidth(), getHeight());	//	sets sideLength to floor of width and height values
		/**
		 * To draw the tic-tac-toe pattern, we must split the length
		 * of one side into thirds, and set those values as endpoints
		 * to the lines we draw.
		 */
		int oneThirdSide = sideLength / 3;
		int twoThirdSide = (2 * sideLength) / 3;
		
		/**
		 * drawing...
		 */
		g.drawLine(oneThirdSide, 0, oneThirdSide, sideLength);	//	vertical
		g.drawLine(twoThirdSide, 0, twoThirdSide, sideLength);	//	vertical
		g.drawLine(0, oneThirdSide, sideLength, oneThirdSide);	//	horizontal
		g.drawLine(0, twoThirdSide, sideLength, twoThirdSide);	//	horizontal
	}
}
