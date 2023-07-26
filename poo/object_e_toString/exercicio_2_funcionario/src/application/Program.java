package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		System.out.println("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		System.out.println("Employee: " + employee.name + employee.netSalary());
		System.out.println("Which percentage to increase salary?");
		double tax = sc.nextDouble();
		employee.increaseSalary(tax);
		System.out.println("Updated data: " + employee.name + ", $ " + String.format("%.2f", employee.netSalary()));
		sc.close();
	}

}
