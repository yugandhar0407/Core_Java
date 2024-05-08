package reverseWordswithletters;

public class App {

	public static void main(String[] args) {

		String s = "Java Programming";

		String str[] = s.split(" ");

		String revString = "";

		for (int i = str.length - 1; i >= 0; i--) {

			String s1 = str[i];
			String revWord = "";

			for (int j = s1.length() - 1; j >= 0; j--) {

				revWord = revWord + s1.charAt(j);
			}
			revString = revString + revWord + " ";
		}
		System.out.println(revString);
	}

}
