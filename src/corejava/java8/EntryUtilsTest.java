package corejava.java8;

import java.util.*;

public class EntryUtilsTest {
	public static void main(String[] args) {
		String[] testArray = {"a", "b", "c", "d"};
		List<String> testList = Arrays.asList(testArray);	// convert Array to List
		System.out.printf("last entry of List: %s.%n", EntryUtils.lastEntry(testList));
		System.out.printf("last entry of Array: %s.%n", EntryUtils.lastEntry(testArray));
		Integer[] numbers = {1, 2, 3, 4, 5};
		System.out.printf("last entry of 'numbers': %d.%n", EntryUtils.lastEntry(numbers));
	}
}
