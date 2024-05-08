package duplicateChar;

public class Remove {

	public static void main(String[] args) {

		String s = "prasad";

		String s1 = "";

		int count = 1;

		for (int i = 0; i < s.length() - 1; i++) {

			for (int j = i + 1; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			if (count == 1) {
				s1 = s1 + s.charAt(i);
			}
		}
		System.out.println(s1);

	}

}
