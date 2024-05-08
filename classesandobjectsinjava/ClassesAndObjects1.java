package classesandobjectsinjava;


// creating a class outside the main method
class Pen{
	String penbrand;
	int pencost;
}

public class ClassesAndObjects1 {

	public static void main(String[] args) {
		// Creating a object with the help of new keyword
		Pen p = new Pen();
		System.out.println(p.penbrand);
		System.out.println(p.pencost);
		
	}

}
/*
 * Note: The above code prints the null and 0 values beauses we did not assign any values to the properties.
 * 
 */
