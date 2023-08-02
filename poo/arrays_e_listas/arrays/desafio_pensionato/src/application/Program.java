package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		Dados[] pessoas = new Dados[10];
		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i + 1));
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			pessoas[room] = new Dados(nome, email);
		}
		System.out.println("Busy rooms:");
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i] != null) {
				System.out.println(i + ": " + pessoas[i].getNome() + pessoas[i].getEmail());
			}
		}
		sc.close();
	}
}
