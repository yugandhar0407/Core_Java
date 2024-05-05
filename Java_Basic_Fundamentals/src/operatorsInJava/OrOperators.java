package operatorsInJava;

public class OrOperators {

	public static void main(String[] args) {

		String name = "Yugandhar";
		String name1 = "Dharani";
		String name2 = "RamaLakshmi";

		System.out.println(name.length() < name1.length() || name1.length() < name2.length()); // False || True

		System.out.println(name.length() < name1.length() | name1.length() < name2.length()); // False || True

	}

}
