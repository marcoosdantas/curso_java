package exercicio_3_1;

import java.util.Scanner;

public class exercicio_1_senha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int senha;
		senha = sc.nextInt();
		while (senha != 2002) {
			System.out.println("SENHA INVALIDA");
			senha = sc.nextInt();
		}
		System.out.println("ACESSO PERMITIDO");
		sc.close();
	}

}
