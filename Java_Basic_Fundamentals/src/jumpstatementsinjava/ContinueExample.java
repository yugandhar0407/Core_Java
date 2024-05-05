package jumpstatementsinjava;

public class ContinueExample {

	public static void main(String[] args) {

		//Continue in For Loop
		for (int i = 0; i <= 10; i++) {
			if (i == 5)
				continue;
			System.out.println(i);
		}
		System.out.println("****************");
		//Continue In While Loop
		int j = 0;
		while (j <= 10) {
			if (j == 5) {
				j++;
				continue;
			}
			System.out.println(j);
			j++;
		}
		System.out.println("****************");
		//Continue in DO While Loop
		int a = 0;
		do {
			if (a == 5) {
				a++;
				continue;
			}
			System.out.println(a);
			a++;

		} while (a <= 10);
	}

}
