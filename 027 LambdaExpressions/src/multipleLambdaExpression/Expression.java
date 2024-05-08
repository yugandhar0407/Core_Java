package multipleLambdaExpression;

interface Lambda{
	public void Staments();
}

public class Expression {

	public static void main(String[] args) {
		
		Lambda statement = () ->  {
			System.out.println("My Self Yugandhar");
			System.out.println("From Andhra Pradesh");
			
		};
		statement.Staments();

	}

}
