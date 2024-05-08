package inheritanceinjava;

class Vehicle {

	public String engine;
	public int wheels;
	public int seats;
	public int fuelTank;
	public String lights;
}

class Bike extends Vehicle {
	public String handle;
}

class Car extends Vehicle {
	public String steering;
	public String musicSystem;
	public String airConditioner;
	public String fridge;
	public String entertainmentSystem;
}

class Truck extends Vehicle {
	public String steering;
	public String musicSystem;
	public String airConditioner;
	public String container;
}

public class InheritanceExample1 {

	public static void main(String[] args) {

		Bike bike = new Bike();
		bike.handle = "Short Handle";
		bike.engine = "Petrol Engine";
		bike.fuelTank = 20;

		System.out.println(bike.engine);
		System.out.println(bike.fuelTank);
		System.out.println(bike.handle);
	}

}
