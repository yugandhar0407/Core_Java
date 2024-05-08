package StringsInJava;

public class PalindromeString {

	public static void main(String[] args) {

		String Palindrome = "dot saw i was tod";

		int len = Palindrome.length();

		char[] TempCharArray = new char[len];

		char[] CharArray = new char[len];

		for (int i = 0; i < len; i++) {
			TempCharArray[i] = Palindrome.charAt(i);

		}

		for (int j = 0; j < len; j++) {
			CharArray[j] = TempCharArray[len - 1 - j];

		}

		String reversePalindrome = new String(CharArray);

		System.out.println(reversePalindrome);

	}

}
