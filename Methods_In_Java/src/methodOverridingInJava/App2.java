package methodOverridingInJava;

class Yugandhar {
	public void name() {
		System.out.println("My name is Yugandhar");
	}
}

class Laddu extends Yugandhar {
	public void name() {
		System.out.println("My name is Laddu");
	}
}

public class App2 {

	public static void main(String[] args) {
		Yugandhar app = new Laddu();
		app.name();

	}

}
