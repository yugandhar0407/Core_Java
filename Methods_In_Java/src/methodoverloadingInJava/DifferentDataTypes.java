package methodoverloadingInJava;

public class DifferentDataTypes {
	
	public static int sum(int x, int y) {
		System.out.println("Adding two int entities");
		
		return x+y;
	}
	public static float sum(int x,float y) {
		System.out.println("Adding two float entities");
		                                                          // differs in data types
		return x+y;
	}
	public static double sum(double x, double y) {
		System.out.println("Adding two double entities");
		
		return x+y;
	}
	public static void main(String[] args) {
		
		System.out.println("1+2: "+sum(1,2));
		System.out.println("1+2.5f: "+sum(1,2.5f));
		System.out.println("2.3+2.6: "+sum(2.3,2.6));
		
	}

}
