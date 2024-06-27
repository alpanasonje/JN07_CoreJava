//Program to define user defined functional interface, similar to BiFunction<Integer, Integer, Integer> 
package com.tnsif.dayeighteen.userdefinedfunctionalinterfaces;

@FunctionalInterface
public interface ArithmeticOperations {
	int perform(int a, int b );
}
