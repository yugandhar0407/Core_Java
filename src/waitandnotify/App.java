package waitandnotify;

public class App {
	static public int balance = 0;

	public void withdraw(int amount) {
		synchronized (this) {

			if (balance <= 0) {

				try {
					System.out.println("Waiting for balance updation");
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		balance = balance - amount;
		System.out.println("Withdrawl successful and the current balance is: " + balance);
		
	}

	public void deposit(int amount) {
		System.out.println("We are depositing the amount");
		balance = balance + amount;
		synchronized (this) {
			notifyAll();
		}
	}

	public static void main(String[] args) {
		App app = new App();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				app.withdraw(3000);

			}
		});
		thread1.setName("Thread1");
		thread1.start();

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				app.deposit(10000);
			}
		});
		thread2.setName("Thread2");
		thread2.start();
	}

}
