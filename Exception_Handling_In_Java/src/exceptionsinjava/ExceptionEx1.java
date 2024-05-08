package exceptionsinjava;

public class ExceptionEx1 {

	public void case1(int x, int y) {
		if (y != 0) {
			System.out.println(x / y);
		} else {
			System.out.println("The value of y is 0");
		}

	}

	public void case2(int x, int y) {
		try {
			System.out.println(x / y);
		} catch (Exception E) {
			System.out.println("The value of y is 0");
		}
	}

	public static void main(String[] args) {

		ExceptionEx1 obj = new ExceptionEx1();
		obj.case1(100, 20);
		obj.case2(0, 10);

	}

}
