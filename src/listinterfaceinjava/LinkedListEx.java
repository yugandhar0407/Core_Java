package listinterfaceinjava;

import java.util.LinkedList;


public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<String> Team = new LinkedList<>();

		Team.add("India");
		Team.add("Pakistan");
		Team.add("England");
		Team.add("Austraila");
		Team.add("Bangladesh");
		Team.add("Netherlands");
		Team.add("Srilanka");
		Team.add("Afganistan");
		Team.add("NewZeland");
		Team.add("SouthAfrica");
		Team.add("Bragil");

		new LinkedListEx().PrintList(Team);

		System.out.println("************");

		Team.add("Westindies");

		new LinkedListEx().PrintList(Team);

		System.out.println("*************");

		Team.addFirst("WorldCup Teams");

		new LinkedListEx().PrintList(Team);

		System.out.println("**************");

		Team.remove(6);

		new LinkedListEx().PrintList(Team);

		System.out.println("***********");

	}

	void PrintList(LinkedList<String> list) {
		for (String Data : list) {
			System.out.println(Data);
		}

	}

}
