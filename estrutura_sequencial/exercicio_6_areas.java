package exercicio_6;

import java.util.Scanner;

public class exercicio_6_areas {

	public static void main(String[] args) {
		double pi = 3.14159;
		Scanner sc = new Scanner(System.in);
		double  numA, numB, numC;
		numA = sc.nextDouble();
		numB = sc.nextDouble();
		numC = sc.nextDouble();
		double areaTriangulo = (numA*numC)/2;
		double areaCirculo = pi* Math.pow(numC, 2);
		double areaTrapezio = ((numA+numB) * numC)/2;
		double areaQuadrado = Math.pow(numB, 2);
		double areaRetangulo = numA * numB;
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n" , areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n" , areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n" , areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n" , areaRetangulo);
		
	}

}
