package threadbyextendingthreadclass;

class MyCounter extends Thread {
	private int threadNo;

	public MyCounter(int threadNo) {
		super();
		this.threadNo = threadNo;
	}

	public void run() {
		Countme();
	}

	public void Countme() {
		for (int i = 1; i <= 9; i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value of i is: " + i + " and the thread mo is: " + threadNo);
		}
	}
}

public class App {

	public static void main(String[] args) throws InterruptedException {

		MyCounter counter1 = new MyCounter(1);
		MyCounter counter2 = new MyCounter(2);

		long startTime = System.currentTimeMillis();
		counter1.start();
		System.out.println("************");
		counter2.start();
		Thread.sleep(4505);
		long endTime = System.currentTimeMillis();
		System.out.println("Total time to complete the process: " + (endTime - startTime));

	}

}
