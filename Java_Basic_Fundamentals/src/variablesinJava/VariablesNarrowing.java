package variablesinJava;

public class VariablesNarrowing {

	public static void main(String[] args) {
		
		float f = 10.5f;
		
		//int a = f;                   // Narrowing is a Explicit type casting.
		                             // converting the large data type to small data type.
		                             // double-float-long-int-short-byte
		
		int a = (int)f;   //TypeCasting
		
		System.out.println(a);
		System.out.println("*******");
		System.out.println(f);
		
		
		

	}

}
