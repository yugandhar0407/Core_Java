package comparableinterface;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Names implements Comparable<Names> {

	private String name;

	public Names(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Names [name=" + name + "]";
	}

	@Override
	public int compareTo(Names obj) {
		if (name.length() == obj.name.length()) {
			return 0;

		} else if (name.length() < obj.name.length()) {
			return -1;
		} else {
			return 1;
		}

	}

}

public class ComparableInterfaceEx1 {

	public static void main(String[] args) {

		List<Names> names = new LinkedList<>();
		names.add(new Names("Yugandhar"));
		names.add(new Names("Dharani"));
		names.add(new Names("Bhavesh"));
		names.add(new Names("Karthik"));
		names.add(new Names("Prasanna"));

		ComparableInterfaceEx1 app = new ComparableInterfaceEx1();
		app.PrintList(names);

		System.out.println("************");

		Collections.sort(names);
		app.PrintList(names);

	}

	void PrintList(List<Names> list) {
		ListIterator<Names> iterator = list.listIterator();
		{
			while (iterator.hasNext()) {
				System.out.println("Family: " + iterator.next());
			}
		}
	}
}
