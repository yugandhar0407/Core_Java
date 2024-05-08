package polymorphsiminjava;

class Bike{
	void run() {
		System.out.println("Running");
	}
}
class Splendor extends Bike{
	void run() {
		System.out.println("Running Safely with 60KM");
	}
}

public class RuntimePolymorphismEx {

	public static void main(String[] args) {
		
		Bike bike = new Splendor();
		bike.run();

	}

}
