package exercicio_5;

import java.util.Scanner;

public class exercicio_5_subtotal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double codigoPeca1, numeroPeca1, valorPeca1;
		double codigoPeca2, numeroPeca2, valorPeca2;
		codigoPeca1 = sc.nextInt();
		numeroPeca1 = sc.nextInt();
		valorPeca1 = sc.nextInt();

		codigoPeca2 = sc.nextInt();
		numeroPeca2 = sc.nextInt();
		valorPeca2 = sc.nextInt();
		double total = ((numeroPeca1 * valorPeca1) + (numeroPeca2 * valorPeca2));
		System.out.println(total);
	}

}
