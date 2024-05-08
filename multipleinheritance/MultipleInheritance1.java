package multipleinheritance;

interface IsLike {

	void breathe();
}

interface LiveaLife {
	void message();
}

abstract class person implements IsLike, LiveaLife {

	public void speak() {
		System.out.println("Share his/her thoughts");
	}

	public void breathe() {
		System.out.println("Be alive, remain Living");
	}

	public void message() {
		System.out.println("Life is a journey keep moving and meet new people");
	}

	public abstract void eat();
}

class vegan extends person {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eats vegan foods");

	}

}

class Nonvegan extends person {

	@Override
	public void eat() {
		System.out.println("Eat NonVegan Foods");
	}

}

public class MultipleInheritance1 {

	public static void main(String[] args) {

		person Yugandhar = new vegan();
		Yugandhar.breathe();
		Yugandhar.eat();
		Yugandhar.message();
		Yugandhar.speak();

		System.out.println();

		person Dharani = new Nonvegan();
		Dharani.breathe();
		Dharani.eat();
		Dharani.message();
		Dharani.speak();

	}

}
