package com.tnsif.dayeighteen;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		Integer a[]= {10,20,40,30,55,35,65,95,80};
		Stream<Integer> numStream=Arrays.stream(a);
		
		//fetch only even numbers
		Stream<Integer> evenStream=numStream.filter((n)->n%2==0);
		evenStream.forEach(System.out::println);
		
		//fetch only above 50 numbers
		numStream=Arrays.stream(a);
		Stream<Integer> filterStream=numStream.filter((n)->n>50);
		filterStream.forEach(System.out::println);
		
		//filter() using Predicate object
		numStream=Arrays.stream(a);
		Predicate<Integer> oddPredicate=(n)-> n%2!=0 ;
		numStream=numStream.filter(oddPredicate);
		numStream.forEach(System.out::println);
		
		//filter() - cities ends with "i"
		String[] cities={"Pune", "Delhi", "Nashik", "Mumbai", "Bangalore"};
		Stream<String> cityStream=Arrays.stream(cities);
		Predicate<String> cityPredicate=(s)->s.endsWith("i");
		cityStream=cityStream.filter(cityPredicate);
		cityStream.forEach(System.out::println);
	}

}
