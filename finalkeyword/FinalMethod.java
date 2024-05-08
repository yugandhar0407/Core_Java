package finalkeyword;

class Bike1{
	//final void run() {
	void run() {
		System.out.println("Runnning");
	}
}
class Honda extends Bike1{
	void run() {
		System.out.println("Running safely with 100 kmps");
		
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		
		Honda bike = new Honda();
		bike.run();
		

		
	}

}
