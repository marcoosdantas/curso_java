package exercicio_3_3;

import java.util.Scanner;

public class exercicio_3_combustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, alcool = 0, gasolina = 0, diesel = 0;
		num = sc.nextInt();
		while (num != 4) {
			if (num == 1) {
				alcool += 1;
			}
			else if (num == 2) {
				gasolina += 1;
			}
			else if (num == 3) {
				diesel += 1;
			}
			num = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool =" + alcool);
		System.out.println("Gasolina =" + gasolina);
		System.out.println("Diesel =" + diesel);
		sc.close();
	}

}
