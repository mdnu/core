package corejava.lambdas_one;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Basic Lambdas:
 * Make an array containing a few Strings. Sort it by:
 * length, reverse length, alphabetically, Strings that contain "e" first and
 * everything else second.
 * @author m
 */

public class StringSortExamples {
	public static void main(String[] args) {
		String[] stringArray = {"the", "quick", "brown", "fox", "jumped"};
		System.out.printf("original string array: %s.%n", Arrays.asList(stringArray));
		
		/** Sorted by length (shortest to longest) **/
		Arrays.sort(stringArray, (s1, s2) -> s1.length() - s2.length());
		System.out.printf("sorted entries by length, in ascending order: %s.%n", Arrays.asList(stringArray));
		
		/** Sorted by length (longest to shortest) **/
		Arrays.sort(stringArray, (s1, s2) -> s2.length() - s1.length());
		System.out.printf("sorted entries by length, in descending order: %s.%n", Arrays.asList(stringArray));
		
		/** Sorted by first letter **/
		Arrays.sort(stringArray, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
		System.out.printf("sorted entries by first letter: %s.%n", Arrays.asList(stringArray));
		
		/** Sorted by whether it contains 'e' (first version) **/
		Arrays.sort(stringArray, (s1, s2) -> {
			int compareFlag = 0;
			if (s1.contains("e") && !s2.contains("e")) {
				compareFlag = -1;
			} else if (s2.contains("e") && !s1.contains("e")) {
				compareFlag = 1;
			}
			return compareFlag;
		});
		System.out.printf("sorted entries by whether it contains 'e' (first version): %s.%n", Arrays.asList(stringArray));
	}
}
