package abstractclassesinjava;

abstract class Person {
	public void speak() {
		System.out.println("Share his/her thoughts");
	}

	public abstract void eat();

}

class vegan extends Person {

	@Override
	public void eat() {
		System.out.println("Eats Vegan Foods");

	}

}

class Nonvegan extends Person {

	@Override
	public void eat() {
		System.out.println("Eat Non Vegan Foods");
	}

}

public class AbstractInJava2 {

	public static void main(String[] args) {
		Person obj = new vegan();
		obj.speak();
		obj.eat();

		System.out.println();

		Person obj1 = new Nonvegan();
		obj1.speak();
		obj1.eat();

	}

}
