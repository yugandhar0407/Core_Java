package palindromeinArray;

public class App {

	public static void main(String[] args) {

		int arr[] = { 121, 3437, 2427, 330, 221, 5456 };

		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {

			int n = arr[i];

			int temp = n;

			int rev = 0;

			while (temp != 0) {
				int ld = temp % 10;
				rev = rev * 10 + ld;

				temp = temp / 10;

			}
			if (n == rev) {
				flag = true;
				System.out.println(n);
			}
		}
		if (flag == false) {
			System.out.println("No Palindromes are Present in a Array");
		}
	}

}
