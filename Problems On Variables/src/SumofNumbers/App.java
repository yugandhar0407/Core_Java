package SumofNumbers;

public class App {

	public static void main(String[] args) {
		
		int a = 1+2+3+4+5+6+7+8+9+10;
		                                     // sum of first 10 natural numbers
		System.out.println("Sum of first 10 Natural  Nunbers: "+ a);
		
		System.out.println("*******************");
		
		int N = 10;    //first initialize a variable with data type
		
		int sum = 0;   // Now take a dummy variable with data type
		
		System.out.print("First " + N + " Numbers = ");
		
		for(int i=1; i<=N;i++) {
			System.out.print(i +  " ");
			sum += i;
		}
			System.out.println();
			System.out.println("Sum of First "+ N 
					+" Natural Numbers= "+ sum);
		
		System.out.println("************");
		
		int add =0;
		for(int j=0;j<=20;j++) {
			
			System.out.println(j);
			add += j;
			
		}
		System.out.println("Sum of 10 numbers: "+add);
		
		
		
		
	}

}
