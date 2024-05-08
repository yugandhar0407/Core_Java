package finalkeyword;

//final class School{
class School{
	void run() {
		System.out.println("I am ready to go to school");
	}
}
class Student extends School{
	void run() {
		System.out.println("I am a FVN School Student");
	}
}

public class FinalClass {

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.run();
	}

}
