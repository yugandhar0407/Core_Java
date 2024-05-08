package methodsInJava;

import java.util.Scanner;

public class UserDefined {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the number: ");

			int num = scan.nextInt();

			findEvenOdd(num);
		}

	}

	public static void findEvenOdd(int num) {

		if (num % 2 == 0) {
			System.out.println("num is Even");
		} else {
			System.out.println("num is Odd");

		}

	}

}
