package variablesinJava;

public class TestVariable {

	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = false;
		boolean c = a&b;
		
		System.out.println("The Boolean value of c ="+c);
		
		System.out.println();
		
		byte ab = 20;
		byte bc = 40;
	//	byte cd = ab+bc;  // here type casting required because byte data type is out of range
		
		byte cd = (byte) (ab+bc);
		
		System.out.println("The addition of the byte value is ="+cd);
		
		System.out.println();
		
		short p = 120;
		short q = 140;
		
	//	short r = p+q; // here type casting required because short data type is out of range
		
		short r = (short) (p+q) ;
		
		System.out.println("The addition of the int value is="+r);
		
		System.out.println();
		
		int s = 1234567890;
		int t = 987654323;
		
		int w = s+t;
		
		System.out.println("The addition of the int value ="+w);
		
		System.out.println("");
		
		long l = 123456789987654321L;
		long m = 22248429022943894L;
		
		long n = l+m;
		
		System.out.println("The addition of two long numbers="+n);
		 System.out.println();
		 
		float y = 1245.6f;
		float z = 2345.6f;
		float g = y+z;
		System.out.println("The addition of two float values is="+g);
		System.out.println();
		
		double f = 23456.555d;
		double i = 45345.675d;
		
		double k = f+i;
		
		System.out.println("The addition of two double values is="+k);
		
		System.out.println();
		
		char character = 'A';
		char chaar= '\u00A7';
		
		System.out.println(character);
		System.out.println(chaar);
		
		
		
		
		
		
		
		
		

	}

}
