package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		double valor = 0;
		int n = sc.nextInt();
		double[] vect = new double[n];
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();

		}
		for (int i = 0; i < n; i++) {
			if (vect[i] > valor) {
				valor = vect[i];
			}
		}
		System.out.println(valor);

		for (int i = 0; i < n; i++) {
			if (vect[i] == valor) {
				System.out.println(i);;
			}
		}
		sc.close();
	}
}
