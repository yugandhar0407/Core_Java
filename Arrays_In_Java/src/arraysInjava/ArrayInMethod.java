package arraysInjava;

public class ArrayInMethod {

	static void min(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (min > arr[i])                                // to check the minimum number

				min = arr[i];

		System.out.println(min);

	}

	public static void main(String[] args) {
		int a[] = { 33, 3, 4, 5, 50 };

		min(a);

	}

}
