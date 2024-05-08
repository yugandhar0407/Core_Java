package numberOfWords;

public class Test {

	public static void main(String[] args) {
		
		String S = "welcome string programs by yugandhar ";
		S=S.trim();
		
		int count = 1;
		
		for(int i=0;i<S.length()-1;i++) {
			char ch = S.charAt(i);
			
			if(ch!=' ' && S.charAt(i+1)==' ') {
				count++;
				
			}
		}
		System.out.println(count);
	}

}
