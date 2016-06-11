package corejava.java8;

public class StringUtils {
	/**
	 * static method for comparison of two strings.
	 */
	public static int eChecker(String s1, String s2) {
		int compareFlag = 0;	// initial compare flag
		if (s1.contains("e") && !s2.contains("e")) {
			compareFlag = -1;
		} else if (!s1.contains("e") && s2.contains("e")) {
			compareFlag = 1;
		}
		return compareFlag;	// again, always sorts from -ve to +ve
	}
	
	private StringUtils() {}	// uninstantiatable class
}
