package exceptionsinjava;

public class ExceptionEx {

	public static void main(String[] args) {
		
	     int a = 50/0;          //ArithmeticException
		
		String s = null;
		System.out.println(s.length());  //NullPointer Exception

		String s1 = "abc";
		int i= Integer.parseInt(s1);          //NumberFormat Exception
		
		
		
		int a1[] = new int[5];
		a1[10] = 50;                       //ArrayIndexOutOfBoundException
	}

}
