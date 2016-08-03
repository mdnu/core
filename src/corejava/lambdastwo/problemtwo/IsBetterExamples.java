package corejava.lambdastwo.problemtwo;

/**
 * Test driver for TwoStringPredicate functional interface and 'isBetter' method.
 * @author m
 */

public class IsBetterExamples {
	public static void main(String[] args) {
		String string1 = "The quick brown fox";
		String string2 = "jumped over the lazy dog.";
		String resultMessage = "The better string between '%s' and '%s' based on criteria '%s' is '%s'.'%n'";
		
		/** first result, based on length **/
		String firstResult = StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
		System.out.printf(resultMessage, string1, string2, "length", firstResult);
		
		/** second result, based on first argument **/
		String secondResult = StringUtils.betterString(string1, string2, (s1, s2) -> true);
		System.out.printf(resultMessage, string1, string2, "first argument", secondResult);
	}
}
