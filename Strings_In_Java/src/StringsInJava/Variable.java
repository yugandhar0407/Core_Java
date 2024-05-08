package StringsInJava;

public class Variable {

	public static void main(String[] args) {

		String string = " kids are so quite ";
		
		int count=0;
		
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i) != ' ')
				count++;
		}
		
		System.out.println("Characters in Sentence: "+count);

	}

}
