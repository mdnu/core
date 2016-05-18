package corejava.junit;

import java.util.*;

/**
 * You are hired by the US Congress to help reduce tensions and
 * smooth the operation of government. You will be paid $1M in
 * taxpayer money to do the folowing.
 * 
 * 1. Make a static method 'calmString' that will take a String
 * representing a speech, and remove all exclamation marks. If
 * you pass in null, the method should return null.
 * 2. Use JUnit to test it.
 * @author m
 *
 */

public class Utils {
	/**
	 * takes a String and returns a new String with all
	 * instances of '!' removed.
	 */
	public static String calmString(String speech) {
		if (speech != null) {
			speech = speech.replaceAll("!", "");
		}
		return speech;
	}
	
	public static void calmAttendees(List<String> attendees) {
		if (attendees != null) {
			if (attendees.contains("Republican") && attendees.contains("Democrat")) {
				if (Math.random() > 0.5) {
					attendees.remove("Democrat");
				} else {
					attendees.remove("Republican");
				}
			}
		}
	}
	
	private Utils() {}	// class cannot be instantiated.
}
