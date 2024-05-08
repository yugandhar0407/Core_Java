package reverseinmiddleword;

public class App {

	public static void main(String[] args) {
		
		String s = "I Love You";
		
		String middle = s.substring(2,6);
		
		String reverse =" ";
		
		for(int i=middle.length()-1;i>=0;i--) {
			
			reverse = reverse+middle.charAt(i);
			
		}
		System.out.println("Before Reverse Middle Word: "+s);
		System.out.println("After Reverse Middle Word: "+s.substring(0,2)+reverse+s.substring(6));

	}

}
