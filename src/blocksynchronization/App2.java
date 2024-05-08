package blocksynchronization;

class Bracket {

	public void generate() {
		synchronized (this) {

			for (int i = 1; i <= 10; i++) {

				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (i <= 5) {
					System.out.print("[");
				} else {
					System.out.print("]");
				}
			}
		}
		System.out.println();

		for (int j = 0; j <= 10; j++) {
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class App2 {

	public static void main(String[] args) {

		Brackets bracket = new Brackets();
		new Thread(new Runnable() {

			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for (int i = 1; i <= 5; i++) {
					bracket.generate();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Time required for thread 1 was: " + (endTime - startTime));

			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for (int i = 1; i <= 5; i++) {
					bracket.generate();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Time required for thread 2 was: " + (endTime - startTime));

			}
		}).start();

	}

}
