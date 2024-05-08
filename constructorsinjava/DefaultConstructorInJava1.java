package constructorsinjava;

class Car{
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	 // default constructor with values
	Car(){
		doors = "closed";
		engine = "on";
		driver = "seated";
		speed = 50;
	}
	
	public String run() {
		if(doors.equals("closed")&&engine.equals("on")&&driver.equals("seated")&&speed>0) {
			return "Car is Running";
		}else {
			return "Something went wrong";
		}
	}
}

public class DefaultConstructorInJava1 {

	public static void main(String[] args) {
		
		Car car = new Car();
		System.out.println(car.run());
		
		

	}

}
