// Removing Elements in ArrayList

package listCollectionsinJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayList4 {

	public static void main(String[] args) {
		
		List<String> ProgrammingLanguages = new ArrayList<>();
		ProgrammingLanguages.add("C");
		ProgrammingLanguages.add("C++");
		ProgrammingLanguages.add("C#");
		ProgrammingLanguages.add("Python");
		ProgrammingLanguages.add("Java");
		ProgrammingLanguages.add("HTML");
		ProgrammingLanguages.add("CSS");
		ProgrammingLanguages.add("JavaScript");
		
		System.out.println(ProgrammingLanguages);
		System.out.println();
		
	/*	ProgrammingLanguages.remove(4);
		System.out.println(ProgrammingLanguages);
		System.out.println();
		
		ProgrammingLanguages.removeAll(ProgrammingLanguages);
		System.out.println(ProgrammingLanguages);
		
		System.out.println();
	*/
		boolean isRemoved = ProgrammingLanguages.remove("HTML");
		System.out.println("After Removing HTML: "+ ProgrammingLanguages);

	}

}
