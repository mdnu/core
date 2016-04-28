/**
 * Test class for Coin enum.
 */

package corejava.oopadv.enums;

public class CoinTest {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println(Coin.flip());
		}
	}
}
