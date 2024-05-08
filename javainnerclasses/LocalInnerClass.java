package javainnerclasses;

public class LocalInnerClass {
	private int data = 30;

	void display() {
		int value = 100;
		class local {
			void msg() {
				System.out.println(data);
				System.out.println(value);
			}
		}
		local i = new local();
		i.msg();
	}

	public static void main(String[] args) {
		LocalInnerClass obj = new LocalInnerClass();
		obj.display();
	}

}
