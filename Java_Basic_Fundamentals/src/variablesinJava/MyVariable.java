package variablesinJava;

public class MyVariable {

	public static void main(String[] args) {

		boolean a = true;
		boolean b = false;
		boolean c = a & b; // The default value of boolean is false

		System.out.println("Boolean Value of A and B is: " + a);
		System.out.println("Boolean Value of A and B is: " + b);
		System.out.println("Boolean Value of A and B is: " + c);
		

		System.out.println();

		byte d = 10;
		byte e = 12;
		byte f = (byte) (d + e); // Cannot convert from integer to byte so Type cast the byte to the assigned value
		//byte f = d+e;
		System.out.println("Adding of Two Byte Values: " + f);

		System.out.println();

		short g = 15;
		short h = 13;
		short i = (short) (g + h); // Cannot convert from integer to short so Type cast the short to the assigned
									// value

		System.out.println("Adding two Short Numbers: " + i);

		System.out.println();
		
		int j = 1234567891;
		int k = 654321;
		int l = j+k;
		
		System.out.println("Adding two Integer values: "+l);
		
		System.out.println();
		
		long m = 123456789101112L;
		long n = 121110987654321L;
		long o = m+n;
		
		System.out.println("Adding two Long Numbers: "+o);
		
		System.out.println();
		
		float p = 10f;
		float q = 6f;	
		float r = p/q;
		
		System.out.println("Adding two float values: "+r);
		
		System.out.println();
		
		double s = 10d;
		double t = 6d;
		double u = s/t;
		
		System.out.println("Adding two double numbers: "+u);
		
		System.out.println();
		
		char v = 'A';
		char x = '\u00A7';
		
		System.out.println("Character of v: "+v);
		System.out.println("Character of x: "+x);
		
		System.out.println();
		
		
		short shortVariable = 60;
		
		System.out.println("The value of the Variable of shortVariable is "+shortVariable);
		
		System.out.println();
		
		
		int abc = 12;
		short cba = 14;
		
		System.out.println(abc + cba);
		
		System.out.println();
		
		boolean ddd = true;
		
		boolean eee = false;
		
		System.out.println(ddd & eee);
		
		System.out.println();
		
		int value1;
		value1 = 1;
		System.out.println(value1);
		
		int value2 = 1;
		int value3 = 2*2 -(value2);
		System.out.println(value3);
		
		int value4 = 1+3;
	    int value5 = value4;
	    System.out.println(value5);
	    
	    int value6 = 1+3+4+5;
	    int value7 = 1-3-4-5;
	    
	    System.out.println(value7 - value6);
		
		
		
		

	}
}
