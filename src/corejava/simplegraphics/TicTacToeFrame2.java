package corejava.simplegraphics;

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

public class TicTacToeFrame2 extends JFrame {
	/**
	 * constructor
	 */
	public TicTacToeFrame2() {
		super("tic tac toe");	// call JFrame constructor
		setContentPane(new TicTacToePanel2());	//	call TicTacToePanel2 constructor
		setSize(620, 640);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		new TicTacToeFrame2();
	}
}
