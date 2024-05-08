/* Iterate elements in ArrayList

1. With simple For Loop
2. With ForEach Loop
3. With Lambda Expression
4. With Iterator

*/
package listCollectionsinJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList5 {

	public static void main(String[] args) {
		
		List<String> iplTeams = new ArrayList<>();
		iplTeams.add("MumbaiIndians");
		iplTeams.add("ChennaiSuperKings");
		iplTeams.add("RajasthanRoyals");
		iplTeams.add("GujaratTitans");
		iplTeams.add("SunrisersHyderabad");
		iplTeams.add("KolkataKnigtRiders");
		iplTeams.add("PunjabKings");
		iplTeams.add("LucknowSuperGaints");
		iplTeams.add("RoyalChallengersBanglore");
		iplTeams.add("DlehiCaptials");
		
		for(int i=0;i<iplTeams.size();i++) {               //For Loop
	 	System.out.println(iplTeams.get(i));
	    }
		
		System.out.println();
		
		for(String Teams: iplTeams) {                                 //For Each
			System.out.println(Teams);
		}
		
		System.out.println();
		
		iplTeams.forEach(Teams11 -> {
			System.out.println(Teams11);                       //Lambda Expression
		});
		
		System.out.println();
		
		Iterator<String> IPLTeams = iplTeams.iterator();
		while(IPLTeams.hasNext()) {
			String iplTeams1 = IPLTeams.next();                   //Iterator
			System.out.println(iplTeams1);
		}
		
	}

}
