package operatorsInJava;

public class TernaryOperators {

	public static void main(String[] args) {

		int a = 2;

		int b = 4;

		int min = (a < b) ? a : b;
		System.out.println(min);
		
		System.out.println("*****************");
		
		boolean x;
		
		x = (5<4)?true:false;
		
		System.out.println(x);
		
		System.out.println("******************");
		
		int age = 15;
		
		String a1 = "Allowed to vote";
		
		String b1 = "Not Allowed to vote";
		
		String AccessAllowed = (age>18)?a1:b1;
		
		System.out.println(AccessAllowed);
		
		System.out.println("**************");
		
		int x11;
		
		x11 = (10<13)?1:0;
		
		System.out.println(x11);
		
		
		
		
		
	}

}
