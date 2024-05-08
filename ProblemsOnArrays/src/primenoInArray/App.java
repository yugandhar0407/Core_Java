package primenoInArray;

public class App {

	public static void main(String[] args) {
		
		int arr[] = {1,24,23,41,60,71,66,};
		
		for(int i=0;i<arr.length;i++) {
			
			int n=arr[i];
			
			int count = 0;
			
			for(int j=1;j<=n;j++) {
				if(n%j==0) {
					count++;
				}
			}
			
			if(count==2) {
				System.out.println(n);
			}
		}
	}

}

