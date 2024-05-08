package finalkeyword;
class Bike{
	//final int speedlimit = 90;
	int speedlimit=90;
	void run() {
		speedlimit = 400;
	}
}
public class FInalVariable {

	public static void main(String[] args) {

		Bike bike = new Bike();
		bike.run();

	}

}
