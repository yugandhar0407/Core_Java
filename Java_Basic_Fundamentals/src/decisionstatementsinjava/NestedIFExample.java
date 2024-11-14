package decisionstatementsinjava;

public class NestedIFExample {

	public static void main(String[] args) {
		
		int age1 = 20;
		int weight = 30;
		if(age1 >=18) {
			if(weight > 45) {
				System.out.println("Person is ready to donate blood");
			}else {
				System.out.println("Person is not eligible to donate blood");
			}
		}

	}

}
