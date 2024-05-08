package lambdaExpressionsMore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Data1 {
	private String Name;

	public Data1(String name) {
		super();
		Name = name;
	}

	public String getName() {
		return Name;
	}

	@Override
	public String toString() {
		return "Data [Name=" + Name + "]";
	}

}

public class SortedByLength {

	public static void main(String[] args) {

		List<Data1> list = new ArrayList<>();
		list.add(new Data1("Yugandhar"));
		list.add(new Data1("Dharani"));
		list.add(new Data1("Ramalakshmi"));
		list.add(new Data1("Govindarajulu"));

		Collections.sort(list, (Data1 o1, Data1 o2) -> {
			if (o1.getName().length() < o2.getName().length()) {
				return -1;
			} else if (o1.getName().length() > o2.getName().length()) {
				return 1;
			} else {
				return 0;
			}

		});
		for (Data1 data : list) {
			System.out.println(data.getName());
		}

	}

}
