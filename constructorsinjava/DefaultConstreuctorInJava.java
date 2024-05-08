package constructorsinjava;
class Student{
	int id;
	String name;
	
	Student() {              // This is the default constructor 

	}
	
	void display() {
		System.out.println(id+ " " +name);
	}
}

public class DefaultConstreuctorInJava {

	public static void main(String[] args) {
		
		Student s = new Student();
		Student s1 = new Student();
		
		s.display();
		s1.display();
		
		
	}

}
