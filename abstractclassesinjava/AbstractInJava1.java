package abstractclassesinjava;

interface A{
	void a();
	void b();
	void c();
	void d();

}
abstract class B implements A{
	public void c() {
		System.out.println("I am Yugandhar in C");
	}
}
class M extends B{
	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("I am Jagan in A");
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("I am suresh in B");
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("I am sainath in D");
	}
	
}
public class AbstractInJava1 {

	public static void main(String[] args) {
		A obj = new M();
		obj.a();
		obj.b();
		obj.c();
		obj.d();

	}

}
