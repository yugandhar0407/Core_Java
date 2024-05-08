package lambdaVariables;

interface Lambda2{
	abstract public void demo(int x, double y, float z);
}

public class App {

	public static void main(String[] args) {
		Lambda2 lambda = (int x, double y, float z) -> {
			System.out.println("The Value of Int x "+x);
			System.out.println("The Value of Double "+y);
			System.out.println("The Value of Float "+z);
			
			System.out.println("***************");
			
			System.out.println("From the demo method");
		};
		lambda.demo(10, 23.54, 2526.45f);
	}

}
