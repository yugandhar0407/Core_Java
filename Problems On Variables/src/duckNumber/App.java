package duckNumber;

public class App {

	public static void main(String[] args) {

		int n = 102;
		int temp = n;
		int count = 0;
		int zerocount = 0;
		int lastdigit = 0;
		while (temp != 0) {
			lastdigit = temp % 10;
			if (lastdigit == 0) {
				zerocount++;
			}
			temp /= 10;
			count++;

		}
		temp = n;
		while (count > 1) {
			temp /= 10;
			count--;
		}
		if (temp != 0 && zerocount >= 1) {
			System.out.println("duck Number");
		} else {
			System.out.println("Not a Duck Number");
		}
	}

}
