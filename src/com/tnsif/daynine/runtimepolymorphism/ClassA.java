package com.tnsif.daynine.runtimepolymorphism;

public class ClassA {
	int n;
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void show()
	{
		System.out.println("N = "+n);
	}
}
