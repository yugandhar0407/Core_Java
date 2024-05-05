package variablesinJava;

public class VariableAddingLowerType {

	public static void main(String[] args) {
		
		byte a = 10;
		
		byte b = 10;
		
	//	byte c = (a+b);   // here type explicit casting is required because cannot convert from int to byte;
		
		byte c =  (byte) (a+b);  // with the help of type casting we got the output;
		
		System.out.println(c);
		
		System.out.println("**************");
		
		byte a1 = 10;
		double a2 = 10.0;
		int a3 = 1;
		long a4 = 200L;
		float a5 = 13f;
		
		
		System.out.println(a1+a2+a3+a4+a5);
		
		

	}

}
