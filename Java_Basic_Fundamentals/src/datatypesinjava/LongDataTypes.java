// The long data type is used to store whole numbers
// Its value range lies between -9223 to 9223
// It must be end with L, otherwise java considers as int data type
// default value is 0L
// size 8byte/64bit



package datatypesinjava;

public class LongDataTypes {

	public static void main(String[] args) {
		
		long l = 1234556789L;
		long m = 234554322345L;
		
		long n = l+m;
		
		System.out.println("The addition of the two long numbers is "+ n);
	}

}
