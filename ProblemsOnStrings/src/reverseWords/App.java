package reverseWords;

public class App {

	public static void main(String[] args) {
		
		String s = "Java Programming";
		
		String str[] = s.split(" ");
		
		for(int i=str.length-1;i>=0;i--) {
			
			System.out.print(str[i]+" ");
		}
	}

}
