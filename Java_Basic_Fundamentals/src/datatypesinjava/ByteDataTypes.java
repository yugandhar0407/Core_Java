// Byte dataType- The Byte data type holds an 8bit signed two complement integer
// Its range lies between -128 to 127
// default value = 0
// default size = 1 byte = 8 bits
// its is used to save memory where in large arrays where memory is required
// it is four times smaller than integer

package datatypesinjava;

public class ByteDataTypes {

	public static void main(String[] args) {

		byte a = 1;

		byte b = 1;

		byte c =  (byte) (a + b);  // type casting is required because byte 

		System.out.println("The addition of two bytes is "+c);
		

	}

}
