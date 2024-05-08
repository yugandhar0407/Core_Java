package constructorsinjava;

class Thar{
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	public Thar(String doors, String engine, String driver, int speed) {
		super();
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}
	
	public String run() {
		if(doors.equals("Closed")&&engine.equals("On")&&driver.equals("Seated")&&speed>0) {
			return "Car is Running";
		}else {
			return "Something went wrong";
		}
	}
}


public class ParameterizedConstructorInJava1 {

	public static void main(String[] args) {
		
		Thar car = new Thar("Closed", "On", "Seated", 50);
		
		System.out.println(car.run());

	}

}