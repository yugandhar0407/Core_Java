package listinterfaceinjava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		List<String> app = new ArrayList<String>();

		app.add("Honesty is the best policy");
		app.add("I am a Boy");
		app.add("Happy to be here");

		new ArrayListEx2().PrintList(app);

		System.out.println("**************");

		List<Integer> app2 = new ArrayList<Integer>();

		app2.add(2);
		app2.add(2 + 2);
		app2.add(2 + 2 + 2);
		app2.add(2 + 2 + 2 + 2);
		app2.add(2 + 2 + 2 + 2 + 2);

		new ArrayListEx2().PrintList2(app2);

	}

	void PrintList(List<String> list) {
		for (String Data : list) {
			System.out.println(Data);
		}
	}

	void PrintList2(List<Integer> list) {
		for (Integer Data2 : list) {
			System.out.println(Data2);
		}

	}

}
