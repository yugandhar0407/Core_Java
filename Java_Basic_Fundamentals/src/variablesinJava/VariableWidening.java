package variablesinJava;

public class VariableWidening {

	public static void main(String[] args) {
		
		int a = 10;
		
		float b = a;               // widening is known as the Implicit TypeCasting
		                           // converting the small data type to large datatype.
		                           // byte-short-int-long-float-double.
		
		System.out.println(a);
		
		System.out.println("***************");
		
		System.out.println(b);
	}

}
