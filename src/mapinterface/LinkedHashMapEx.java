package mapinterface;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		hm.put(100, "Yugandhar");
		hm.put(101, "Rakesh");
		hm.put(102, "Ramesh");
		
	/*	for(Map.Entry m: hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		*/
		
		System.out.println("Keys: "+hm.keySet());                                 
		System.out.println("Value: "+hm.values());
		System.out.println("Key-Value pairs: "+hm.entrySet());

	}

}
