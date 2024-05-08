package javainnerclasses;

abstract class Person {                     //By Using Class
	abstract void eat();
}

public class AnonymousInnerClass {

	public static void main(String[] args) {

		Person p = new Person() {

			@Override
			void eat() {
				System.out.println("Nice Fruits");

			}

		};
		p.eat();

	}

}
