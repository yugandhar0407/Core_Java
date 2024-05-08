package constructorsinjava;

class Cricket {
	int players;
	String teamname;
	int playerage;

	Cricket(int p, String t) {
		players = p;
		teamname = t;
	}

	Cricket(int p, String t, int a) {
		players = p;
		teamname = t;
		playerage = a;
	}

	void display() {
		System.out.println(players + " " + teamname + " " + playerage);
	}
}

public class ConstructorOverloadingInJava {

	public static void main(String[] args) {

		Cricket cricket = new Cricket(11, "Inida");
		Cricket cricket1 = new Cricket(11, "Aus", 21);

		cricket.display();
		cricket1.display();

	}

}
