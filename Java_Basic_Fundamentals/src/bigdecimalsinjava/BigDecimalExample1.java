
package bigdecimalsinjava;

import java.math.BigDecimal;

public class BigDecimalExample1 {
	public static void main(String[] args) {
		
		BigDecimal bdValue1, bdValue2;
		int integerValue1, integerValue2;

		bdValue1 = new BigDecimal("-36755");
		bdValue2 = new BigDecimal("63745");

		integerValue1 = bdValue1.intValue();
		integerValue2 = bdValue2.intValueExact();
		
		System.out.println("Returned int value is = " + integerValue1);
		System.out.println("Returned Exact Integer Value of " + bdValue2 + " is = " + integerValue2);
	}

}
