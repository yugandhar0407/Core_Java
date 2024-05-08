package methodsInJava;

public class InstanceMethod {

	public static void main(String[] args) {

		InstanceMethod obj = new InstanceMethod();

		System.out.println("The Sum of the two numbers is: " + obj.add(5, 5));
	}

	int s;

	public int add(int n1, int n2) {

		s = n1 + n2;
		return s;
	}
}
