package corejava.java8;

import java.util.*;

public class EntryUtils {
	
	/**
	 * Obtains the last entry of a List object.
	 * @param list
	 * @return
	 */
	public static <T> T lastEntry(List<T> list) {
		int listSize = list.size();
		if (listSize > 0) {
			return list.get(listSize - 1);
		} else {
			return null;
		}
	}
	
	/**
	 * Obtains the last entry of an Array object.
	 * @param array
	 * @return
	 */
	public static <T> T lastEntry(T[] array) {
		int arraySize = array.length;
		if (arraySize > 0) {
			return array[arraySize - 1];
		} else {
			return null;
		}
	}
	
	private EntryUtils() {}	// uninstantiatable class
}
