//ArrayList of User Defined Objects

package listCollectionsinJava;

import java.util.ArrayList;
import java.util.List;

class User {

	int RollNo;
	String Name;

	public User(int rollNo, String name) {
		super();
		RollNo = rollNo;
		Name = name;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}

public class ArrayList7 {

	public static void main(String[] args) {

		List<User> users = new ArrayList<>();

		users.add(new User(101, "Yugandhar"));
		users.add(new User(102, "Jagannath"));
		users.add(new User(103, "Sainath"));

		users.forEach(user -> {
			System.out.println("Roll Number: " + user.getRollNo() + " Name Of the Student: " + user.getName());
		});

	}

}
