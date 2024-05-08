package synchroniztion;

public class App {
	
	public static int counter = 1000;

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0;i<=1000;i++) {
					App.counter++;
				}
				System.out.println("The loops in thread 1 is over");
				
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<=1000;i++) {
					App.counter++;
				}
				System.out.println("The loops in thread 2 is over");
			}
		});
		thread1.start();
		thread2.start();
		Thread.sleep(2000);
		System.out.println("The value of counter is: "+App.counter);

	}

}
