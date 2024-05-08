package classesandobjectsinjava;

public class ClassesAndObjects2 {

	public static void main(String[] args) {
		//Creating a class inside the main method
		class Mobile {
			String brandname;
			String cost;
			String Ram;
			int Storage;
		}
		//creating a object with new keyword
		Mobile mobile = new Mobile();
		System.out.println(mobile.brandname);
		System.out.println(mobile.cost);
		System.out.println(mobile.Ram);
		System.out.println(mobile.Storage);
	}

}
