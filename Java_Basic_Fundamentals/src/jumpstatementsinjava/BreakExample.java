package jumpstatementsinjava;

public class BreakExample {

	public static void main(String[] args) {
		//Break in For Loop
		for(int i=0;i<=10;i++) {
			if(i == 5)
				break;
			System.out.println(i);
		}
		System.out.println("*************");
		///Break In While Loop
		int i=0;
		while(i<=10) {
			if(i == 5) {
				i++;
				break;
				
			}
			System.out.println(i);
			i++;
		}
		System.out.println("*************");
		
		//Break in Do While Loop
		int j=0;
		do {
			if(j==5) {
				j++;
				break;
			}
			System.out.println(j);
			j++;
		}while(j<=20);


		System.out.println();
		//Inner Loop
		for(int a=1;i<=4;i++) {
			for(int b = 1;b<=4;b++) {
				if(a==3 && b==3) {
					break;
				}
				System.out.print(i+" "+j);
			}
		}
		
		
	}

}
