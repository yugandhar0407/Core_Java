package StringInChar;

public class Test {

	public static void main(String[] args) {
		
		String s = "Happy";
		
		char ch = 'p';
		boolean flag = false;
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)==ch) {
				flag = true;
			}
	}
	if(flag ==  true) {
		System.out.println("The Given Character Present");
	}else {
		System.out.println("Not Present");
	}
	}
}
