package loopsinjava;

public class ForLoopExamples {

	public static void main(String[] args) {
		//Simple For Loop
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		//reverse numbers
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		System.out.println();
		//For-Each Loop
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int a : arr) {
			System.out.println(a);
		}
		System.out.println();
		//Nested For Loop
		for (int i = 0; i <=3; i++) {
			for (int j = i; j <= 3; j++) {
				System.out.println(i + " " + j);
			}

		}
		System.out.println();
		
		for(int i=0;i<=10;i++) {
			System.out.print(i + " / ");
		}
		
		//Infinite For Loop
		for(;;) {
			System.out.println("This is the Infinite For Loop");
		}
	}

}
