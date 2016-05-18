package corejava.generics;

import java.util.*;

/**
 * Generics.
 * Class for Q#1,#2.
 * Make a static method called "lastEntry" to which you pass a List and get
 * back the last entry of that list. i.e. If you pass it a List of Strings,
 * you should get back a String. etc.
 * 
 * Next, make a second version of the above which supports arrays. i.e.
 * you should be able to call EntryUtils.lastEntry(someList) or
 * EntryUtils.lastEntry(someArray).
 * @author m
 */

public class EntryUtils {
	
	/**
	 * Supports List of T objects.
	 */
	public static <T> T lastEntry(List<T> entries) {
		/**
		 * check if List is empty. if so, return null,
		 * else, get the last entry (if list of size
		 * N, then last entry is at position N-1).
		 */
		if (entries == null || entries.size() == 0) {
			return null;
		} else {
			return entries.get(entries.size() - 1);
		}
	}
	
	/**
	 * Supports Array of T objects.
	 */
	public static <T> T lastEntry(T[] entries) {
		/**
		 * as above.
		 */
		if (entries == null || entries.length == 0) {
			return null;
		} else {
			return entries[entries.length - 1];
		}
	}	
}
