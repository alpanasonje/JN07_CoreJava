package com.tnsif.dayfourteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Raw list - heterogeneous elements
		ArrayList a=new ArrayList();
		System.out.println(a.add(10));
		System.out.println(a.add(20));
		a.add(30);
		a.add(5);
		a.add(3);
		
		a.add(8);
		System.out.println("Arraylist is : "+a);
		System.out.println("Size of arraylist is : "+a.size());
		a.add(45);
		System.out.println(a.add(20));
		a.add(50);
		System.out.println("Arraylist is : "+a);
		System.out.println("Is 30 present : "+a.contains(30));
		System.out.println("Is 300 present : "+a.contains(300));
		System.out.println("Index of 20 is : "+a.indexOf(20));
		System.out.println("Index of 200 is : "+a.indexOf(200));
		System.out.println("Last Index of 20 is : "+a.lastIndexOf(20));
		System.out.println("***************************");
		System.out.println("remove(3) : "+a.remove(3));
		System.out.println("List after remove : "+a);
		System.out.println(a.remove(a.indexOf(10)));
		System.out.println("List after remove : "+a);
		System.out.println(a.remove(Integer.valueOf(30)));
		System.out.println("List after remove : "+a);
		/*a.add("aaaa");
		System.out.println("List is "+a);
		Collections.sort(a); //Throws ClassCastException
		*/
		Collections.sort(a);
		System.out.println("List after sorting : "+a);
		Iterator i=a.iterator();
		System.out.println("------------------------------");
		while(i.hasNext())
			System.out.println(i.next());
		
				
		

	}

}
