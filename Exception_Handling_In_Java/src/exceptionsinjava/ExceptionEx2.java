package exceptionsinjava;

public class ExceptionEx2 {

	public static void main(String[] args) {
		int x = 1;

		try {
			System.out.println("We dont know, what will the outcome: " + x / 100);
		} catch (ArithmeticException e) {
			System.out.println("Arithemetic Exception Occured");
		} catch (RuntimeException e) {
			System.out.println("Inside Exception Block");
		}
	}

}
