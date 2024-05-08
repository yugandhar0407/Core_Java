package scopeinjava;

public class ScopeInJava1 {

	static int i = 100;

	public static void main(String[] args) {

		{
			int i = 5;
			System.out.println(i);
		}
		System.out.println(i);
	}
}
