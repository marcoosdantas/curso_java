package exercicio_2;

import java.util.Scanner;

public class exercicio_2_area_circunferencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double π = 3.14159;
		double raio = sc.nextDouble();
		double resultado = π*Math.pow(raio, 2);
		System.out.printf("A= %.4f" , resultado);
		

	}

}
