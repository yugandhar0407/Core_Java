package arraysInjava;

public class AnonymousArrayInJava {
	
	static void printArray(int arr[]) {
		
		for(int i =0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

	public static void main(String[] args) {

   printArray(new int[] {1,2,3,4,5,});
	}

}
