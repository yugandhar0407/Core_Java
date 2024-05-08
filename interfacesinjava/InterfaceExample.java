package interfacesinjava;

interface printable {
	void print();
}

class A6 implements printable {

	@Override
	public void print() {
		System.out.println("Hello Interface!!!");
	}

}

class A5 implements printable {

	@Override
	public void print() {
		System.out.println("Welcome");
		
	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {

		A5 obj = new A5();
		obj.print();
		A6 obj1 = new A6();
		obj1.print();

	}

}
