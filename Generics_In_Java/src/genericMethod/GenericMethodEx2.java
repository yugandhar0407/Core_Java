package genericMethod;

import java.util.ArrayList;
import java.util.List;

class Data {
	public <E> void PrintlistData(List<E> list) {
		for (E element : list) {
			System.out.println(element);
		}
	}

	public <E> void PrintArrayData(E[] arrayData) {
		for (E element : arrayData) {
			System.out.println(element);
		}
	}
}

public class GenericMethodEx2 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);

		Data data = new Data();
		data.PrintlistData(list);

		System.out.println("***************");

		List<String> list1 = new ArrayList<>();
		list1.add("Ten");
		list1.add("Twenty");
		list1.add("Thirty");

		Data data1 = new Data();
		data1.PrintlistData(list1);
		
		System.out.println("****************");
		
		String[] StringArray = { "one", "Two", "Three" };
		data.PrintArrayData(StringArray);
		
		System.out.println("***************");
		
		Integer[] IntArray = {1,2,3,4,5};
		data.PrintArrayData(IntArray);
		
		System.out.println("***************");
		
		Double[] doubleArray = {2.2,2.5,2.6};
		data.PrintArrayData(doubleArray );
		
		
	}

	
	
	

}
