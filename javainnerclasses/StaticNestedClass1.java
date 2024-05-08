package javainnerclasses;

public class StaticNestedClass1 {       //Static Nested Class with Static Method
	static int data = 30;

	static class inner {
		static void msg() {
			System.out.println("data is: " + data);
		}
	}

	public static void main(String[] args) {
		StaticNestedClass1.inner.msg();
	}

}
