package corejava.collections;

import java.util.*;

/**
 * Make a Map that associates numbers (e.g. 2) with words (e.g. "two", or "deux").
 * Test the Map out by passing in a few ints and printing out the corresponding words.
 * @author m
 */

public class NumbersMap {
	private Map<Integer, String> numberTable;
	private static String[] defaultWords = {
					"zero", "one", "two",
					"three", "four", "five",
					"six", "seven", "eight",
					"nine", "ten", "eleven",
					"twelve", "thirteen", "fourteen",
					"fifteen", "sixteen", "seventeen",
					"eighteen", "nineteen", "twenty"};
	
	/**
	 * no-argument constructor that initializes the Map using 'defaultWords.'
	 */
	public NumbersMap() {
		/**
		 * this is actually a call to the one-argument constructor below.
		 */
		this(defaultWords);
	}
	
	public NumbersMap(String[] words) {
		/**
		 * initialize numberTable to be a HashMap, and populate it
		 * using the passed-in array argument 'words'.
		 */
		numberTable = new HashMap<>();
		for (int i = 0; i < words.length; i++) {
			numberTable.put(i, words[i]);
		}
	}
	
	/**
	 * gets the 'word' entry for input number.
	 * otherwise, returns "unknown" if number is not present in Map.
	 * @param num
	 * @return
	 */
	public String wordForNumber(int num) {
		return numberTable.getOrDefault(num, "unknown");
	}
	
	/**
	 * get size of numberTable.
	 */
	public int getSize() {
		return numberTable.size();
	}
}
