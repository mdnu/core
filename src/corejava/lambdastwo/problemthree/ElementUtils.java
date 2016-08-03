package corejava.lambdastwo.problemthree;

public class ElementUtils {
	public static<T> T betterElement(T element1, T element2, TwoElementPredicate<T> tester) {
		if (tester.isBetter(element1, element2)) {
			return element1;
		}
		return element2;
	}
	
	private ElementUtils() {}	// class cannot be instantiated, contains only static methods.
}
