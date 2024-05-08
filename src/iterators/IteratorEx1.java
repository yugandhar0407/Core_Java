package iterators;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class objects {
	private String name;

	public objects(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "objects [name=" + name + "]";
	}

}

public class IteratorEx1 {

	public static void main(String[] args) {

		List<Object> elements = new LinkedList<>();
		elements.add("Yugandhar");
		elements.add("Dharani");
		elements.add(1);
		elements.add(2.03);
		elements.add("@#@");

		IteratorEx1 app = new IteratorEx1();

		app.PrintList(elements);

	}

	void PrintList(List<Object> list) {
		ListIterator<Object> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element: " + iterator.next());
		}

	}

}
