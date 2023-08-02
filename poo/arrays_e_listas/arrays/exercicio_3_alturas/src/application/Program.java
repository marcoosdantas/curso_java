package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Ficha;

public class Program {

	public static void main(String[] args) {
		String nome;
		int idade;
		double altura;
		double soma = 0;
		int menorDeDezesseis = 0;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		Ficha[] pessoas = new Ficha[n];
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.print("Dados da " + (i + 1) + "a pessoa:\n");
			System.out.print("NOME: ");
			nome = sc.nextLine();
			System.out.print("IDADE: ");
			idade = sc.nextInt();
			sc.nextLine();
			System.out.print("ALTURA: ");
			altura = sc.nextDouble();
			sc.nextLine();
			pessoas[i] = new Ficha(nome, idade, altura);
		}
		for (int i = 0; i < n; i++) {
			soma += pessoas[i].getAltura();
		}
		System.out.println("Média das alturas:" + soma / n);
		for (int i = 0; i < n; i++) {

			if (pessoas[i].getIdade() < 16) {
				menorDeDezesseis += 1;
			}
		}
		System.out.println("Pessoas com menos de 16 anos: " + ((menorDeDezesseis / n) * 100) + "%");
		for (int i = 0; i < n; i++) {
			if (pessoas[i].getIdade() < 16)
				System.out.println(pessoas[i].getNome());
			sc.close();
		}
	}
}
