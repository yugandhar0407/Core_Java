package aggregationinjava;

class Operation {
	int square(int n) {
		return n * n;
	}
}

class Circle {
	Operation Op;
	double pi = 3.14;

	double area(int radius) {
		Op = new Operation();
		int square = Op.square(radius);
		return pi * square;

	}
}

public class AggregationEx {

	public static void main(String[] args) {

		Circle c = new Circle();
		double result = c.area(5);
		System.out.println(result);
	}

}
