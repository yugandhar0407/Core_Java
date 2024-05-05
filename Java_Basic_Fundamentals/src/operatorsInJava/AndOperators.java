package operatorsInJava;

public class AndOperators {

	public static void main(String[] args) {
		
		int a = 10;
		
		int b = 5;         //Java Logical (&&) and Bitwise(&) operator 
		                      
		int c = 20;
		
		System.out.println(a<b && a<c); //False && False = False
		
		System.out.println(a<b & a<c);  // False & False = False
		
	}

}
