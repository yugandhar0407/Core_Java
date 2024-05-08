package exceptionsinjava;

public class ExceptionEx3 {

	public static void main(String[] args) {

		int x = 30;

		try {
			System.out.println("We don't know, what will be the output: " + x / 10);
		} catch (RuntimeException e) {
			System.out.println("Runtime Exception");
		} catch (Exception e) {
			System.out.println("Exception!!!");
		} finally {
			System.out.println("This will be get Printed");
			System.out.println();
		}

	}

}
