package methodsInJava;

public class CallingMethod {

	public static void main(String[] args) {
		int a = 4;
		int b = 6;
		int c = add(a, b);

		System.out.println("The sum of the a and b is: " + c);

	}

	public static int add(int n1, int n2) {

		int s;
		s = n1 + n2;

		return s;

	}
}
