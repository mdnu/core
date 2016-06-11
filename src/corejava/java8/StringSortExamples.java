package corejava.java8;

import java.util.*;

/**
 * String-sorting examples using anonymous inner classes.
 * @author m
 */

public class StringSortExamples {
	public static void main(String[] args) {
		String[] stringArray = {"the", "quick", "brown", "fox", "jumped"};
		System.out.printf("original string array: %s.%n", Arrays.asList(stringArray));
		
		/** use anon inner class to sort by length (i.e. in ascending order) **/
		Arrays.sort(stringArray, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return (s1.length() - s2.length());	// always sort from -ve to +ve
			}
		});
		System.out.printf("sorted entries by length, in ascending order: %s.%n", Arrays.asList(stringArray));
		
		/** use anon inner class to sort by reverse length (i.e. in descending order) **/
		Arrays.sort(stringArray, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return (s2.length() - s1.length());	// if previous always sorts from -ve to +ve, just take the -ve of above sort.
			}
		});
		System.out.printf("sorted entries by length, in descending order: %s.%n", Arrays.asList(stringArray));
		
		/** use anon inner class to sort alphabetically by the initial letter **/
		Arrays.sort(stringArray, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return (s1.charAt(0) - s2.charAt(0));
			}
		});
		System.out.printf("sorted entries by first letter: %s.%n", Arrays.asList(stringArray));
		
		/** use anon inner class to sort strings containing 'e' first, otherwise second **/
		Arrays.sort(stringArray, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				int compareFlag = 0;	// initial compare flag
				if (s1.contains("e") && !s2.contains("e")) {
					compareFlag = -1;
				} else if (!s1.contains("e") && s2.contains("e")) {
					compareFlag = 1;
				}
				return compareFlag;	// again, always sorts from -ve to +ve
			}
		});
		System.out.printf("sorted entries by whether it contains 'e' (first version): %s.%n", Arrays.asList(stringArray));
		
		/** use anon inner class to sort strings containing 'e' first, otherwise second - using a static method **/
		Arrays.sort(stringArray, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return StringUtils.eChecker(s1, s2);
			}
		});
		System.out.printf("sorted entries by whether it contains 'e' (second version): %s.%n", Arrays.asList(stringArray));
	}
}
