package methodsInJava;

public class ParameterizedMethod {
	
	public static void loop(int step, int finalValue) {
		while(step<=finalValue) {
			System.out.println(step);
			step++;
		}
	}

	public static void main(String[] args) {

		loop(10,20);
		System.out.println();
		loop(20,30);
		System.out.println();
		loop(10,20);
	}

}
