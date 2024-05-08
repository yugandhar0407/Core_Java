package StringsInJava;

public class Hello {

	public static void main(String[] args) {
	
		String A1 = "StudyEasy";
		
		String A2 = "Orgnization";
		
		String S1 = "Chaand Sheikh";
		
		String S2 = "Full Stack Java Developer";
		
		System.out.println(A1+" "+A2+" "+S1+" "+S2);
		
		System.out.println(S2.concat(S1));
		
		System.out.println(A1.charAt(5));
		
		System.out.println(A1.compareTo(S2));
		
		System.out.println(A1.codePointCount(1, 8));
		
		System.out.println(A1.toUpperCase());
		
		System.out.println(A1.toLowerCase());
		
		System.out.println(S1.contains(S2));
		

	}

}
