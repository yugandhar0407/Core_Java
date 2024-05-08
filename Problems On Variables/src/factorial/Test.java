package factorial;

public class Test {
	static int factorial(int n) {
		if(n==0)
			return 1;
	else 
		
		return (n*factorial(n-1));
		
	}
	public static void main(String[] args) {

		int i,fact=1;
		int number = 10;
		fact = factorial(number);
		
		System.out.println("The factroial of 10 is: "+fact);
	}
}
