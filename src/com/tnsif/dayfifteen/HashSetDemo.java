package com.tnsif.dayfifteen;

import java.util.HashSet;

public class HashSetDemo {

	
	public static void main(String[] args) {
		
		
		
		
		HashSet<Integer> set1=new HashSet<Integer>();
		set1.add(50);
		set1.add(100);
		set1.add(25);
		set1.add(90);
		set1.add(65);
		set1.add(80);
		set1.add(70);
		System.out.println(set1);
		System.out.println(set1.add(65));
		System.out.println("First Set : "+set1);
		
		HashSet<Integer> set2=new HashSet<Integer>();
		set2.add(51);
		set2.add(100);
		set2.add(21);
		set2.add(91);
		set2.add(65);
		set2.add(80);
		set2.add(70);
		System.out.println("Second Set : "+set2);
		System.out.println("-------------------------");
		
		set1.addAll(set2); //UNION on two Sets
		System.out.println("First Set (Union of two sets) : "+set1);
		System.out.println("Second Set : "+set2);
		System.out.println("-------------------------");
		
		set1.removeAll(set2); //SET DIFFERENCE
		System.out.println("First Set (SET Difference) : "+set1);
		System.out.println("Second Set : "+set2);
		System.out.println("-------------------------");
		set1.clear();
		set1.add(50);
		set1.add(100);
		set1.add(25);
		set1.add(90);
		set1.add(65);
		set1.add(80);
		set1.add(70);
		System.out.println("First Set : "+set1);
		System.out.println("Second Set : "+set2);
		System.out.println("-------------------------");
		
		//INTERSECTION of two sets
		set1.retainAll(set2);
		System.out.println("First Set (Intersection): "+set1);
		System.out.println("Second Set : "+set2);
		System.out.println("-------------------------");
		
		
		
		
		
		
		
		
	}

}
