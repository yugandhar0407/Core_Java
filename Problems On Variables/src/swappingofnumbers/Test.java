package swappingofnumbers;

public class Test {

	public static void main(String[] args) {
		
		int x = 100;
		int y = 200;
		System.out.println(" before: x = "+ x + " and y = "+ y);
		
		System.out.println();
		
		x=x+y;  // 100+200=300
		y=x-y;  // 300-200=100
		x=x-y;  // 300-100=200
		
		System.out.println(" After: x = "+ x + " and y = "+ y);

	System.out.println();
	
	
		int a = 250;
		int b = 350;
		
		System.out.println("Before: a="+a + " and b="+b);
		System.out.println();
		
		a = a+b;  //250+350=600
		b = a-b;  //600-350=250
		a = a-b;  //600-250=350
		
		System.out.println("After: a= "+a+" and b= "+b);
		
		
		System.out.println();
		
		int p = 1200;
		int q = 1400;
		
		System.out.println("Before: p= "+p+" and q= "+q);
		
		System.out.println();
		
		p=p+q;  //1200+1400=2600
		q=p-q;  //2600-1400=1200
		p=p-q;  //2600-1200=1400
		
		System.out.println("After: p= "+p +" and q= "+q);
		
		
		
		
		

	}

}
