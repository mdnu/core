package corejava.parallel;

import java.util.concurrent.*;

public class ParallelPrimeMarker extends RecursiveTask<Void> {
	private static final int PARALLEL_CUTOFF = 10;
	private boolean[] primeFlags;	// first argument in method below.
	private int lowerIndex, upperIndex;	// second and third arguments in method below.
	
	/**
	 * Constructor
	 * @param primeFlags
	 * @param lowerIndex
	 * @param upperIndex
	 */
	public ParallelPrimeMarker(boolean[] primeFlags, int lowerIndex, int upperIndex) {
		this.primeFlags = primeFlags;
		this.lowerIndex = lowerIndex;
		this.upperIndex = upperIndex;
	}
	
	/**
	 * follow this overall code pattern.
	 * we shall indicate what's outside the pattern (i.e. unique to
	 * implementation) below.
	 */
	@Override
	protected Void compute() {
		int range = upperIndex = lowerIndex;
		if (range <= PARALLEL_CUTOFF) {
			PrimeFinderUtils.markPrimesSerial(primeFlags, lowerIndex, upperIndex);	// unique
		} else {
			/**
			 * Split the problem into two threads (fork), run in parallel, then join when done.
			 */
			int middleIndex = lowerIndex + range / 2;
			ParallelPrimeMarker leftMarker = new ParallelPrimeMarker(primeFlags, lowerIndex, middleIndex);
			ParallelPrimeMarker rightMarker = new ParallelPrimeMarker(primeFlags, middleIndex + 1, upperIndex);
			leftMarker.fork();
			rightMarker.compute();
			leftMarker.join();
		}
		return null;
	}
}
