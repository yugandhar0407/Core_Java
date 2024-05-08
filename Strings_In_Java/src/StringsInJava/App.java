package StringsInJava;

public class App {

	public static void main(String[] args) {
		
		 String s1 = "Java";
		 
		 char ch[] = {'y','u','g'};
		 
		 String s3 = new String("example");
		 
		 String s2 = new String(ch);
		 
		 
		 System.out.println(s1);
		 System.out.println(s2);
		 System.out.println(s3);
		 
		 System.out.println(s1.indexOf("v"));
		 System.out.println(s1.charAt(2));
		 System.out.println(s2.concat(s3));
		 System.out.println(s3.endsWith(s1));
		 System.out.println(s1.trim().charAt(2));

	}

}
