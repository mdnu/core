package corejava.parallel;

/**
 * Test driver for PrimeFinderUtils class.
 * Runs tests for 1000, 10_000, 10_000_000.
 * @author m
 */

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class PrimeFinderUtilsTest {
	public static void main(String[] args) {
		for (int i = 3; i < 8; i++) {
			int size = (int)Math.pow(10, i);
			String firstMessage = "serial marking of %,d numbers";
			String secondMessage = "parallel marking of %,d numbers";
			
			boolean[] primeFlags = new boolean[size];
			TimingUtils.timeOp(new Op() {
				/** provides implementation for interface Op. */
				@Override
				public String runOp() {
					/** First task to time. */
					PrimeFinderUtils.markPrimesSerial(primeFlags);
					return String.format(firstMessage, size);
				}
			});
			
			List<Integer> primes = PrimeFinderUtils.collectPrimes(primeFlags);
			TimingUtils.timeOp(new Op() {
				/** provides implementation for interface Op. */
				@Override
				public String runOp() {
					/** Second task to time. */
					PrimeFinderUtils.markPrimesParallel(primeFlags);
					return String.format(secondMessage, size);
				}
			});
			
			List<Integer> primesTwo = PrimeFinderUtils.collectPrimes(primeFlags);
			System.out.printf("serial version: %d element array has %d primes.%n", size, primes.size());
			System.out.printf("serial version: the largest prime found is %d.%n", primes.get(primes.size()-1));
			System.out.printf("parallel version: %d element array has %d primes.%n", size, primesTwo.size());
			System.out.printf("parallel version: the largest prime found is %d.%n%n", primes.get(primesTwo.size()-1));
		}
	}
}
