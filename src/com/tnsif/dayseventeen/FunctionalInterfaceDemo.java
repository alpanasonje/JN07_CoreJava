package com.tnsif.dayseventeen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		/*
		 * System.out.println(Thread.currentThread().getName() +
		 * "\t---------in main ----------------"); Runnable r = () -> { for (int i = 1;
		 * i <= 50; i++) { System.out.println(Thread.currentThread().getName() +
		 * "\tHello"); try { Thread.sleep(500); } catch (InterruptedException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); } } };
		 * 
		 * // create child thread Thread t1 = new Thread(r, "Thread1");
		 * 
		 * Thread t2 = new Thread(r, "Thread2"); t1.start(); t2.start(); r=()->{ int
		 * i=2; while(i<=100) {
		 * System.out.println(Thread.currentThread().getName()+"\t"+i); i+=2; try {
		 * Thread.sleep(300); } catch (InterruptedException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } } };
		 * 
		 * Thread t3=new Thread(r, "Thread3"); t3.start();
		 * 
		 * 
		 * 
		 * 
		 * ArrayList<Integer> numList=new ArrayList<Integer>(); numList.add(40);
		 * numList.add(80); numList.add(20); numList.add(90); numList.add(10);
		 * numList.add(70); numList.add(30);
		 * System.out.println("-------Before Sorting-------");
		 * System.out.println(numList); Collections.sort(numList);
		 * System.out.println("-------Sorting on Ascending Order -------");
		 * System.out.println(numList);
		 * 
		 * Comparator<Integer> comp=(n1,n2)->n2-n1; Collections.sort(numList, comp);
		 * System.out.println("-------Sorting on Descending Order -------");
		 * System.out.println(numList);
		 * 
		 * ArrayList<String> nameList=new ArrayList<String>(); nameList.add("Pooja");
		 * nameList.add("Nutan"); nameList.add("Neha"); nameList.add("Prachi");
		 * nameList.add("Meghana"); nameList.add("Pratiksha"); nameList.add("Nikita");
		 * 
		 * System.out.println(nameList); Collections.sort(nameList);
		 * System.out.println(nameList);
		 * 
		 * Comparator<String> strComp=(s1, s2)->s2.compareTo(s1);
		 * 
		 * Collections.sort(nameList, strComp); System.out.println(nameList);
		 * 
		 * 
		 * ArrayList<Student> studList=new ArrayList<Student>(); studList.add(new
		 * Student(10, "Niket", 67, "IT")); studList.add(new Student(18, "Manoj", 71,
		 * "CSE")); studList.add(new Student(7, "Sanket", 58, "IT")); studList.add(new
		 * Student(3, "Vaibhav", 78, "CSE")); studList.add(new Student(12, "Nitin", 59,
		 * "ENTC")); studList.add(new Student(15, "Pratik", 63, "ENTC"));
		 * System.out.println(studList);
		 * 
		 * Comparator<Student>
		 * studComp=(s1,s2)->s2.getStream().compareTo(s1.getStream());
		 * Collections.sort(studList, studComp);
		 * System.out.println("------------------------------------");
		 * System.out.println(studList);
		 * 
		 * 
		 * 
		 */

		GreetInterface greet ;
		greet=new Greet1();
		//greet= (s) -> "Hello " + s;

		System.out.println(greet.sayHello("Students!"));

		//greet = (s) -> "Hi " + s + " How are you?";
		greet=new Greet2();
		System.out.println(greet.sayHello("Students!"));

	}
}

class Greet1 implements GreetInterface
{
	@Override
	public String sayHello(String name) {
		
		return "Hello " + name;
	}
	
}
class Greet2 implements GreetInterface
{
	@Override
	public String sayHello(String name) {
		
		return  "Hi " + name + " How are you?";
	}
	
}












