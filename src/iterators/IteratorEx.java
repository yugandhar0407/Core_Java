package iterators;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorEx {

	public static void main(String[] args) {

		List<String> countries = new LinkedList<>();

		countries.add("Inida");
		countries.add("Japan");
		countries.add("China");
		countries.add("England");
		countries.add("America");

		IteratorEx app = new IteratorEx();
		app.PrintList(countries);

		System.out.println("*********");

		countries.sort(null);
		app.PrintList(countries);

		System.out.println("*********");

		Collections.reverse(countries);
		app.PrintList(countries);

	}

	void PrintList(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Countries: " + iterator.next());
		}

	}

}
