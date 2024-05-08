package swappingofnumbers;

public class Test1 {

	public static void main(String[] args) {
		
		int a = 100;
		
		int b = 200;
		
		System.out.println("Before A is "+ a +" and B is "+b);
		
	    a = a+b;  // 100+200 = 300
		b = a-b;  // 300-200 = 100
		a = a-b;  // 300-100 = 200
		
		System.out.println("After A is "+a +" and B is "+b);
	}

}
