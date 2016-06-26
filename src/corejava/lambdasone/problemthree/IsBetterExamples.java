package corejava.lambdasone.problemthree;

/**
 * Test driver for TwoElementPredicate Interface and 'betterElement' method.
 * Purpose of exercise #3: Making your own interfaces for which lambdas can be used.
 * @author m
 */

public class IsBetterExamples {
	public static void main(String[] args) {
		String string1 = "The quick brown fox";
		String string2 = "jumped over the lazy dog.";
		String resultMessage = "The better element between '%s' and '%s' based on criteria: '%s' is '%s'.%n";
		
		/** first result, based on length **/
		String firstResult = ElementUtils.betterElement(string1, string2, (s1, s2) -> s1.length() > s2.length());
		System.out.printf(resultMessage, string1, string2, "length", firstResult);
		
		/** second result, based on first argument **/
		String secondResult = ElementUtils.betterElement(string1, string2, (s1, s2) -> true);
		System.out.printf(resultMessage, string1, string2, "first argument", secondResult);
		
		/** third result, based on numeric size **/
		int thirdResult = ElementUtils.betterElement(1, 2, (n1, n2) -> n1 > n2);
		System.out.printf(resultMessage, 1, 2, "numeric size", thirdResult);
	}
}
