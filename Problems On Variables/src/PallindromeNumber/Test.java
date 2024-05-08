package PallindromeNumber;

public class Test {

	public static void main(String[] args) {
	
		/*
		 * int num = 121 ;
		 * 
		 * int temp=num;
		 * 
		 * int reverse = 0;
		 * 
		 * while(temp!=0) { 
		 * int ld=temp%10; 
		 * reverse = reverse*10+(ld); temp = temp/10; }
		 * if(num==reverse) { 
		 * System.out.println("Palindrome"); 
		 * }else {
		 * System.out.println("Not Palindrome"); }
		 * 
		 * System.out.println();
		 * 
		 */
          
		
		int number = 141;
        
        int temp1 = number;
        
        int reversenum = 0;
        
        while(temp1 != 0) {
      	  int lastdigit = temp1%10;
      	  reversenum = reversenum*10+(lastdigit);
      	  temp1 = temp1/10;
        }
        
        if(number==reversenum) {
      	  System.out.println(number+" is a Palindrome");
        }else {
      	  System.out.println(number+" is not a Palindrome");
        }
        
	}
	

}
