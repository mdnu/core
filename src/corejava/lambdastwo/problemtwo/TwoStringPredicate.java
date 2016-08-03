package corejava.lambdastwo.problemtwo;

/**
 * Define the TwoStringPredicate interface.
 * It will specify a method that takes two strings and returns a boolean.
 * Part two: we add the @FunctionalInterface annotation.
 * @author m
 */

@FunctionalInterface
public interface TwoStringPredicate {
	boolean isBetter(String s1, String s2);
	
	/**
	 * using @FunctionalInterface means that if you try to add a second
	 * method, we will get a compile time error in this interface.
	 */
}
