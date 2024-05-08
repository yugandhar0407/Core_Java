package listinterfaceinjava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
	
		List<Integer> demo = new ArrayList<>();

		demo.add(1);
		demo.add(2);
		demo.add(3);
		demo.add(4);
		demo.add(5);

		System.out.println(demo);
		System.out.println("***************");

		List<String> demo2 = new ArrayList<String>();

		demo2.add("A");
		demo2.add("B");
		demo2.add("C");
		demo2.add("D");
		demo2.add("E");

		System.out.println("alaphabets: " + demo2);

	}

}
