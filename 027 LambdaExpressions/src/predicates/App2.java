package predicates;

import java.util.function.IntPredicate;

public class App2 {

	public static void main(String[] args) {
		
		IntPredicate lessThan18 = i -> i<18;
		IntPredicate moreThan10 = i -> i>10;
		
		new App2().demo(15,lessThan18, moreThan10);
	}
	
	public void demo(int x, IntPredicate lessThan18, IntPredicate moreThan10) {
		if(lessThan18.and(moreThan10).test(x)) {
			System.out.println("The Input is lessthan 18 and morethan 10");
		}else {
			System.out.println("Invalid Input");
		}
	}

}
