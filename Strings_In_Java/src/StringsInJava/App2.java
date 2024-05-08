package StringsInJava;

public class App2 {

	public static void main(String[] args) {

		String var1 = "10";

		String var2 = "20";

		System.out.println(var1 + var2);

		System.out.println("***************");

		String x = "Study";

		String y = "Easy";

		String z = x.concat(y);

		z = z.replace("Easy", "Hard");

		z = z.replace("Hard", "Easy");

		if (z.equals("StudyEasy")) {
			System.out.println("Text is StudyEasy");
		} else {
			System.out.println("Text is not Study Easy");

		}

		System.out.println("***************");

		String A = "Rama";

		String B = "Lakshmi";

		String C = A.concat(B);

		C = C.replace("Lakshmi", "Krishna");

		if (C.equals("Rama Lakshmi")) {
			System.out.println("Text is RamaLakshmi");
		} else {
			System.out.println("Text is Not RamaLakshmi");
		}

		System.out.println("******************");

		String B1 = "A";
		String B2 = "B";
		String B3 = "C";

		System.out.println(B1.concat(B2).concat(B3));

		System.out.println("***************************");

		String ABC = "XYZ";

		String XYZ = "ABC";

		System.out.println(XYZ);
		System.out.println(ABC);

		System.out.println("************");

		String Great = "Hello! World";

		System.out.println("String: " + Great);

		int length = Great.length();

		System.out.println("Length: " + length);

		System.out.println("*******************");

		String first = "Java Programming";

		String second = "Java Programming";

		String third = "Python Programming";

		boolean result1 = first.equals(second);
		boolean result2 = first.equals(third);

		System.out.println(result1);
		System.out.println(result2);
		
		System.out.println("*****************");
		
		String reverse = "geeks quiz practice code";
	
		System.out.println(reverse);
		
			
		}
		
		

	}

