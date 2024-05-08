package javainnerclasses;

interface Eatable {             //By Using Interface
	void eat();
}

public class AnonymousInnerClass1 {

	public static void main(String[] args) {
		Eatable eat = new Eatable() {

			@Override
			public void eat() {
				System.out.println("Good to go! Nice Fruits");

			}
		};
		eat.eat();
	}

}
