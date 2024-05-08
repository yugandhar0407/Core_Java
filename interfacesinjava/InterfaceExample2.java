package interfacesinjava;

interface Student{
	public int rollNo();
	public String studentName();
	public String branch();
}
class BTech implements Student{

	@Override
	public int rollNo() {
		
		return 19331;
	}

	@Override
	public String studentName() {
		// TODO Auto-generated method stub
		return "Yugandhar";
	}

	@Override
	public String branch() {
		// TODO Auto-generated method stub
		return "Mechanical Engineering";
	}
	
}
class Degree implements Student{

	@Override
	public int rollNo() {
		// TODO Auto-generated method stub
		return 256;
	}

	@Override
	public String studentName() {
		// TODO Auto-generated method stub
		return "Vinod";
	}

	@Override
	public String branch() {
		
		return "BSC";
	}
	
}
public class InterfaceExample2 {

	public static void main(String[] args) {
		
		Student s = new BTech();
		System.out.println("Student Roll Number: "+s.rollNo());
		System.out.println("Student Name: "+s.studentName());
		System.out.println("Student Branch: "+s.branch());
		
	}

}
