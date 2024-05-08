package compositioninjava;

public class Computer {

	public static void main(String[] args) {
		
		Laptop lappy = new Laptop();
		System.out.println(lappy.getGraphiscard().getMemory());
		
		Processor processor = new Processor("intel", "7200u", 7, 4, 4, "6mB", "2.5GHZ", "2.5GHZ", "3.1GHZ");
		GraphisCard graphis = new GraphisCard("Nvdia", 1050, "4GB");
		
		Laptop gamingLaptop = new Laptop(17f, processor, "DDR4", "2TB", graphis, null, "backlit");
		
		System.out.println(gamingLaptop);
		System.out.println("Gaming Mode On");
		System.out.println("current frequency: "+gamingLaptop.getProcessor().getFrequency());

	}

}
