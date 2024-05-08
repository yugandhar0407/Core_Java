package userinput;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("What is your name");

		Scanner sc = new Scanner(System.in);

		String name = sc.next();

		System.out.println("Your name is: " + name);
		
		sc.close();
	}

}
