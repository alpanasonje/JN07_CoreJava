package com.tnsif.dayninteen;

public class GenericMethodClass {
	<T> void show(T t) {
		System.out.println("You passed : " + t);
		System.out.println("Type of value passed : " + t.getClass().getName());
	}
}
