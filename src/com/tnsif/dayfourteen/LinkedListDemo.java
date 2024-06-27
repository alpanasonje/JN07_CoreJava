package com.tnsif.dayfourteen;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> cityList = new LinkedList<String>();
		cityList.add("Nashik");
		cityList.add("Pune");
		cityList.add("Mumbai");
		System.out.println(cityList);
		System.out.println("----------------------------");
		cityList.add(2, "Delhi");
		System.out.println(cityList);
		System.out.println("----------------------------");
		cityList.addFirst("Hyderabad");
		cityList.addLast("Chennai");
		System.out.println(cityList);
		System.out.println("----------------------------");

		System.out.println("First City : " + cityList.getFirst());
		System.out.println("Last City : " + cityList.getLast());
		System.out.println("City at position 2 : " + cityList.get(2));
		System.out.println("----------------------------");
		System.out.println("Removed city at 2 position : " + cityList.remove(2));
		// IndexOutOfBoundsException : Index: 10, Size : 5
		// System.out.println("Removed city at 10 position : "+cityList.remove(10));
		System.out.println(cityList);
		System.out.println("Mumbai city removed? : " + cityList.remove("Mumbai"));
		System.out.println("Bangalore city removed? : " + cityList.remove("Bangalore"));
		System.out.println("Removes first city : " + cityList.removeFirst());
		System.out.println("Removes last city : " + cityList.removeLast());
		System.out.println(cityList);
		cityList.clear(); // removes all values
		System.out.println("----------------------------");
		System.out.println(cityList);
		System.out.println("Size : " + cityList.size());
		// throws NoSuchElementException as List is empty(Size is 0)
		// System.out.println("Removes first city : "+cityList.removeFirst());

		cityList.add("Mumbai");
		cityList.add("Delhi");
		cityList.add("Nagpur");
		cityList.add("Ahmedabad");
		cityList.add("Nasik");
		cityList.add("Pune");
		cityList.add("Bangalore");
		cityList.add("Hyderabad");
		cityList.add("Chennai");
		System.out.println("----------------------------");
		System.out.println(cityList);
		System.out.println("Size : " + cityList.size());

		ListIterator<String> lit = cityList.listIterator();
		while (lit.hasNext())
			System.out.println(lit.next().toUpperCase());
		System.out.println("----------------------------");

		lit = cityList.listIterator();
		while (lit.hasNext()) {
			String city = lit.next();
			if (city.equals("Delhi"))
				lit.remove();
			if (city.equals("Nasik"))
				lit.set("Nashik");
			if (city.equals("Nagpur"))
				lit.add("Jaipur");
		}
		System.out.println(cityList);
		System.out.println("----------------------------");
		lit = cityList.listIterator(cityList.size());
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		System.out.println("----------------------------");

	}

}
