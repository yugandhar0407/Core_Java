package threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SomeThread extends Thread {
	private String name;

	public SomeThread(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Starting thread: " + name);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread ended: " + name);
	}

}

public class App {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		SomeThread thread1 = new SomeThread("Thread1");
		SomeThread thread2 = new SomeThread("Thread2");
		SomeThread thread3 = new SomeThread("Thread3");
		SomeThread thread4 = new SomeThread("Thread4");
		SomeThread thread5 = new SomeThread("Thread5");

		executorService.execute(thread1);
		executorService.execute(thread2);
		executorService.execute(thread3);
		executorService.execute(thread4);
		executorService.execute(thread5);

		executorService.shutdown();

	}

}