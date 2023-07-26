package application;

import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		System.out.print("Enter rectangle width and height");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		System.out.println("AREA = " + retangulo.area());
		System.out.println("PERIMETER = " + retangulo.perimeter());
		System.out.println("DIAGONAL = " + retangulo.diagonal());
		sc.close();
	}

}
