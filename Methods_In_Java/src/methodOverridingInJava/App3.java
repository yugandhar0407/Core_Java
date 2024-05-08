package methodOverridingInJava;

class Mobile{
	public void brand() {
		System.out.println("MI");
	}
}
class Poco extends Mobile {
	public void brand() {
		System.out.println("Poco");
	}
}

public class App3 {

	public static void main(String[] args) {
		Mobile obj = new Poco();
		obj.brand();
		
	}

}
