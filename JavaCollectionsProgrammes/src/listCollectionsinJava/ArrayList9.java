//Sorting With Sort method
//Lambda Expression
//Natural order method



package listCollectionsinJava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayList9 {

	public static void main(String[] args) {
		
		List<String> movies = new ArrayList<>();
		movies.add("Salaar");
		movies.add("Devera");
		movies.add("RRR");
		movies.add("Pushpa");
		
		
		System.out.println("Movies List: "+movies);
		
		movies.sort(new Comparator<String>() {

			@Override
			public int compare(String Name1, String Name2 ) {
				
				return Name1.compareTo(Name2);
			}
		});
		
		System.out.println("Sorted Names: "+movies);
		
		movies.sort((name1, name2) -> name1.compareTo(name2));
		
		System.out.println("Sorted with Lambda Expression: "+movies);
		
		
		movies.sort(Comparator.naturalOrder());
		System.out.println("Natural order: "+movies);

	}

}
