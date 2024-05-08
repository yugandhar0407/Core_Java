package setinterfaceinjava;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {
Set<String> set = new HashSet<>();
		//Data is added to a HashSet and iterate through it using foreach loop.
        // No Insertion order is maintained in output.
		for(int i=30;i>0;i--) { 
			set.add("A" + i);
		}
		for(String i:set) {
			System.out.println(i);
		}
		
		System.out.println("***************");
		
	Set<String> app = new HashSet<>();
	
	for(int i=0;i<=15;i++) {
		app.add("Yugandhar" + i);
	}
	
	for(String i:app) {
		System.out.println(i);
	}

	}

}
