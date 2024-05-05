package operatorsInJava;

public class ShiftOperators {

	public static void main(String[] args) {

		System.out.println(10 << 2); // 10*2*2 = 10*4
										                         // LiftShift Operator
		System.out.println(10 << 3); // 10*3*3 = 10*9

		System.out.println(20 << 2); // 20*2*2 = 20*4

		System.out.println(15 << 4); // 15*4*4 = 15*16

		System.out.println("*********************");

		System.out.println(10 >> 2); // 10/2*2 = 10/4

		System.out.println(15 >> 3); // 15/3*3 = 15/9             // Right Shift Operator

		System.out.println(20 >> 2); // 20/2*2 = 20/4
		
		System.out.println("*********************");
		
		System.out.println(20>>2);   //20/4
		
		System.out.println(20>>>2);  //20/4
		
		System.out.println(-20>>2);  //-20/4
		
		System.out.println(-20>>>2); //
		

	}

}
