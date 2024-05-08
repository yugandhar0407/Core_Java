package print1stletterinword;

public class App {

	public static void main(String[] args) {
		
		String s = "Hello Hi This is Yugandhar";
		
		String str[] = s.split(" ");
		
		for(int i=0;i<str.length;i++) {
			
			String s1 = str[i];
			
			System.out.println(s1.charAt(0));
			System.out.println(s1.charAt(s1.length()-1));
		}

	}

}
