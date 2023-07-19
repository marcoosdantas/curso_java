package exercicio_2_7;

import java.util.Scanner;

public class exercicio_7_quadrantes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numX, numY;
		numX = sc.nextDouble();
		numY = sc.nextDouble();
		if (numX == numY && numX == 0) {
			System.out.println("ORIGEM");
		} else if (numX > 0 && numY > 0) {
			System.out.println("Q1");
		} else if (numX < 0 && numY > 0) {
			System.out.println("Q2");
		} else if (numX < 0 && numY < 0) {
			System.out.println("Q3");
		} else if (numX > 0 && numY < 0) {
			System.out.println("Q4");
		} else if (numX > 0 && numY != 0) {
			System.out.println("Eixo X");
		} else if (numX != 0 && numY > 0) {
			System.out.println("Eixo Y");
		}
	}

}
