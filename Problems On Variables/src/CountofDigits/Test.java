package CountofDigits;

public class Test {

	public static void main(String[] args) {
		
		int n = 123456;
	
		int count = 0;
		
		while(n!=0) {
			
			n = n/10;
			count++;
		}

		System.out.println(count);
		
		
		System.out.println("************");
		
		int b = 1234;
		
		int sum = 0;
		int lastdigit = 0;
		while(b!=0) {
			lastdigit = b%10;
			sum = sum+lastdigit;
			b= b/10;
		}
		System.out.println(sum);
		
		System.out.println("***********");
		
		int c = 1234;
		
		int product = 1;
		
		int lastdigit1= 0;
		
		while(c!=0) {
			lastdigit1 = c%10;
			product = product*lastdigit1;
			c = c/10;
		}
	      System.out.println(product);
	}

}
