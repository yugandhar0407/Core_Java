
// Sort an ArrayList Using Custom Comparator


package listCollectionsinJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private String Name;
	private int Age;

	public Person(String name, int age) {
		super();
		Name = name;
		Age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Age=" + Age + "]";
	}

}

public class ArrayList10 {

	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		people.add(new Person("Yugandhar", 24));
		people.add(new Person("Siva", 23));
		people.add(new Person("Jagan", 24));
		people.add(new Person("Sai", 23));
		people.add(new Person("Suresh", 22));
		
		System.out.println("Persons List: "+people);
		
	/*	people.sort(( person1, person2) ->{
			return person1.getAge() - person2.getAge();           // Using Lambda 
		}) ;
		
		System.out.println("After Sorting: "+people);
		*/
		people.sort(Comparator.comparingInt(Person::getAge));            //USing Comparator
		
		System.out.println("After Sorting: "+people);
		
		Collections.sort(people, Comparator.comparing(Person::getName));
		System.out.println("Sorting by Name: "+people);
	}

}
