package multiDimensionalArray;

public class App {

	public static void main(String[] args) {
		
		int arr[][] = {{1,2,3}, {4,5,6},{7,8,9}};
		
		for(int i =0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("***************");
		
		
		int array[][] = new int [3][];
		array[0] = new  int[3];
		array[1] = new  int[4];
		array[2] = new  int[5];
		                                        //Jagged Array
		int count =0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++)
				array[i][j] = count++;
		}
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		
		}
		
		System.out.println("*****************");
		char[] copyFrom = {'g','t','t','y','u','g','a','n','d','h','a','r','g','h','j'};
		char[] copyTo = new char[9];
		
		System.arraycopy(copyFrom, 3, copyTo, 0,9);
		System.out.println(String.valueOf(copyTo));
		
		
		

	}

}