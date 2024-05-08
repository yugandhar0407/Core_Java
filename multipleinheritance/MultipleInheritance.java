package multipleinheritance;

interface Printable{
	void print();
}
interface Showable{
	void show();
}

class A7 implements Printable, Showable{

	@Override
	public void show() {
		
		System.out.println("Hello !!!");
		
	}

	@Override
	public void print() {
		
		System.out.println("Welcome to Multiple Inheritance");
		
	}
	
}
public class MultipleInheritance {

	public static void main(String[] args) {
		
		A7 obj = new A7();
		obj.print();
		obj.show();
		
	}

}
