package predicates;

import java.util.function.IntPredicate;

public class App {

	public static void main(String[] args) {
		
		IntPredicate lessThan18 = new IntPredicate() {
			
			@Override
			public boolean test(int value) {
				if(value < 18) {
					return true;
				}else {
					return false;
				}
			}
			
		};
		System.out.println(lessThan18.test(15));
	}
}