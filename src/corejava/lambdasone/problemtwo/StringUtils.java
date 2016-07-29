package corejava.lambdasone.problemtwo;

public class StringUtils {
	/**
	 * Define the static method betterString.
	 * This method will take two strings and an instance of your interface.
	 * It returns string1 if the method in the interface returns true, otherwise
	 * it returns string2.
	 */
	public static String betterString(String s1, String s2, TwoStringPredicate tester) {
		if (tester.isBetter(s1, s2)) {
			return s1;
		} else {
			return s2;
		}
	}
	
	private StringUtils() {}	// Cannot instantiate this class.
}
