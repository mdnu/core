package corejava.simplegraphics;

import java.awt.*;
import javax.swing.*;

/**
 * Make a popup window that draws an empty tic-tac-toe board.
 * Assume that JPanel is exactly 300x300 (make the JFrame 320x340
 * so about 300x300 is left after accounting for the title bar and borders).
 * @author m
 */

public class TicTacToePanel1 extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawLine(100, 0, 100, 300);	//	vertical
		g.drawLine(200, 0, 200, 300);	//	vertical
		g.drawLine(0, 100, 300, 100);	//	horizontal
		g.drawLine(0, 200, 300, 200);	//	horizontal
	}
}
