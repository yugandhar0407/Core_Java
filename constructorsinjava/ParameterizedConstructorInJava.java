package constructorsinjava;

class StudentInFo {

	int id;
	String name;
	String collegename;

	public StudentInFo(int id, String name, String collegename) {
		super();
		this.id = id;
		this.name = name;
		this.collegename = collegename;
	}

	void displayinfo() {

		System.out.println(id + " " + name + " " + collegename);

	}

}

public class ParameterizedConstructorInJava {

	public static void main(String[] args) {

		StudentInFo student = new StudentInFo(101, "Yugandhar", "Aits,Tpt");
		StudentInFo student1 = new StudentInFo(102, "SivaKumar", "Aits,Tpt");

		student.displayinfo();
		student1.displayinfo();

	}

}
