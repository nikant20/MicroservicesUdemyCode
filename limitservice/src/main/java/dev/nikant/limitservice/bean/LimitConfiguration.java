package dev.nikant.limitservice.bean;


public class LimitConfiguration {
	int maximum;
	int minimum;
	
	public LimitConfiguration() {
	}
	
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	
}
