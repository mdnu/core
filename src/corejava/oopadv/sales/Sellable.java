package corejava.oopadv.sales;

public interface Sellable {
	double getCost();
	
	/*
	 * Make a static method called 'cheapest' that,
	 * given an array of mixed CarSale and PaperclipSale objects,
	 * will return the item with the lowest cost.
	 * (return null if given an empty array).
	 */
	public static Sellable cheapest(Sellable[] items) {
		Sellable cheapestItem = null;
		double lowestCost = Double.MAX_VALUE;
		for (Sellable item : items) {
			double cost = item.getCost();
			if (cost < lowestCost) {
				cheapestItem = item;
				lowestCost = cost;
			}
		}
		return (cheapestItem);
	}
	
	/*
	 * Make a static method called 'totalCost' that,
	 * given an array of mixed CarSale and PaperclipSale objects,
	 * will return the total cost of all items in the array.
	 * (return 0 if given an empty array).
	 */
	public static double totalCost(Sellable[] items) {
		double total = 0.0;
		for (Sellable item: items) {
			total += item.getCost();
		}
		return total;
	}
}
