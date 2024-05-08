//Searching Elements in ArrayList




package listCollectionsinJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayList6 {

	public static void main(String[] args) {
		
		List<String> friends =  new ArrayList<>();
		
		friends.add("Jagannath");
		friends.add("Sainath");
		friends.add("Suresh");
		friends.add("Sudharshan");
		friends.add("Pavan");
		friends.add("Pavan Kumar");
		
		System.out.println("Does the List contain \"Suresh\" ? : "+friends.contains("Suresh"));
		
		System.out.println("The index of \"Pavan\" ?: "+ friends.indexOf("Pavan"));
		
		System.out.println("The Index of \"Laddu\" ?: "+ friends.indexOf("Laddu"));
		
		
		

	}

}
