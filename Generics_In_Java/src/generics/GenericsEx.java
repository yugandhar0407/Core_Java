package generics;

class GenericClass<T> {
	private T Data;

	public GenericClass(T data) {
		super();
		Data = data;
	}

	public T getData() {
		return Data;
	}

	@Override
	public String toString() {
		return "GenericClass [Data=" + Data + "]";
	}

}

public class GenericsEx {

	public static void main(String[] args) {

		GenericClass<String> genericData = new GenericClass<String>("Some Data");

		String data = genericData.getData();
		System.out.println(data);

	}

}
