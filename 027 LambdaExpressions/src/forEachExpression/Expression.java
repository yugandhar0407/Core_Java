package forEachExpression;

import java.util.ArrayList;
import java.util.List;

class Data {
	private String Name;

	public Data(String name) {
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

public class Expression {

	public static void main(String[] args) {

		List<Data> list = new ArrayList<Data>();
		list.add(new Data("Abhi"));
		list.add(new Data("Balu"));
		list.add(new Data("Cat"));
		list.add(new Data("Dog"));

		list.forEach(temp -> {
			System.out.println(temp.getName());
		});

	}

}
