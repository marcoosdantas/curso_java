package entities;

public class Student {
	public String name;
	public double firstGrade;
	public double secondGrade;
	public double thirdGrade;

	public double finalGrade() {
		return firstGrade + secondGrade + thirdGrade;
	}

	public double missingPoints() {
		return 60 - finalGrade();
	}
}
