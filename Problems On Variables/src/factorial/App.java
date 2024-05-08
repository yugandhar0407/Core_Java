package factorial;

public class App {

	public static void main(String[] args) {

		int i,fact =1;
		int number = 5;
		
		for(i=1;i<=number;i++) {
			fact = fact*i;
		}
		System.out.println("The Factorial series is 5*4*3*2*1");

		System.out.println("The Factorial of 5 is: "+fact);
		
		
		int aa, factorial=1;
		int num = 10;
		
		for(aa=1;aa<=num;aa++) {
			factorial = factorial*aa;
		}
		
		System.out.println("The Factorial is "+factorial);
		
		
		int z, factorials = 1;
		int nums = 3;
		
		for(z=1;z<=nums;z++){
			
			factorials = factorials*z;
			
		}
		System.out.println("The Factorial is "+ factorials);
		
		
	}

}
