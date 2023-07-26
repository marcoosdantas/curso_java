package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student stud = new Student();
		stud.name = sc.nextLine();
		stud.firstGrade = sc.nextDouble();
		stud.secondGrade = sc.nextDouble();
		stud.thirdGrade = sc.nextDouble();
		System.out.println("FINAL GRADE: " + stud.finalGrade());
		if (stud.finalGrade() >= 60)
			System.out.println("PASS");
		else {
			System.out.println("FAILED");
			System.out.println("MISSING " + stud.missingPoints() + " POINTS");
		}
		sc.close();
	}

}
