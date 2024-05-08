package printOddIndexElements;

public class App {

	public static void main(String[] args) {
		
		String arr[] = {"yugandhar","Prasad","Siva","Yeswanth"};
		
		for(int i=0;i<arr.length;i++) {
			if(i%2==1) {
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("*************");
		int arr1[] = {1,3,2,4,3,5,3,6,4,7,8,9};
		
		for(int i=0;i<arr1.length;i++) {
			
			int n = arr1[i];
			/*
			 * if(n%2==0) { System.out.println(n); }
			 */
			
			if(i%2==1) {
				System.out.println(arr1[i]);
			}
		}
		
		

	}

}
