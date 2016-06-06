package corejava.parallel;

import java.math.BigInteger;

/**
 * Utility class with methods related to prime numbers.
 * Modified version of coreservlets code. Not part of assignment.
 * @author m
 */

public class Primes {
	
	/**
	 * P(false prime) < 1 / (2^(ERR_VAL))
	 */
	private static final int ERR_VAL = 100;
	
	/**
	 * Tests if num:BigInteger is prime.
	 * Uses BigInteger isProbablePrime method.
	 * @param num
	 * @return num.isProbablePrime(ERR_VAL)
	 */
	public static boolean isPrime(BigInteger num) {
		return num.isProbablePrime(ERR_VAL);
	}
	
	/**
	 * isPrime method as above, but takes long as argument.
	 * @param num
	 * @return isPrime(test)
	 */
	public static boolean isPrime(long num) {
		BigInteger test = new BigInteger("" + num);
		return isPrime(test);
	}
	
	private Primes() {}	// uninstantiatable class
}
