package corejava.parallel;

public class PrimeFinderUtils {
	
	/**
	 * Exercise #1.
	 * An ordinary (serial) method that, given a boolean[], will loop down the
	 * array and mark each entry as T/F depending on if the index were prime.
	 * Uses Primes.isPrime(number) as primality test. (See Primes.java in the
	 * package).
	 */
	
	public static void markPrimesSerial(boolean[] primeFlags, int lowerIndex, int upperIndex) {
		for (int i = lowerIndex; i <= upperIndex; i++) {
			primeFlags[i] = Primes.isPrime(i);
		}
	}
	
	/**
	 * Uses above method. Notice below is only viable implementation of above.
	 * Example of method overloading.
	 * @param primeFlags
	 */
	public static void markPrimesSerial(boolean[] primeFlags) {
		markPrimesSerial(primeFlags, 0, primeFlags.length - 1);
	}
}
