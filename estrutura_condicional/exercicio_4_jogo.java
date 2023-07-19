package exercicio_2_4;

import java.util.Scanner;

public class exercicio_4_jogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if (num1 == num2) {
			System.out.println("O JOGO DUROU 24 HORAS");
		
		}
		if (num1 < num2) {
			System.out.println("O JOGO DUROU " + (num2 - num1) + " HORAS");
		
		}
		if (num1 > num2) {
			System.out.println("O JOGO DUROU " + ((24 - num1)+ num2) + " HORAS");
		}
	}

}
