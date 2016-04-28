/*
 * Make a CarSale class to represent the sale of a car.
 * The class should represent:
 * 1. The car name (model)
 * 2. The list price
 * 3. The discount (in percent)
 * 4. The final cost (from list price, after discount)
 * Implement getters, but not setters for each property.
 * Implement a toString method.
 * Test with a few instances and print them out.
 */

package corejava.oopadv.sales;

public class CarSale implements Sellable {
	private final String carName;
	private final double listPrice;
	private final double discount;
	
	/**
	 * Car instance constructor.
	 * @param carName
	 * @param listPrice
	 * @param discount
	 */
	public CarSale(String carName, double listPrice, double discount) {
		this.carName = carName;
		this.listPrice = listPrice;
		this.discount = discount;
	}
	
	/**
	 * Retrieves car name.
	 * @return carName
	 */
	public String getCarName() {
		return carName;
	}
	
	/**
	 * Retrieves list price.
	 * @return listPrice
	 */
	public double getListPrice() {
		return listPrice;
	}
	
	/**
	 * Retrieves percentage discount.
	 * @return discount
	 */
	public double getDiscount() {
		return discount;
	}

	@Override
	public double getCost() {
		return (listPrice * (1.0 - discount/100));
	}
	
	@Override
	public String toString() {
		return "selling car: " + carName + 
						", list price: $" + listPrice + 
						" with " + discount + "% discount.";
	}
}
