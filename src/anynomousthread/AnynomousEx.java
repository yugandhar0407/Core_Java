package anynomousthread;



public class AnynomousEx {

	public static void main(String[] args) {
		//Thread thread =  
				new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=10;i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(i);
				}
				System.out.println("Thread Was Completed");
				
			}
			
		}).start();
		//thread.start();
	}


}
