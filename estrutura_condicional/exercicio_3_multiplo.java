package exercicio_2_3;

import java.util.Scanner;

public class exercicio_3_multiplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		if ((num2 % num1 == 0) || (num1 % num2 == 0)) {
			System.out.println("MULTIPLO");
		}
		else {
			System.out.println("NAO MULTIPLO");
		}
	}

}
