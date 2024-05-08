package arraysInjava;

public class App {

	public static void main(String[] args) {

		int a[] = new int[5];
		a[0] = 0;
		a[1] = 20;
		a[2] = 40;
		a[3] = 60;
		a[4] = 80;

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}

		System.out.println("************");

		int Array[] = { 0, 2, 4, 6, 8 };

		for (int i = 0; i < Array.length; i++) {

			System.out.println(Array[i]);
		}

		System.out.println("***************");

		int b[] = new int[10];

		b[0] = 200;
		b[1] = 400;

		System.out.println(b[0] + b[1]);

		System.out.println("**********");

		int array[] = { 2, 3, 4, 5, 6, 7 };

		for (int i : array) {
			System.out.println(i);
		}
		
		
		
		
		

	}

}
