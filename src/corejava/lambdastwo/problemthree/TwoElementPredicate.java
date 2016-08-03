package corejava.lambdastwo.problemthree;

/**
 * an interface for which lambdas can be applied.
 * @author m
 * @param <T>
 */

@FunctionalInterface
public interface TwoElementPredicate<T> {
	
	/**
	 * Returns true if the first entry is "better" than the second, returns false otherwise.
	 * Concrete classes or lambdas that implement this interface will implement their meaning
	 * of what "better" is.
	 * @param element1
	 * @param element2
	 * @return
	 */
	boolean isBetter(T element1, T element2);
}
