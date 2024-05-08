package compositioninjava;

public class Processor {
	
	private String brand;
	private String series;
	private int generation;
	private int cores;
	private int threads;
	private String cacheMemory;
	private String frequency;
	private String minfrequency;
	private String maxfrequency;
	
	public Processor() {
		this.brand = "intel";
		this.series = "is 7200u";
		this.generation = 7;
		this.cores = 2;
		this.threads = 4;
		this.cacheMemory = "3MB";
		this.frequency = "2.5GHZ";
		this.minfrequency = "2.5GHZ";
		this.maxfrequency = "3.1GHZ";
	}

	public Processor(String brand, String series, int generation, int cores, int threads, String cacheMemory,
			String frequency, String minfrequency, String maxfrequency) {
		super();
		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.cores = cores;
		this.threads = threads;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		this.minfrequency = minfrequency;
		this.maxfrequency = maxfrequency;
	}

	public String getBrand() {
		return brand;
	}

	public String getSeries() {
		return series;
	}

	public int getGeneration() {
		return generation;
	}

	public int getCores() {
		return cores;
	}

	public int getThreads() {
		return threads;
	}

	public String getCacheMemory() {
		return cacheMemory;
	}

	public String getFrequency() {
		return frequency;
	}

	public String getMinfrequency() {
		return minfrequency;
	}

	public String getMaxfrequency() {
		return maxfrequency;
	}

	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", generation=" + generation + ", cores=" + cores
				+ ", threads=" + threads + ", cacheMemory=" + cacheMemory + ", frequency=" + frequency
				+ ", minfrequency=" + minfrequency + ", maxfrequency=" + maxfrequency + "]";
	}

}
