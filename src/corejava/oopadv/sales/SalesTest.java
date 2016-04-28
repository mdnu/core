package corejava.oopadv.sales;

/**
 * Test class for testing public interface class (static) methods.
 * @author m
 */
public class SalesTest {

	public static void main(String[] args) {
		Sellable s1 = new CarSale("dodge viper", 1_000_000, 10.0);
		Sellable s2 = new CarSale("honda civic", 5_000, 5.0);
		Sellable s3 = new PaperclipSale("red", 2.50, 4_000);
		Sellable s4 = new PaperclipSale("blue", 5.00, 30_000);
		Sellable[] items = {s1, s2, s3, s4};
		System.out.println("items for sale:");
		for (Sellable s : items) {
			System.out.println(s);
		}
		System.out.println("cheapest item: " + Sellable.cheapest(items));
		System.out.println("total cost of all items: " + Sellable.totalCost(items));
	}
}
