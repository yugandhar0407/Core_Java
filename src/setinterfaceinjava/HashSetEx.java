package setinterfaceinjava;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();

		set.add("Yugandhar");
		set.add("Dharani");
		set.add("Bhavesh");
		set.add("Karthik");
		set.add("Prasanna");
		set.add("yugandhar");

		for (String name : set) {
			System.out.println(name);
		}

		System.out.println("***************");

		System.out.println(set.remove("Dharani"));

		System.out.println("****************");

		for (String name : set) {
			System.out.println(name);
		}
		System.out.println("*****************");
		set.add("Abhi");

		for (String name : set) {
			System.out.println(name);
		}

	}

}
