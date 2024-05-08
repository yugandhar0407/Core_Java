package factorsOfNumbers;

public class Test {

	public static void main(String[] args) {
		
		int number = 100;
		
		System.out.print("The Factors of "+number +" are= ");
		
		for( int i=1;i<=number;i++) {
			if(number % i ==0) {
				System.out.print(i +" ");
			}
		}
		
	}

}
