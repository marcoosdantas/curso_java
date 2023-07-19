package exercicio_2_2;

import java.util.Scanner;

public class exercicio_2_par {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		if (numero % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
	}

}
