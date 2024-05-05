package variablesinJava;

public class VariableOverflow {

	public static void main(String[] args) {
		
		
		int a = 130;
		
		
		byte b = (byte)a;
		
		System.out.println(b);    // here the output of the variable b is assigned with the data type byte and the o/p 
		                          // is -126; because its range is lies between -128 to 127 only.
		
		System.out.println("************");
		
		System.out.println(a);
		// here the o/p is directly print the value because the int data type is assigned to variable a is in range.
		// its range is -2417.... to 2417.......
		                    
	}

}
