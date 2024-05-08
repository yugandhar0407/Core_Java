package classesandobjectsinjava;
//Object By Method
class StudentS {

	int rollno;
	String collegename;
	String studentname;

	void insertrecord(int r, String c, String s) {
		rollno = r;
		collegename = c;
		studentname = s;
	}

	void displayinfo() {
		System.out.println(rollno + " " + collegename + " " + studentname);
	}

}

public class ObjectWithMethod {

	public static void main(String[] args) {

		StudentS s1 = new StudentS();
		StudentS s2 = new StudentS();
		StudentS s3 = new StudentS();

		s1.insertrecord(319, "AITS,Tpt", "Ramesh");
		s2.insertrecord(331, "AITS.Tpt", "Yugandhar");
		s3.insertrecord(318, "AITS,Tpt", "Rakesh");

		s1.displayinfo();
		s2.displayinfo();
		s3.displayinfo();

	}

}
