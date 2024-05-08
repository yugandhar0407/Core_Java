
package compositioninjava;

public class GraphisCard {

	private String brand;
	private int series;
	private String memory;
	
	public GraphisCard() {
		this.brand = "Nvidia";
		this.series = 940;
		this.memory = "2GB";
	}

	public GraphisCard(String brand, int series, String memory) {
		super();
		this.brand = brand;
		this.series = series;
		this.memory = memory;
	}

	public String getBrand() {
		return brand;
	}

	public int getSeries() {
		return series;
	}

	public String getMemory() {
		return memory;
	}

	@Override
	public String toString() {
		return "GraphisCard [brand=" + brand + ", series=" + series + ", memory=" + memory + "]";
	}
	
}
