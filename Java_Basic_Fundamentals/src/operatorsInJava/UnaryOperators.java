package operatorsInJava;

public class UnaryOperators {

	public static void main(String[] args) {
		
		int x = 10;
		
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);

		
		System.out.println("*************");
		
		int a = 10;
		int b = 10;
		
		System.out.println(a++ + ++a);
		System.out.println(b++ + b++);
		
		System.out.println("**************");
		
		int c = 10;
		int d = 10;
		
		boolean e = true;
		boolean f = false;
		
		System.out.println(~c);
		System.out.println(~d);
		System.out.println(!e);
		System.out.println(!f);
	}

}
