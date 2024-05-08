package methodoverloadingInJava;

public class DifferentOrder {
	public void OrderParameters(int id, String name) {
		System.out.println("Id: " + id + " name: " + name);
	}

	public void OrderParameters(String name, int id) {
		System.out.println("name: " + name + " id: " + id);
	}

	public static void main(String[] args) {
		DifferentOrder a = new DifferentOrder();
		a.OrderParameters(2, "Yug");
		a.OrderParameters("Laddu", 5);

	}

}
