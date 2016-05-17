package corejava.collections;

import java.util.*;

/**
 * Do some timing tests to see if you can verify the performance claims
 * regarding the difference between ArrayList and LinkedList for accessing
 * the middle element.
 * Hints:
 * Use System.currentTimeMillis or System.nanoTime to look up the current time.
 * Compute a delta and divide to get an elapsed time in seconds.
 * To ensure meaningful results, use very long lists and access the middle
 * element many times. Run several tests, each with larger and larger lists.
 * 
 * Result: confirms that ArrayList accesses Nth element in constant time O(1)
 * while LinkedList accesses the Nth element in linear time O(N).
 * @author m
 */

public class ListPerformanceTest {
	private static int numLookups = 1000;
	private static int numTests = 5;
	
	public static void main(String[] args) {
		int listSize = 100_000;
		
		/**
		 * initialize five tests. after each test, we double the list size.
		 * for each test, we run the timeAccess timer method, which repeatedly
		 * accesses the middle element 1000 times and measures time elapsed.
		 */
		for (int i = 0; i < numTests; i++) {
			List<String> linkedList = new LinkedList<>();
			List<String> arrayList = new ArrayList<>();
			
			/**
			 * proceed populating each List with identical elements.
			 */
			for (int j = 0; j < listSize; j++) {
				String value = "entry" + j;
				linkedList.add(value);
				arrayList.add(value);
			}
			System.out.printf("list size = %d.%n", listSize);
			timeAccess("linked list", linkedList);
			timeAccess("array list", arrayList);
			listSize *= 2;
		}
	}
	
	/**
	 * helper method to compute time elapsed for accessing middle element.
	 * we repeatedly get the middle element 1000 times, measuring time elapsed
	 * for each linkedList and arrayList.
	 */
	public static void timeAccess(String label, List<String> list) {
		String entry = null;
		int index = list.size() / 2;	// 50_000, the middle element.
		long startTime = System.nanoTime();	// start timer here.
		for (int i = 0; i < numLookups; i++) {
			entry = list.get(index);
		}
		long endTime = System.nanoTime();	// end timer here.
		double elapsedTime = ((double)(endTime - startTime)) / 1_000_000_000;	// elapsed time in seconds.
		
		if (entry == null) {
			System.out.println("null entry");
		}
		System.out.printf(" %s access time: %.3f seconds.%n", label, elapsedTime);
	}
}
