package strongNumber;

public class App {

	public static void main(String[] args) {


		int num = 145;
		
		int temp = num;
		
		int sum = 0;
		
		int lastdigit=0;
		
		while(temp!=0) {
			
			lastdigit=temp%10;
			
			int fact=1;
			
			for(int i=1;i<=lastdigit;i++) {
				
				fact = fact*i;
			}
			sum = sum+fact;
			
			temp/=10;
			
		}
		if(num==sum) {
			System.out.println("Strong Number");
		}else {
			System.out.println("Not Strong Number");
		}

	}

}
