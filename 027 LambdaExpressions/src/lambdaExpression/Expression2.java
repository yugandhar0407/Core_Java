package lambdaExpression;

interface Addition {
	public void Add();
}

public class Expression2 {

	public static void main(String[] args) {

		int A = 10;
		int B = 20;
		int C = A + B;

		Addition a1 = () -> {
			System.out.println("Adding of A and B = " + C);
		};

		a1.Add();

	}

}
