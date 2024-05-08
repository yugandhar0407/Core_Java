// 1. Creating Elements in Array List and Adding new elements to it.
// By Using ArrayList() constructor and add the elements with add() method with index Number.

package listCollectionsinJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		
		List<String> animals = new ArrayList<>();           //String Elements
		animals.add("Dog");
		animals.add("Elephant");
		animals.add("Lion");
		animals.add("Moneky");
		animals.add("Zebra");
		
		System.out.println(animals);
		
		System.out.println("*******************");
		
		animals.add(1, "Tiger");
		
		System.out.println(animals);
		
		System.out.println();
		System.out.println("//////////////////////");
		System.out.println();
		
		
		List<Integer> numbers = new ArrayList<>();            //Integer Elements
		numbers.add(2);
		numbers.add(4);
		numbers.add(6);
		numbers.add(8);
		numbers.add(10);
		
		System.out.println(numbers);
		
		numbers.add(2, 3);
		
		System.out.println("*******************");
		
		System.out.println(numbers);
		
		
		
	}
}
