package comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Data1 <k, v> {
	private k key;
	private v value;

	public Data1(k key, v value) {
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

public class ComparatorEx1 {

	public static void main(String[] args) {
		
		Comparator<Data<Integer, String>> COMPARE_NAME_LENGTH = new Comparator<Data<Integer, String>>() {

			@Override
			public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
				if (obj1.getValue().length() < obj2.getValue().length()) {
					return -1;
				} else if (obj1.getValue().length() > obj2.getValue().length()) {
					return 1;
				} else
					return 0;
			}
		};

		Set<Data<Integer, String>> set = new TreeSet<>(COMPARE_NAME_LENGTH);
		set.add(new Data<Integer, String>(1, "Apple"));
		set.add(new Data<Integer, String>(4, "Joy"));
		set.add(new Data<Integer, String>(2, "Rocky"));
		set.add(new Data<Integer, String>(3, "Viplav"));
		set.add(new Data<Integer, String>(1, "dhee"));
		set.add(new Data<Integer, String>(5, "Chaand"));
		set.add(new Data<Integer, String>(6, "Joy"));
		set.add(new Data<Integer, String>(8, "jay"));
		set.add(new Data<Integer, String>(9, "suresh"));
		set.add(new Data<Integer, String>(1, "Abhi"));
		for (Data<Integer, String> element : set) {
			System.out.println(element);
		}

	}

}
