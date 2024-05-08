// Sorting with Collections.sort method


package listCollectionsinJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList8 {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(19);
		numbers.add(43);
		numbers.add(98);
		numbers.add(4);
		numbers.add(32);
		numbers.add(97);
		
		System.out.println("Before Sorting the numbers: "+numbers);
		
		System.out.println();
		
		Collections.sort(numbers);

		System.out.println("After Sorting the numbers: "+numbers);
		

	}

}
