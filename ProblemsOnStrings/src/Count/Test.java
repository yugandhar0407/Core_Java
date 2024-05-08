package Count;

public class Test {

	public static void main(String[] args) {

		String s = "yugandhar2128@gmail.com";

		int charCount = 0;
		
		String Characters = " ";

		int digitCount = 0;
		
		String Digits= " ";

		int specialCount = 0;
		
		String Special = " ";

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {

				charCount++;
				Characters=Characters+ch+ " ";

			} else if (ch >= '1' && ch <= '9') {
				digitCount++;
				Digits=Digits+ch+" ";
			} else {
				specialCount++;
				Special = Special+ch+ " ";
			}

		}
		
		System.out.println("CharactersCount: "+charCount + " Characters are: "+Characters);
		System.out.println("DigitCount: "+digitCount + " Digits are: "+Digits);
		System.out.println("SpecialCount: "+specialCount + "Special Characters: "+Special );
		
		

	}

}
