package enumsinjava;

public enum EnumExample1 {

	Winter, Spring, Summer, Fall;

	public static void main(String[] args) {

		for (EnumExample1 s : EnumExample1.values()) {
			System.out.println(s);
		}
		System.out.println("Value of Winter is: " + EnumExample1.valueOf("Winter"));
		System.out.println("Index of Winter is: " + EnumExample1.valueOf("Winter").ordinal());
		System.out.println("Index of Fall is: " + EnumExample1.valueOf("Fall").ordinal());
	}
}
