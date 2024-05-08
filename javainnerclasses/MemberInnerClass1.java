package javainnerclasses;

class Cricket {
	private int teammembers = 11;

	class inner {
		void msg() {
			System.out.println("Team Members is: " + teammembers);
		}
	}
}

public class MemberInnerClass1 {

	public static void main(String[] args) {

		Cricket obj = new Cricket();
		Cricket.inner in = obj.new inner();

		in.msg();

	}

}
