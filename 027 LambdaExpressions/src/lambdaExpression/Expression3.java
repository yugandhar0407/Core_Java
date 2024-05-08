package lambdaExpression;

interface Lambda{
	public void FirstDemo();
}

public class Expression3 {

	public static void main(String[] args) {
	
		Lambda lambda = ()->{System.out.println("Welcome to Lambda Expressions");};
		lambda.FirstDemo();

	}

}
