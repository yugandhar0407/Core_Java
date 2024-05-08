package setinterfaceinjava;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// In this,data is added to a treeset and iterate through it using foreach loop.
		// Data is sorted in ascending order internally and displayed.
		
		Set<String> set = new TreeSet<>();
		
		set.add("Apple");
		set.add("Zebra");
		set.add("Boy");
		set.add("Yellow");

		
		for(String name: set) {
			System.out.println(name);
		}
			System.out.println("*****************");
			
			Set<String> app = new TreeSet<>();
			
			for(int i=20;i>0;i--) {
				app.add("Yug" + i);
			}

			for(String i:app) {
				System.out.println(i);
			}
	}

}
