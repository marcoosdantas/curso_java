package entities;

public class BankData {
	private int accountNumber;
	private String name;

	private double balance;

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void addBalance(double balance) {
		this.balance += balance;
	}
	public void withdrawBalance(double balance) {
		this.balance -= balance + 5;
	}

}
