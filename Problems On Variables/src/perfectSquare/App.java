package perfectSquare;

public class App {

	/*
	 * static boolean isPerfectSqure(int x) { 
	 * 
	 * if(x >=0) {
	 * 
	 * int sr = (int)Math.sqrt(x);
	 * 
	 * return ((sr*sr)==x); 
	 * }
	 *  return false;
	 *  
	 *   }
	 *  
	 *   
	 *   public static void main(String[] args)
	 * {
	 * 
	 * int x = 625;
	 * 
	 * if(isPerfectSqure(x)){
	 *  System.out.println(x +" is a perfect square");
	 *   }else {
	 * System.out.println(x +"is not a perfect square"); 
	 * }
	 * 
	 * System.out.println("******");
	 */
	public static void main(String[] args) {

		int num = 25;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (i * i == num) {
				count++;

			}
		}
		if (count == 1) {
			System.out.println("perfect");
		} else {
			System.out.println("Not Perfect");
		}

	}

}
