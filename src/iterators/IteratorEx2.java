package iterators;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Data<T> {
	private T MyVariable;

	public Data(T myVariable) {
		super();
		MyVariable = myVariable;
	}

	public T getMyVariable() {
		return MyVariable;
	}

	@Override
	public String toString() {
		return "Data [MyVariable=" + MyVariable + "]";
	}

}

public class IteratorEx2 {

	public static void main(String[] args) {

		List<Data<String>> elements = new LinkedList<>();
		elements.add(new Data<String>("Hello Yugandhar! How Are You?"));

		IteratorEx2 test = new IteratorEx2();
		test.PrintList(elements);

	}

	void PrintList(List<Data<String>> list) {
		ListIterator<Data<String>> iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println("Element: " + iterator.next().getMyVariable());
		}

	}

}
