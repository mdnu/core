package corejava.collections;

import java.util.*;

/**
 * Collection type: Map
 * Make a map that associates the following employee IDs with names.
 * Keys and values of Maps can be any Object type, so irl you would
 * probably have the key be a String and the associated value be a
 * Person or Employee object. To make things simple, you can use
 * String for both the ID and the name, rather than bothering to
 * create a Person or Employee class. Make test cases where you
 * test several valid and invalid IDs and print the associated
 * name.
 * 
 * Now, edit the code so that our lookup method will work with keys
 * in any case (upper or lowercase). Solution: id -> id.toLowerCase().
 * @author m
 */

public class EmployeeTest {

	public static void main(String[] args) {
		/**
		 * HashMap of employees with IDs.
		 */
		Map<String, String> employeeTable = new HashMap<>();
		employeeTable.put("a0", "Richard M. Stallman");
		employeeTable.put("a1", "Gerald J. Sussman");
		employeeTable.put("a2", "Hal Abelson");
		employeeTable.put("a3", "Donald Knuth");
		employeeTable.put("a4", "Linus Torvalds");
		employeeTable.put("a5", "Carl F. Gauss");
		
		/**
		 * test cases of both valid and invalid IDs.
		 */
		String[] testIDs = {"a0", "A2", "a4", "A8", "b7", "c12"};
		
		/**
		 * Test ids in testIDs array if they are valid.
		 * If so, print the employee entry.
		 */
		for (String id : testIDs) {
			String name = employeeTable.get(id.toLowerCase());	// uses id : testIDs
			/**
			 * if ID is valid, print details. else, print error.
			 */
			if (name != null) {
				System.out.printf("the id '%s' is for '%s'.%n", id.toLowerCase(), name);
				// first %s for id, second %s for name, %n for newline. 
			} else {
				System.out.printf("no employee record with id '%s'.%n", id.toLowerCase());
			}
		}
	}
}
