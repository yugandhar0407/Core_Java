package sumandProduct;

public class App {

	public static void main(String[] args) {
		
		int arr[] = {2,4,6,8,10};
		
		int sum = 0;
		
		int product = 1;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum+arr[i];
			product = product*arr[i];
			
			
			
			
		}
		System.out.println(sum);
		System.out.println("************");
		System.out.println(product);

	}

}
