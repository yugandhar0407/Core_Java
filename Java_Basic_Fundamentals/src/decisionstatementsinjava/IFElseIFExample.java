package decisionstatementsinjava;

public class IFElseIFExample {

	public static void main(String[] args) {

		int marks = 95;
		if (marks < 50) {
			System.out.println("Fail");
		} else if (marks >= 60 && marks <= 70) {
			System.out.println("C Grade");
		} else if (marks >= 70 && marks <= 80) {
			System.out.println("B Grade");
		} else if (marks >= 80 && marks <= 90) {
			System.out.println("A Grade");
		} else if (marks >= 95) {
			System.out.println("A+ Grade");
		} else {
			System.out.println("Invalid");
		}

		System.out.println();
		// Program to check given number is positive or negitive
		int num = 13;
		if (num > 0) {
			System.out.println("Positive Number");
		} else if (num < 0) {
			System.out.println("Negitive Number");
		} else {
			System.out.println("Zero");
		}
	}

}
