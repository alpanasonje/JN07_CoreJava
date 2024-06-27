package com.tnsif.daytwenty;


@SmartTV(os = "Android", price=80000)
public class AndroidSeries {
	String model;
	int screenSize;

	public AndroidSeries(String model, int screenSize) {
		this.model = model;
		this.screenSize = screenSize;
	}

	@Override
	public String toString() {
		return "AndroidSeries [model=" + model + ", screenSize=" + screenSize + "]";
	}
	
}
