package exercicio_3_2;

import java.util.Scanner;

public class exercicio_2_coordenada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numX, numY;
		numX = sc.nextInt();
		numY = sc.nextInt();
		while (numX * numY != 0) {
			if (numX > 0 && numY > 0) {
				System.out.println("Q1");
			} else if (numX < 0 && numY > 0) {
				System.out.println("Q2");
			} else if (numX < 0 && numY < 0) {
				System.out.println("Q3");
			} else if (numX > 0 && numY < 0) {
				System.out.println("Q4");

			}
			numX = sc.nextInt();
			numY = sc.nextInt();
		}
		sc.close();
	}

}
