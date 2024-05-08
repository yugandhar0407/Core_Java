package inheritanceinjava;

class Vehicles1 {
	
	private String engine;
	private int wheels;
	private int seats;

	public Vehicles1() {

	}

	public Vehicles1(String engine, int wheels, int seats) {
		super();
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
	}

	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public int getSeats() {
		return seats;
	}

}

class Car1 extends Vehicles1 {
	private String steering;
	private String musicSystem;

	public Car1() {
		this.steering = "Power Steering";
	}

	public Car1(String steering, String musicSystem, String engine, int wheels, int seats) {
		super();
		this.steering = steering;
		this.musicSystem = musicSystem;
	}

	public String getSteering() {
		return steering;
	}

	public String getMusicSystem() {
		return musicSystem;
	}

	public void run() {
		System.out.println("Running Car");
	}

	@Override
	public String toString() {
		return "Car1 [steering=" + steering + ", musicSystem=" + musicSystem + ", getEngine()=" + getEngine()
				+ ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats() + "]";
	}

	
}
public class InheritanceExample3 {

	public static void main(String[] args) {
		
		Car1 car = new Car1("Power Steering", "On", "Petrol", 4, 4);
		System.out.println(car);
		car.run();
		
	}

}
