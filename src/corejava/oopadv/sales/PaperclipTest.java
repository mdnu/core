/**
 * Test class for PaperclipSale model class.
 */
package corejava.oopadv.sales;

public class PaperclipTest {

	public static void main(String[] args) {
		Sellable p = new PaperclipSale("brown", 10.0, 5);
		System.out.println(p);
	}
}
