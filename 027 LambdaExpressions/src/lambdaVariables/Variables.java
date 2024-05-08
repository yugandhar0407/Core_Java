package lambdaVariables;

interface Lambda1{
	abstract public void demo1(int x, float y);
}

public class Variables {

	public static void main(String[] args) {
		
		Lambda1 lambda = (int x, float y) -> {
			System.out.println("The value int x "+x+" and the value float y "+y);
			System.out.println("Two Variables from demo1 method");
		};
		lambda.demo1(500, 234.5f);

	}

}
