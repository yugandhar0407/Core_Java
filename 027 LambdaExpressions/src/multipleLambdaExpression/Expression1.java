package multipleLambdaExpression;
interface Multiplication{
	public void Multiply();
}

public class Expression1 {

	public static void main(String[] args) {
		
		Multiplication m = () -> {
			System.out.println("The Multiplication of "+20*4);
			System.out.println("The Multiplication of "+20*5);
			
		};
		m.Multiply();

	}

}
