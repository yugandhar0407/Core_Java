package polymorphsiminjava;

class Phone {
	private String model;

	public Phone(String model) {
		super();
		this.model = model;
	}

	public void features() {
		System.out.println("Feature Phone");
	}

	public String getModel() {
		return model;
	}
}

class Nokia3310 extends Phone {

	public Nokia3310(String model) {
		super(model);
		// TODO Auto-generated constructor stub
	}

	public void features() {
		System.out.println("Snapdragen");
	}
}

public class RuntimePolymorphismEx2 {

	public static void main(String[] args) {

		Phone nokia = new Nokia3310("Nokia3310");
		System.out.println(nokia.getModel());
		nokia.features();
	}

}
