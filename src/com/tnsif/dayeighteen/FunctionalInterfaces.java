package com.tnsif.dayeighteen;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterfaces {
	
	public static void main(String[] args) {
		//Predicate Functional interface has test() method which accepts any Object and return boolean value 
		
		//accept Integer and return true if number is positive otherwise false
		Predicate<Integer> predicateObj=(n)->n>0;
		
		//acquire a stream of Integers
		Stream<Integer> numStream=Stream.of(1, 2, 3,4, -4, -3, 6);
		//filter() accepts predicate object - filters only positive values
		numStream=numStream.filter(predicateObj);
		numStream.forEach(System.out::println);//for(Integer n: numStream) System.out.println(n);
		
		//Consumer Functional interface has accept() method which accepts value and does not return anything
		Consumer<String> consumerObj=(s) ->System.out.println(s.toUpperCase());
		Stream<String> cityStream =Stream.of("Nashik", "Pune", "Mumbai", "Delhi", "Ahmednagar", "chennai", "Bangalore");
		
		//forEach - perform action on each elements of stream
		cityStream.forEach(consumerObj);
		
		//Supplier Functional interface has get() method which returns an object but does not accept any value
		Supplier<Integer> supplierObj=()->{ return (10);};
		System.out.println(supplierObj.get());
		
		Supplier<String> suppObj=()->"Hello Students!!";
		System.out.println(suppObj.get());
		
		
		Function<String, Integer> getLength=(s)->s.length();
		cityStream =Stream.of("Nashik", "Pune", "Mumbai", "Delhi", "Ahmednagar", "chennai", "Bangalore");
		//map() intermediate function receives Function as parameter
		numStream=cityStream.map(getLength);
		numStream.forEach(System.out::println);
		System.out.println("----------------------------");
		
		numStream=Stream.of(1,2,3,4,5);
		numStream=numStream.map((n)->n*n*n);
		numStream.forEach(System.out::println);
		System.out.println("----------------------------");
		
		
		numStream=Stream.of(1,2,3,4,5);
		Function<Integer, Double> sqrtFunction=(n)->Math.sqrt(n);
		Stream<Double> sqrtStream=numStream.map(sqrtFunction);
		List<Double> sqrtList=sqrtStream.collect(Collectors.toList());
		System.out.println(sqrtList);
		
		System.out.println("----------------------------");
		numStream=Stream.of(1,2,3,4,5);
		Optional<Integer> sum=numStream.reduce((a,b)->a+b);
		if (sum.isPresent())
			System.out.println("Sum is "+sum);
		
		numStream=Stream.of(10,12,30,14,15);
		Optional<Integer> max=numStream.reduce((a,b)->{
			if (a>b)
				return a;
			else
				return b;
		}
		);
				
		if (max.isPresent())
			System.out.println("Maximum element is "+max);
				
		numStream=Stream.of(10,12,30,14,15);
		Optional<Integer> min=numStream.reduce((a,b)->a<b?a:b);
		if (min.isPresent())
			System.out.println("Minimum element is "+min.get());
		
		BinaryOperator<Integer> sumFunction=(a,b)->a+b;
		numStream=Stream.of(10,12,30,14,15);
		sum=numStream.reduce( sumFunction);
		if (sum.isPresent())
		System.out.println("Sum is "+sum.get());
		//BinaryOperator
	}

}
