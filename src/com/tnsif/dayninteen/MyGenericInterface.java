package com.tnsif.dayninteen;

import java.util.Comparator;

public interface MyGenericInterface<T> extends Comparator<T> {
	default T getMax(T myArray[])
	{
		T max;
		max = myArray[0];
		for (int i = 1; i < myArray.length; i++) {
			if (compare(max, myArray[i]) < 0)
				max = myArray[i];
		}
		return max;
	}

	default T getMin(T myArray[]) {
		T min;
		min = myArray[0];
		for (int i = 1; i < myArray.length; i++) {
			if (compare(min, myArray[i]) > 0)
				min = myArray[i];
		}
		return min;
	}

	default void sort(T myArray[]) {
		for (int i = 0; i < myArray.length; i++) {
			for (int j = i + 1; j < myArray.length; j++) {
				if (compare(myArray[i], myArray[j]) > 0) {
					T t;
					t = myArray[i];
					myArray[i] = myArray[j];
					myArray[j] = t;

				}
			}
		}
	}

	default void printArray(T myArray[]) {
		System.out.println("Array Elements are : ");
		for (T n : myArray)
			System.out.println(n);
	}

}
