package javainnerclasses;

abstract class Lock {
	public abstract boolean isUnlocked(String keycode);

	public void test() {
		System.out.println("test");
	}
}

class Door {
	private Lock lock = new Lock() {
		@Override
		public boolean isUnlocked(String keycode) {
			if (keycode.equals("qwerty")) {
				return true;
			} else {
				return false;
			}
		}
	};

	public Lock getLock() {
		return lock;
	}
}

public class AnonymousInnerClass2 {

	public static void main(String[] args) {

		Door door = new Door();
		if (door.getLock().isUnlocked(args[0])) {
			System.out.println("Welcome, we are open");
		} else {
			System.out.println("We are closed now, please visit later");
		}
	}

}
