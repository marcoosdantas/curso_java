package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		double[] vect = new double[n];
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		for (int i = 0; i < n; i++) {

			System.out.print(vect[i] + " ");
		}
		for (int i = 0; i < n; i++) {

			soma += vect[i];
		}
		System.out.println();
		System.out.println("SOMA: " + soma);
		System.out.println("MÉDIA: " + soma/n);
		sc.close();
	}
}