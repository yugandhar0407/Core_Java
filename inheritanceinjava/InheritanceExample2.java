package inheritanceinjava;

 class Vehicles {
	private String engine;
	private int wheels;
	private int seats;
	private int fuelTank;
	private String lights;

	public Vehicles() {
		this.engine = "Petrol";
		this.wheels = 4;
		this.seats = 4;
		this.fuelTank = 35;
		this.lights = "LED";
	}

	public Vehicles(String engine, int wheels, int seats, int fuelTank, String lights) {
		super();
		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fuelTank = fuelTank;
		this.lights = lights;
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

	public int getFuelTank() {
		return fuelTank;
	}

	public String getLights() {
		return lights;
	}
}
 class Bike1 extends Vehicles {
		private String handle;

		public Bike1() {
			super();
			this.handle = "short";
		}

		public Bike1(String handle) {
			super();
			this.handle = handle;
		}

		public String getHandle() {
			return handle;
		}

	}

	public class InheritanceExample2 {

		public static void main(String[] args) {

			Bike1 bike = new Bike1();
			System.out.println("Handle "+bike.getHandle());
			System.out.println("Engine "+bike.getEngine());
			
		}

	}

