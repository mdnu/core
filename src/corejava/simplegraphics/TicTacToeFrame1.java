package corejava.simplegraphics;

import javax.swing.*;

/**
 * Make a popup window that draws an empty tic-tac-toe board.
 * Assume that JPanel is exactly 300x300 (make the JFrame 320x340
 * so about 300x300 is left after accounting for the title bar and borders).
 * @author m
 */

public class TicTacToeFrame1 extends JFrame {
	
	/**
	 * constructor
	 */
	public TicTacToeFrame1() {
		super("tic tac toe");	// call JFrame constructor
		setContentPane(new TicTacToePanel1());	// calls TicTacToePanel1 constructor
		setSize(320, 340);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	/**
	 * main
	 */
	public static void main(String[] args) {
		new TicTacToeFrame1();	// constructor call
	}
}
