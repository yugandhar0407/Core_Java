package javainnerclasses;

public class LocalInnerClass1 {  // Local Inner Class with Local Variable
	
	private int data = 30;
	void display() {
		int value = 50;
		class local{
			void msg() {
				System.out.println(value); 
				System.out.println(data);
			}
		}
		local i = new local();
		i.msg();
	}
	

	public static void main(String[] args) {
	
		LocalInnerClass1 obj = new LocalInnerClass1();
		obj.display();
		
		
		

	}

}
