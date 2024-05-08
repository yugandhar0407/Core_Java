/*Accessing the Elements in ArraayList.
Check the List is Empty or not with isEmpty() method.
Update the Element in the list by using the set() method.
*/

package listCollectionsinJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayList3 {

	public static void main(String[] args) {

		List<String> topCompines = new ArrayList<>();
		System.out.println("Is the TopCompines list is Empty: " + topCompines.isEmpty());

		topCompines.add("Google");
		topCompines.add("Amazon");
		topCompines.add("Microsoft");
		topCompines.add("Infosys");
		topCompines.add("Wipro");

		System.out.println("************");

		System.out.println("Here the " + topCompines.size() + " Top Compines List in the World");
		System.out.println(topCompines);

		System.out.println("*****************");

		System.out.println("The First Top Company in the World is: " + topCompines.get(0));
		System.out.println("The Second Top Company in the World is: " + topCompines.get(1));
		System.out.println("The Least Company in the World is: " + topCompines.get(topCompines.size() - 1));

		System.out.println("****************");

		topCompines.set(4, "FaceBook");
		System.out.println

		("Updated Top Compines: " + topCompines);

	}

}
