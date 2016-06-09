package corejava.parallel;

import java.util.*;
import java.util.concurrent.*;

public class PrimeFinderUtils {
	private static final ForkJoinPool FORK_JOIN_POOL = new ForkJoinPool();
	
	/**
	 * Serial versions.
	 */
	
	/**
	 * Given a boolean array, loops it down and marks each entry as T/F
	 * depending whether the array index is a prime number.
	 * @param primeFlags
	 * @param lowerIndex
	 * @param upperIndex
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
	
	/**
	 * Given a List of Integers, counts all the primes.
	 * Uses markPrimesSerial method above, and collectPrimes helper method.
	 * @param primeFlags
	 * @return collectPrimes(primeFlags);
	 */
	public static List<Integer> findPrimesSerial(boolean[] primeFlags) {
		markPrimesSerial(primeFlags);
		return collectPrimes(primeFlags);
	}
	
	/**
	 * Parallel versions.
	 */
	
	/**
	 * Parallel version of the markPrimes method.
	 * Uses the FORK_JOIN_POOL static final field.
	 * @param primeFlags
	 */
	public static void markPrimesParallel(boolean[] primeFlags) {
		FORK_JOIN_POOL.invoke(new ParallelPrimeMarker(primeFlags, 0, primeFlags.length - 1));
	}
	
	
	/**
	 * Parallel version of findPrimes method.
	 * @param primeFlags
	 * @return collectPrimes(primeFlags)
	 */
	public static List<Integer> findPrimesParallel(boolean[] primeFlags) {
		markPrimesParallel(primeFlags);
		return collectPrimes(primeFlags);
	}
	
	/**
	 * Helper method to produce a List of primes from a List of marked primes.
	 * @param primeFlags
	 * @return primes
	 */
	public static List<Integer> collectPrimes(boolean[] primeFlags) {
		List<Integer> primes = new ArrayList<>();
		for (int i = 0; i < primeFlags.length; i++) {
			if (primeFlags[i]) {
				primes.add(i);
			}
		}
		return primes;
	}
}
