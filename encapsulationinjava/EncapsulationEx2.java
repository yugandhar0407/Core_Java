package encapsulationinjava;

class Person {
	private String name;
	private int age;
	private String gender;

	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean setAge1(int age) {
		if (age >= 0 && age == 100) {
			this.age = age;

		}
		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

}

public class EncapsulationEx2 {

	public static void main(String[] args) {

		Person person = new Person("Rohit Sharma", 36, "Male");
		System.out.println(person);
		person.setAge(38);
		System.out.println(person);
	}

}
