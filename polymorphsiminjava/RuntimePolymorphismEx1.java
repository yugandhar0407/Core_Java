package polymorphsiminjava;

class Bank{
	float getRateOfInterest() {
		return 0;
	}
}
class SBI extends Bank{
	float getRateOfInterest() {
		return 8.4f;
	}
}
class ICICI extends Bank{
	float getRateOfInterest() {
		return 7.3f;
	}
}
class AXIS extends Bank{
	float getRateOfInterest() {
		return 9.7f;
	}
}
public class RuntimePolymorphismEx1 {

	public static void main(String[] args) {
		
		Bank bank = new SBI();
		System.out.println("SBI Rate of Interest: "+bank.getRateOfInterest());
		Bank bank1 = new AXIS();
		System.out.println("Axis Bank Rate of Interest: "+bank1.getRateOfInterest());
		Bank bank2 = new ICICI();
		System.out.println("ICICI Rate of Interest: "+bank2.getRateOfInterest());

	}

}
