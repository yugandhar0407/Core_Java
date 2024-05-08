package inheritanceinjava;
class City{
	void kurnool() {
		System.out.println("Konda Reddy Fort");
	}
}
class Village extends City{
	void agraharam() {
		System.out.println("Pakkirappa Swamy Temple");
	}
}
class Town extends City{
	void gntakal() {
		System.out.println("Railway Station");
	}
}
public class HierarchicalInheritanceEx {

	public static void main(String[] args) {
	
		Town town = new Town();
		town.kurnool();
		town.gntakal();
		
		Village village = new Village();
		village.agraharam();
		

	}

}
