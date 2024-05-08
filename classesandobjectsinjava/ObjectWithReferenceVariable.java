package classesandobjectsinjava;
//Creating Object with reference variable
class Student{
	int rollno;
	String studentname;
}
public class ObjectWithReferenceVariable {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.rollno = 331;
		s.studentname = "Yugandhar Gampala";
		
		System.out.println(s.rollno + " "+ s.studentname);

	}

}
