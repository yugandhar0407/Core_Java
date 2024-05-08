package compositioninjava;



public class Laptop {
	
	private float screen;
	private Processor processor;
	private String ram;
	private String hardDrive;
	private GraphisCard graphiscard;
	private String opticalDrive;
	private String keyboard;
	
	public Laptop() {
		
		this.screen = 15.6f;
		this.processor = new Processor();
		this.ram = "DDR4";
		this.hardDrive = "2TB";
		this.graphiscard = new GraphisCard();
		this.opticalDrive = "MLT Layer";
		this.keyboard = "backlit";
		
	}

	public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphisCard graphiscard,
			String opticalDrive, String keyboard) {
		super();
		this.screen = screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphiscard = graphiscard;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}

	public float getScreen() {
		return screen;
	}

	public Processor getProcessor() {
		return processor;
	}

	public String getRam() {
		return ram;
	}

	public String getHardDrive() {
		return hardDrive;
	}

	public GraphisCard getGraphiscard() {
		return graphiscard;
	}

	public String getOpticalDrive() {
		return opticalDrive;
	}

	public String getKeyboard() {
		return keyboard;
	}

	@Override
	public String toString() {
		return "Laptop [screen=" + screen + ", ram=" + ram + ", hardDrive=" + hardDrive + ", opticalDrive="
				+ opticalDrive + ", keyboard=" + keyboard + "]";
	}
	
	
	

}
