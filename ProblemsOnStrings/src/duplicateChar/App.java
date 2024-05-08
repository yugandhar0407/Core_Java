package duplicateChar;

public class App {

	public static void main(String[] args) {
		
		String S = "happyapplepappayya";
		
		boolean flag = false;
		
		for(int i=0;i<S.length();i++) {
			for(int j=i+1;j<S.length();j++) {
				
				if(S.charAt(i)==S.charAt(j)) {
					System.out.print(S.charAt(i)+" ");
					
					flag = true;
				}
			}
		}
		
		if(flag == false) {
			System.out.println("No Duplicateds are found");
		}
	
	

	}

}
