package exercicio_2_6;

import java.util.Scanner;

public class exercicio_6_intervalo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero;
		numero = sc.nextDouble();
		if (numero >= 0 && numero <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		if (numero > 25 && numero <= 50) {
			System.out.println("Intervalo (25,50]");
		}
		if (numero > 50 && numero <= 75) {
			System.out.println("Intervalo (50,75]");
		}
		if (numero > 75 && numero <= 100) {
			System.out.println("Intervalo (75,100]");
		}

		if (numero < 0 || numero > 100) {
			System.out.println("Fora de intervalo");
		}

	}

}
