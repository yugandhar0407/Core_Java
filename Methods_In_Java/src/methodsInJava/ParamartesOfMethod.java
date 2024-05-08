package methodsInJava;

public class ParamartesOfMethod {
	public static void areaOfRectangle(double length, double width) {
		System.out.println(length*width);
	}
	public static double areaRectangle(double length, double width) {
		return length*width;
	}

	public static void main(String[] args) {
		
		System.out.println("Area of Rectangle with lenght: "+5.4+ " and width: "+3.4 );
		areaOfRectangle(5.4,3.4);
		
		System.out.println("Area of Rectangle with lenght: "+3.5+ " and width: "+2.4 );
		double area = areaRectangle(3.5,2.4);
		System.out.println(area);
	}

}
