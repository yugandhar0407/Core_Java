package interfacesinjava;

interface Phone{
	public String Processor();
	public String OS();
	public String spaceInGB();
}
class Oneplus5 implements Phone{

	@Override
	public String Processor() {
		
		return "SD835";
	}

	@Override
	public String OS() {
		
		return "Anriod";
	}

	@Override
	public String spaceInGB() {
		
		return "128";
	}
	
}
class Iphone15 implements Phone{

	@Override
	public String Processor() {
		
		return "A11";
	}

	@Override
	public String OS() {
		
		return "IOS";
	}

	@Override
	public String spaceInGB() {
		
		return "64";
	}
	
}
public class InterfaceExample1 {

	public static void main(String[] args) {
	
		Phone phone = new Iphone15();
		System.out.println("Processer: "+phone.Processor());
		System.out.println("OS: "+phone.OS());
		System.out.println("spaceInGB: "+phone.spaceInGB());

	}

}
