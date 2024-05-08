package aggregationinjava;

class Address {
	String city;
	String country;

	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}
}

class Emp {
	int id;
	String name;
	Address address;

	public Emp(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.country);
	}
}

public class AggregationEx1 {

	public static void main(String[] args) {

		Address address1 = new Address("AP", "India");
		Address address2 = new Address("TS", "India");

		Emp e = new Emp(111, "Yugandhar", address1);
		Emp e1 = new Emp(112, "Rakesh", address2);

		e.display();
		e1.display();

	}

}
