// int data type is a 32 bit signed two compliment integer;
// It is the default data type used when there is no problem about memory
// Its value ranges between -2147.... to 2147.....
// default value - 0
// size - 4bytes-32bit




package datatypesinjava;

public class IntDataTypes {

	public static void main(String[] args) {
		
		int a = 123;
		int b = 321;
		int c = 231;
		int d = 312;
		
		int e = a*b*c*d;
		
		int f = a+b+c+d;
		
		int g = a-b-c-d;
		
		int h = a/b/c/d;
		
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		
		System.out.println(e+f);
		
		System.out.println(g*h);
		

	}

}
