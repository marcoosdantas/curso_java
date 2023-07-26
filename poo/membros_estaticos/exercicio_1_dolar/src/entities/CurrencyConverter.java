package entities;

public class CurrencyConverter {
	public static double dollarPrice;
	public static double dollarQuantity;

	public static double dollarConvertion() {
		return (dollarPrice * dollarQuantity) * 1.06;
	}
}
