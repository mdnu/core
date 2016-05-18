package corejava.generics;

/**
 * Two utilities that pad a String of characters "orig" onto
 * an initially empty string by n-many times, specified by the
 * user. padChars uses String concatenation while padChars2 uses
 * the StringBuilder class.
 * @author m
 *
 */

public class CharUtils {
	public static String padChars1(int n, String orig) {
		String output = "";
		for (int i = 0; i < n; i++) {
			output += orig;
		}
		return output;
	}
	
	public static String padChars2(int n, String orig) {
		StringBuilder output = new StringBuilder("");
		for (int i = 0; i < n; i++) {
			output = output.append(orig);
		}
		return output.toString();
	}
}
