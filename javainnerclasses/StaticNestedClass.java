package javainnerclasses;

public class StaticNestedClass {
	static int data = 30;

	static class inner {
		void msg() {
			System.out.println("data is: " + data);
		}
	}

	public static void main(String[] args) {

		StaticNestedClass.inner obj = new StaticNestedClass.inner();
		obj.msg();

	}

}
