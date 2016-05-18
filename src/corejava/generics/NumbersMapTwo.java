package corejava.generics;


import java.util.*;

/**
 * varargs exercise.
 * Copy your number-map code from previous, where you associated numbers
 * with words. Now, make a new method called wordsForNumbers that takes in
 * any number of ints and returns a String[] of the matching associated words.
 * i.e. NumbersMapTwo.wordsForNumbers(2,4,6) returns an array of the words
 * "two", "four", "six".
 * @author m
 */

public class NumbersMapTwo {
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
	public NumbersMapTwo() {
		/**
		 * this is actually a call to the one-argument constructor below.
		 */
		this(defaultWords);
	}
	
	public NumbersMapTwo(String[] words) {
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
	 * gets vararg of type int and generates a String array
	 * of corresponding words for each num in nums.
	 * @param nums
	 * @return
	 */
	public String[] wordsForNumbers(int... nums) {
		String[] output = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			output[i] = wordForNumber(nums[i]);
		}
		return output;
	}
	
	/**
	 * get size of numberTable.
	 */
	public int getSize() {
		return numberTable.size();
	}
}
