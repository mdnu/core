package corejava.oopadv.sales;

public class CarSaleTest {

	public static void main(String[] args) {
		Sellable c = new CarSale("dodge viper", 1_000_000, 10.0);
		System.out.println(c);
	}
}
