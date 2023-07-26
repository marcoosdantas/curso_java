package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		CurrencyConverter.dollarPrice = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		CurrencyConverter.dollarQuantity = sc.nextDouble();
		System.out.printf("Ammount to be paid in reais = %.2f", CurrencyConverter.dollarConvertion());
		sc.close();

	}

}
