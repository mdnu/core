/*
 * Make a PaperclipSale class to represent the sale of a set of boxes
 * of certain types of paper clips. The class should represent:
 * 1. The colour of the paper clips
 * 2. The per-box price
 * 3. The # of boxes being sold
 * 4. The final cost.
 * Implement getters, but not setters for each property.
 * Implement a toString method.
 * Test with a few instances and print them out.
 */

package corejava.oopadv.sales;

public class PaperclipSale implements Sellable {
	private String colour;
	private double boxPrice;
	private int numBoxes;
	
	/**
	 * PaperclipSale constructor.
	 * @param colour
	 * @param boxPrice
	 * @param numBoxes
	 */
	public PaperclipSale(String colour, double boxPrice, int numBoxes) {
		this.colour = colour;
		this.boxPrice = boxPrice;
		this.numBoxes = numBoxes;
	}
	
	/**
	 * Gets paper clip colour.
	 * @return colour
	 */
	public String getColour() {
		return colour;
	}
	
	/**
	 * Gets paper clip box price.
	 * @return boxPrice
	 */
	public double getBoxPrice() {
		return boxPrice;
	}
	
	/**
	 * Gets # of boxes being sold.
	 * @return numBoxes
	 */
	public int getNumBoxes() {
		return numBoxes;
	}
	
	/**
	 * Returns total inventory cost.
	 */
	@Override
	public double getCost() {
		return boxPrice * numBoxes;
	}
	
	@Override
	public String toString() {
		return "selling paper clips: " + numBoxes + 
						" boxes of " + colour + 
						" clips at $" + boxPrice + 
						" per box.";
	}
}
