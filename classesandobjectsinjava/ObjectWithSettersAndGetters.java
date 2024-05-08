package classesandobjectsinjava;
//Objects Using Getters and Setters
 class Car {

	private String doors;
	private String engine;
	private String driver;
	private int speed;

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String run() {
		if(doors.equals("Closed")&& engine.equals("On")&&driver.equals("Seated")&&speed>0) {
			return "Car is ready to ride";
		}else {
			return "Something went wrong";
		}
	}

}
public class ObjectWithSettersAndGetters {

	

	public static void main(String[] args) {
		
		Car car = new Car();
		car.setDoors("Closed");
		car.setEngine("On");
		car.setDriver("Seated");
		car.setSpeed(60);
		

		/*
		 * System.out.println(car.getDoors()); System.out.println(car.getEngine());
		 * System.out.println(car.getDriver()); System.out.println(car.getSpeed());
		 * 
		 * System.out.println();
		 * 
		 * System.out.println("The car is ready to ride");
		 */

		System.out.println(car.run());
	}

}
