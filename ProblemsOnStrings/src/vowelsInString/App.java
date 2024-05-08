package vowelsInString;

public class App {

	public static void main(String[] args) {
		
		String s = "Honesty";
		
		String r = " ";
		
		boolean flag = false;
		
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(!(ch == 'a' ||ch== 'e' || ch=='i' || ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U'  )) {
				r = r+ch;
				/*
				 * flag = true; System.out.println(ch);
				 */
				
				
			}
		}
		
		System.out.println(r);
		
		/*
		 * if(flag == false) {
		 * System.out.println("There is no vowels present in a String"); }
		 */

	}

}
