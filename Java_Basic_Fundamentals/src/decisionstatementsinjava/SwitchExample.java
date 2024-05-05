package decisionstatementsinjava;

public class SwitchExample {

	public static void main(String[] args) {

		int num = 20;

		switch (num) {
		case 10:
			System.out.println("100");
			break;
		case 20:
			System.out.println("200");
			break;
		case 30:
			System.out.println("300");
			break;
		case 40:
			System.out.println("400");
			break;
		case 50:
			System.out.println("500");
			break;
		default:
			System.out.println("Not Found");
		}

		System.out.println();

		// Switch Using Strings
		String s = "Opener";

		switch (s.toLowerCase()) {
		case "Captain":
			System.out.println("Rohit Sharma");
			break;
		case "opener":
			System.out.println("Rohit Sharma");
			break;
		case "hitman":
			System.out.println("Rohit sharma");
			break;
		default:
			System.out.println("Not Found");

		}

		System.out.println();

		int x = 3;
		switch (x) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("Data Not Found");

		}
	}

}
