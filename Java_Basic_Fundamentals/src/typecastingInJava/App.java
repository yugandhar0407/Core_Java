package typecastingInJava;

public class App {

	public static void main(String[] args) {

		double a = 3.5d;

		int b = (int) a + 3;

		System.out.println(b);

		System.out.println("**********");

		int c = 10;

		double d = c + 3.6d;

		System.out.println(d);

		System.out.println("**************");
		short x = 10;
		int y = x;

		System.out.println(y);

		System.out.println("*************");

		int x1 = 10;

		short y1 = (short) x1;

		System.out.println(y1);

		System.out.println("***********");

		double s = 10.0123456789d;

		float r = (float) s;

		System.out.println(r);

		System.out.println("*************");

		int y11 = 10;
		float x11 = y11;
		double z11 = x11;

		System.out.println("int value: " + y11);
		System.out.println("float value: " + x11);
		System.out.println("double value: " + z11);

		System.out.println("**************");

		int A = 5, B = 10;

		double C = 12, D = 15;

		System.out.println((double) A / B);
		System.out.println(C / B);
		System.out.println(C / D);
		System.out.println(D / A);

		
		System.out.println("***************");
		
		//a2 + b2 = 2ab = (a+b)2
		
		int a1 = 24;
		float b1 = 12.24f;
		double value = a1*a1+b1*b1+2*(a1*b1);
		
		System.out.println("Value of equation is " +value);
		
	}

}
