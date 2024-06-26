package lambdaExpressionsMore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Data {
	private String name;

	public Data(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}

}

public class Expression {

	public static void main(String[] args) {

		List<Data> list = new ArrayList<>();

		list.add(new Data("Yugandhar"));
		list.add(new Data("Dharani"));
		list.add(new Data("Siva"));
		list.add(new Data("Mahesh"));

		Collections.sort(list, (Data o1, Data o2) -> {
			return o1.getName().compareTo(o2.getName());
		});
		for (Data data : list) {
			System.out.println(data.getName());
		}

	}

}
