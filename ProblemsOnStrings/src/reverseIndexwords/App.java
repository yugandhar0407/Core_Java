package reverseIndexwords;

public class App {

	public static void main(String[] args) {

		String s = "I am going to Hyderabad";

		String str[] = s.split(" ");

		for (int i = 0; i < str.length; i++) {

			if (i != 0 && i % 2 == 0) {

				String s1 = str[i];

				String rev = "";

				for (int j = s1.length() - 1; j >= 0; j--) {

					rev = rev + s1.charAt(j);
				}
				System.out.print(rev + " ");
			} else {
				System.out.print(str[i] + " ");
			}

		}

	}

}
