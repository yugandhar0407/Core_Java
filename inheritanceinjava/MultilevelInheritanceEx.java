package inheritanceinjava;
class Movie{
	void holly() {
		System.out.println("Tiger");
	}
}
class Tollywood extends Movie{
	void tolly() {
		System.out.println("RRR");
	}
}
class Kollywood extends Tollywood{
	void kolly() {
		System.out.println("Yuvaratna");
	}
}
public class MultilevelInheritanceEx {

	public static void main(String[] args) {
		
		Kollywood mve = new Kollywood();
		mve.holly();
		mve.tolly();
		mve.kolly();

	}

}
