package exercicio_4;

import java.util.Scanner;

public class exercicio_4_funcionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double salarioHora = sc.nextDouble();
		double total = horasTrabalhadas * salarioHora;
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.4f" , total);

	}

}
