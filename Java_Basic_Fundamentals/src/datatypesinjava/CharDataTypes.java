/* The char data type is a single 16-bit unicode character
 Its value range between '\u0000' to '\uffff'
 Is is used to store characters
 The Numerical range of char in Java is  to 65535
 default value is 2 bytes - 16 bits.
 The '\u0000' is the lowest range of unicode system.
 The '\uffff' is the highest range of unicode system
 Unicode system is a universal international standard character encoding that is capable of representing 
 most of the world's written languages
*/



package datatypesinjava;

public class CharDataTypes {

	public static void main(String[] args) {

		char a = '\u00A7';
		
		char b = 'a';
		
		System.out.println(a);
		System.out.println("***********");
		System.out.println(b);
		

	}

}
