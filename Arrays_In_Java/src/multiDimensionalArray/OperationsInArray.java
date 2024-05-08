package multiDimensionalArray;

public class OperationsInArray {

	public static void main(String[] args) {

		int a[][] = {{5,2,8}, {2,6,2}};
		int b[][] = {{2,5,8},{3,3,3}};
		int c [][] = new int [2][3];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				c[i][j] = a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
