package wildcardsingenerics;

import java.util.ArrayList;
import java.util.List;

class Vehicle {
	private int vehicleId;

	public Vehicle(int vehicleId) {
		super();
		this.vehicleId = vehicleId;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + "]";
	}

	void info() {
		System.out.println("Vehicle Id is: " + getVehicleId());
	}
}

class Car extends Vehicle {
	private String carModel;

	public Car(int vehicleId, String carModel) {
		super(vehicleId);
		this.carModel = carModel;
	}

	public String getCarModel() {
		return carModel;
	}

	@Override
	public String toString() {
		return "Car [carModel=" + carModel + "]";
	}

	void info() {
		System.out.println("Car Model is: " + getCarModel());
	}
}

public class WildcardsEx {

	public static void main(String[] args) {

		List<Object> list = new ArrayList<>(); //Normal
		//List<Vehicle> list = new ArrayList<>(); // Upper Bound
		list.add(new Vehicle(10));
		list.add(new Vehicle(11));
		list.add(new Vehicle(12));
		list.add(new Vehicle(13));
		list.add(new Vehicle(14));
		list.add(new Car(16, "A14"));

		display(list);

	}

	/*
	 * public static void display(List <?> list) { for(Object element : list) {
	 * //Normal System.out.println(element); }
	 */

	/*
	 * public static void display(List< ? extends Vehicle> list) { for (Vehicle
	 * element : list) { element.info(); }
	 */

	public static void display(List<? super Car> list) {
		for (Object element : list) {
			System.out.println(element);
		}

	}
}
