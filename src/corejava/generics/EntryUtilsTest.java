package corejava.generics;

import java.util.*;

/**
 * Test class for EntryUtils class.
 * Create one List and one Array, both of String objects,
 * and invoke EntryUtils' methods on both.
 * @author m
 */

public class EntryUtilsTest {

	public static void main(String[] args) {
		/**
		 * Array and List of Strings, resp.
		 */
		String[] stuff1 = {"John", "Jacob", "Jingleheimer", "Schmidt"};
		List<String> stuff2 = Arrays.asList(stuff1); 
		
		/**
		 * use printf to generate intended output.
		 */
		System.out.printf("for List method, last element: %s.%n", EntryUtils.lastEntry(stuff2));
		System.out.printf("for Array method, last element: %s.%n", EntryUtils.lastEntry(stuff1));	
	}
}
