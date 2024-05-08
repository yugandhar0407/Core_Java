package armStrongNumber;

public class Test {

	public static void main(String[] args) {

		int n = 123;
		int sum = 0;
		int temp = n;
		int count = 0;

		while (temp != 0) {

			temp /= 10;
			count++;
		}
		temp = n;
		int lastdigit = 0;
		while (temp != 0) {
			lastdigit = temp % 10;
			int product = 1;
			for (int i = 1; i <= count; i++) {
				product = product * lastdigit;

			}
			sum = sum + product;
			temp /= 10;

		}
		if (n == sum) {
			System.out.println("ArmStrong Number");
		} else
			System.out.println("Not an ArmStrong Number");

	}

}
