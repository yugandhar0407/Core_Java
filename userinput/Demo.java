package userinput;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		
		int a = sc.nextInt();
		
		System.out.println("Enter the Word");
		
		String b = sc.next();
		
		System.out.println("The Number is: " +a + " The Word is: "+b);
		
		sc.close();
		
		
		
			
		}

	}

