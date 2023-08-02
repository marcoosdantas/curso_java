package application;

import java.util.Scanner;

import entities.BankData;

public class Program {

	public static void main(String[] args) {
		double operation;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String name = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n)? ");
		String yesOrNo = sc.nextLine();
		BankData bank = new BankData();
		bank.setAccountNumber(accountNumber);
		bank.setName(name);
		if (yesOrNo.equalsIgnoreCase("n")) {
			System.out.println("Account data:");
			System.out
					.println("Account " + bank.getAccountNumber() + ", Holder: " + bank.getName() + bank.getBalance());

		} else if (yesOrNo.equalsIgnoreCase("y")) {
			System.out.println("Enter initial deposit value:");
			operation = sc.nextDouble();
			bank.addBalance(operation);
			System.out.println("Account " + bank.getAccountNumber() + ", Holder: " + bank.getName() + bank.getBalance());

		}
		System.out.println("Enter a deposit value: ");
		operation = sc.nextDouble();
		bank.addBalance(operation);
		System.out.println("Account " + bank.getAccountNumber() + ", Holder: " + bank.getName() + bank.getBalance());
		System.out.println("Enter a withdraw value: ");
		operation = sc.nextDouble();
		bank.withdrawBalance(operation);
		System.out.println("Account " + bank.getAccountNumber() + ", Holder: " + bank.getName() + bank.getBalance());
		sc.close();
	}
}