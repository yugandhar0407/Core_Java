/* Creating a ArrayList from another collection
 * 
 * Adding the two ArrayList with addAll() method
 * 
 */
package listCollectionsinJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		
		List<Integer> FirstFIveEvenNumbers = new ArrayList<>();
		
		FirstFIveEvenNumbers.add(2);
		FirstFIveEvenNumbers.add(4);
		FirstFIveEvenNumbers.add(6);
		FirstFIveEvenNumbers.add(8);
		FirstFIveEvenNumbers.add(10);
		
		List<Integer> FirstTenEvenNumbers = new ArrayList<Integer>(FirstFIveEvenNumbers);
		
		List<Integer> NextFiveEvenNumbers = new ArrayList<>();
		
		NextFiveEvenNumbers.add(12);
		NextFiveEvenNumbers.add(14);
		NextFiveEvenNumbers.add(16);
		NextFiveEvenNumbers.add(18);
		NextFiveEvenNumbers.add(20);
		
		FirstTenEvenNumbers.addAll(NextFiveEvenNumbers);
		
		System.out.println(FirstTenEvenNumbers);
		
		System.out.println();
		
		System.out.println("************************");
		
		System.out.println();
		
		List<Integer> FirstFivePrimeNumbers = new ArrayList<>();
		
		FirstFivePrimeNumbers.add(2);
		FirstFivePrimeNumbers.add(3);
		FirstFivePrimeNumbers.add(5);
		FirstFivePrimeNumbers.add(7);
		FirstFivePrimeNumbers.add(11);
		
		List<Integer> FirstTenPrimeNumbers = new ArrayList<Integer>(FirstFivePrimeNumbers);
		
		List<Integer> NextFivePrimeNumbers = new ArrayList<>();
		
		NextFivePrimeNumbers.add(13);
		NextFivePrimeNumbers.add(17);
		NextFivePrimeNumbers.add(19);
		NextFivePrimeNumbers.add(23);
		NextFivePrimeNumbers.add(29);
		
		FirstTenPrimeNumbers.addAll(NextFivePrimeNumbers);
		
		System.out.println(FirstTenPrimeNumbers);
		
		System.out.println();
		System.out.println("*****************");
		System.out.println();
		
		
		List<String> NamesList = new ArrayList<>();
		NamesList.add("A");
		NamesList.add("B");
		NamesList.add("C");
		NamesList.add("D");
		NamesList.add("E");
		
		List<String> FirstTenAlphabets = new ArrayList<>(NamesList);
		
		List<String> NameList2 = new ArrayList<>();
		NameList2.add("F");
		NameList2.add("G");
		NameList2.add("H");
		NameList2.add("I");
		NameList2.add("J");
		
		FirstTenAlphabets.addAll(NameList2);
		
		System.out.println(FirstTenAlphabets);
		
		
		
		
		
		
	}

}
