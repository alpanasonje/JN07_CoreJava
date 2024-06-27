package com.tnsif.dayninteen;

//Generic Class
public class GenericClass<T> {
	// Generic Variable
	T myArray[];

	GenericClass() {

	}

	// Generic Constructor
	GenericClass(T myArray[]) {
		this.myArray = myArray;
	}

	public void printArray() {
		for (T n : myArray) {
			System.out.println(n);
		}
	}

}
