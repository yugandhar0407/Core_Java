package userinput;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		
		String str = sc.nextLine();
		
		System.out.println("You have Entered: "+str);
		
		sc.close();

	}

}
