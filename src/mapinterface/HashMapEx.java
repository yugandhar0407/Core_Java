package mapinterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(100, "Hundered");
		map.put(200, "Two Hundered");
		map.put(300, "Three Hundered");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		// HashMap

		Map<Integer, String> student = new HashMap<>();

		student.put(1, "Rahul");
		student.put(2, "Mia");
		student.put(3, "Joy");
		student.put(4, "Suresh");
		student.put(5, "Yugandhar");
		student.put(6, "Dharani");

		for (Entry<Integer, String> entry : student.entrySet()) {
			//System.out.println(entry);

			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}

	}

}
