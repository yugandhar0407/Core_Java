package comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Data<k, v> {
	private k key;
	private v value;

	public Data(k key, v value) {
		super();
		this.key = key;
		this.value = value;
	}

	public k getKey() {
		return key;
	}

	public v getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}

}


public class ComparatorEx {

	public static void main(String[] args) {
		
		Comparator<Data<Integer, String>> COMPARE_KEY = new Comparator<Data<Integer, String>>() {

			@Override
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				if (obj1.getKey() < obj2.getKey()) {
					return -1;
				} else if (obj1.getKey() > obj2.getKey()) {
					return 1;
				} else
					return 0;
			}

		};

		Set<Data<Integer, String>> set = new TreeSet<>(COMPARE_KEY);

		set.add(new Data<Integer, String>(1, "Chaand"));
		set.add(new Data<Integer, String>(4, "Joy"));
		set.add(new Data<Integer, String>(2, "Rocky"));
		set.add(new Data<Integer, String>(3, "Viplav"));
		set.add(new Data<Integer, String>(1, "Chaand"));

		for (Data<Integer, String> element : set) {
			System.out.println(element);
		}

	}

}
