package inheritanceinjava;

class employee{
	float salary = 40000;
}
class Person extends employee{
	int bonus = 10000;
}
public class InheritanceExample {

	public static void main(String[] args) {
		
		Person person = new Person();
		System.out.println("Person salary: "+person.salary);
		System.out.println("Person bonus: "+person.bonus);
		

	}

}
