package arraysInjava;

public class ReturnArrayFormMethod {

	static int[] get() {
		return new int[] {1,2,3,4,5,6,7,8,9};
	}
	public static void main(String[] args) {

		int arr[] = get();
		
		for(int i =0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}


	}

}
