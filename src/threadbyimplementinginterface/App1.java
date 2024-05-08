package threadbyimplementinginterface;

import java.util.Random;

class Counter implements Runnable {
	private int ThreadNo;

	public Counter(int threadNo) {
		super();
		ThreadNo = threadNo;
	}

	@Override
	public void run() {
		Random random = new Random();
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(random.nextInt(500));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The Value of the thread is: " + i + " and the thread No is: " + ThreadNo);
		}
	}

}

public class App1 {

	public static void main(String[] args)throws InterruptedException {
		Thread thread1 = new Thread(new Counter(1));
		//Thread thread2 = new Thread(new Counter(2));

		thread1.start();
	//	thread2.start();

	}

}
