package interrupt;

public class App {
	static public int balance = 5000;

	public void withdraw(int amount) {
		if (balance <= 0 || balance < amount) {
			try {
				System.out.println("waiting for balance updation");
				wait();
			} catch (InterruptedException e) {
				System.out.println("Original balance: " + balance);
				System.out.println("Withdrawl amount: " + amount);
				balance = balance - amount;
				System.out.println("Withdrawl Successful and the current amount is: " + balance);
			}
		} else {
			System.out.println("We are inside else");
		}
	}

	public void deposit(int amount) {
		System.out.println("We are depositing the amount: " + amount);
		balance = balance + amount;

	}

	public static void main(String[] args) {

		App app = new App();
		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				app.withdraw(1000);

			}
		});
		thread1.start();

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {

				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				app.deposit(2000);
				thread1.interrupt();

			}
		});
		thread2.start();

	}

}
