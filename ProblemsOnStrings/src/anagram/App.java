package anagram;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {


		String s = "heart";
		
		String r = "earth";
		
		if(s.length()!=r.length()) {
			
			System.out.println("Not an anagram");
		}
		
		char ch[] = s.toCharArray();
		
		char ch1[] = r.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		
		if(Arrays.equals(ch, ch1)) {
			System.out.println("The given two strings are anagrams");
		}else {
			System.out.println("Not an anagram");
		}
		
		

	}

}
