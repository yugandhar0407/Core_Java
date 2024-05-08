package methodoverloadingInJava;

public class DifferentParameters {
	public static double Area(double length, double width) {

		return length * width;
	}

	public static double Area(double side) { // differs in parameters
		return side * side;
	}

	public static void main(String[] args) {

		System.out.println("Area of Rectangle: " + Area(10.5d, 12.2d));
		System.out.println("Area of Square: " + Area(12.5d));
	}

}
