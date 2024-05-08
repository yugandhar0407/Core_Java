package autoboxingunboxing;

public class AutoboxingEx {

	public static void main(String[] args) {

		int a = 50;

		@SuppressWarnings("removal")
		Integer a2 = new Integer(a); // AutoBoxing

		Integer a3 = 5;

		System.out.println(a2 + " " + a3);

		System.out.println("******************");

		@SuppressWarnings("removal")
		Integer i = new Integer(50);

		int a1 = i; // UnBoxing

		System.out.println(a1);

		System.out.println("*******************");

		@SuppressWarnings("removal")
		Integer s = new Integer(100);
		// UnBoxing
		if (s < 200) {
			System.out.println(s);
		}

	}

}
