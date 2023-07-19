package exercicio_2_5;

import java.util.Scanner;

public class exercicio_5_lanchonete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double codigo, quantidade;
		codigo = sc.nextDouble();
		quantidade = sc.nextDouble();
		if (codigo == 1){
			System.out.println("Total: R$" + quantidade * 4);
		}
		if (codigo == 2){
			System.out.println("Total: R$" + quantidade * 4.5);
		}
		if (codigo == 3){
			System.out.println("Total: R$" + quantidade * 5);
		}
		if (codigo == 4){
			System.out.println("Total: R$" + quantidade * 2);
		}
		if (codigo == 5){
			System.out.println("Total: R$" + quantidade * 1.5);
		}
	}

}
