package threadbyextendingthreadclass;

class Counter extends Thread {
	private String Threadno;

	public Counter(String threadno) {
		super();
		Threadno = threadno;
	}

	public void run() {
		Countme();
	}

	public void Countme() {
		for (int i = 1; i < 8; i++) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value of i is: " + i + "and the thread no is: " + Threadno);
		}
	}
}

public class App2 {

	public static void main(String[] args) throws InterruptedException {

		Counter counter1 = new Counter("Hello My Self Yugandhar ");
		Counter counter2 = new Counter("Hii to EveryOne");
		Counter counter3 = new Counter("Welcome to Threads");
		long startTime = System.currentTimeMillis();
		counter1.start();
		System.out.println("*********");
		counter2.start();
		System.out.println("*********");
		counter3.start();
		Thread.sleep(4505);
		long endTime = System.currentTimeMillis();
		System.out.println("Total time to compelte the process: " + (endTime - startTime));

	}

}
