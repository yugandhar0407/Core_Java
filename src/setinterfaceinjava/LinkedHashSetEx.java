package setinterfaceinjava;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		
		//In this data is added to a LinkedHashSet and iterate through it using for each loop.
		//Insertion oeder is maintained in output.
		
		Set<String> set = new LinkedHashSet<>();
		set.add("Yugandhar");
		set.add("Dharani");
		set.add("Bhavesh");
		set.add("Karthik");
		
		
		for(String name: set) {
			System.out.println(name);
		}
		
	System.out.println("****************");
	
	Set<String> app = new LinkedHashSet<>();
	
	for(int i=0;i<=10;i++) {
		app.add("Yugandhar" + i);
	}
	
	for(String i: app) {
		System.out.println(i);
	}

	}

}
