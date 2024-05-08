package constructorsinjava;

class Mobile{
	int Ram;
	String Brand;
	
	Mobile(){
		//Ram = 8;
		//Brand= "Oppo";
		
	}
	
	void displayinfo() {
		System.out.println(Ram + " "+ Brand);
	}
}

public class DefaultConstructorInJava2 {

	public static void main(String[] args) {
		
		Mobile mb = new Mobile();
		mb.displayinfo();
		mb.displayinfo();
	}

}
