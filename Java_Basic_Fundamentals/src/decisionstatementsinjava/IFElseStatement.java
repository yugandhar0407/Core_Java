package decisionstatementsinjava;

public class IFElseStatement {

	public static void main(String[] args) {
		int number = 10;
		if (number % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}

		System.out.println();

		int backbalance = 1000;

		if (backbalance > 1500) {
			System.out.println("Your Account has Enough Balance");
		} else {
			System.out.println("Your Account ha Insufficient Balance");
		}
	}

}
