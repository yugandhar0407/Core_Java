package lambdawithoutInterface;

public class Expression {

	public static void main(String[] args) {

		new Thread(() -> {
			System.out.println("Hello Everyone");
			System.out.println("I am Yugandhar");
		}).start();

	}

}
