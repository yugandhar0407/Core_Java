package reverseifsumiseven;

public class App {

	public static void main(String[] args) {

		int arr[] = { 91, 75, 32, 64, 13 };

		for (int i = 0; i < arr.length; i++) {

			int n = arr[i];

			int sum = 0;

			int temp = n;

			while (temp != 0) {
				int ld = temp % 10;
				sum = sum + ld;
				temp = temp / 10;
			}
			temp = n;
			int rev = 0;
			if (sum % 2 == 0) {

				while (temp != 0) {
					int ld = temp % 10;
					rev = rev * 10 + ld;
					temp = temp / 10;
				}
				System.out.println(rev);

			} else {
				System.out.println(n);
			}

		}

	}

}
