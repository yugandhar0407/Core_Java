package lambdaVariables;

interface Lambda{
	abstract public void demo(int x);
}

public class Expresssion {

	public static void main(String[] args) {
		Lambda lambda = (int x) -> {
			System.out.println("The value of x "+x);
			System.out.println("Statement from the demo method");
		};
		lambda.demo(200);
	}

}
