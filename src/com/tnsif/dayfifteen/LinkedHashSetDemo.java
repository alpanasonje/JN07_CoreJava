package com.tnsif.dayfifteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(60);
		lhs.add(30);
		lhs.add(90);
		lhs.add(20);
		lhs.add(70);
		lhs.add(40);
		lhs.add(40);
		System.out.println(lhs);
		Iterator<Integer> it=lhs.iterator();
		while(it.hasNext())
			System.out.print(it.next()+"\t");
		System.out.println("Size : "+lhs.size());
		lhs.remove(30);
		lhs.remove(50);
		System.out.println(lhs);
		
		//Collections.sort(lhs); not applicable for LinkedHashSet
		System.out.println("-----------------------------");
		ArrayList<Integer> a=new ArrayList<Integer>(lhs);
		System.out.println(a);
		Collections.sort(a);
		System.out.println("After Sorting : "+a);
		
		lhs=new LinkedHashSet<Integer>(a);
		System.out.println(lhs);
		
		
		
		
		
		
		
		
	}
}
