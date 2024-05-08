package genericMethod;

public class GenericMethodEx1 {
	public static <E> void printArray(E[] elements) {
		for (E element : elements) {
			System.out.print(element);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Character[] charArray = { 'J', 'A', 'V', 'A' };

		System.out.println("Printing Integer Array");
		printArray(intArray);

		System.out.println("**************");

		System.out.println("Printing Character Array");
		printArray(charArray);

	}

}
