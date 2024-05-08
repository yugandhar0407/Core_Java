package threadbyextendingthreadclass;

class Addition extends Thread {
	private int ThreadNo;

	public Addition(int threadNo) {
		super();
		ThreadNo = threadNo;
	}

	public void run() {
		Countme();
	}

	public void Countme() {
		for (int i = 1; i <= 5; i++) {
			try {
				sleep(450);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value of i is: " + i + "and the thread no is: " + ThreadNo);
		}
	}
}

public class App3 {

	public static void main(String[] args) throws InterruptedException {

		Addition add = new Addition(2 + 5);
		Addition add2 = new Addition(6 + 6);

		long startTime = System.currentTimeMillis();
		add.start();
		System.out.println("****");
		add2.start();
		Thread.sleep(4500);
		long endTime = System.currentTimeMillis();
		System.out.println("Total time taken for process: " + (endTime - startTime));

	}

}
