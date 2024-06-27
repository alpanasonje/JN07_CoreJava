package com.tnsif.dayfourteen;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.plaf.synth.SynthStyleFactory;

public class StudentListDemo {

	public static void main(String[] args) {
		ArrayList<Student> studList=new ArrayList<Student>();
		studList.add(new Student(11, "Pooja", 67.50f));
		studList.add(new Student(15, "Pratik", 71.50f));
		studList.add(new Student(12, "Pratima", 77.50f));
		studList.add(new Student(18, "Pratiksha", 56.50f));
		studList.add(new Student(13, "Pritam", 62.50f));
		System.out.println("------------Student List Before Sorting-----------");
		System.out.println(studList);
		Collections.sort(studList);
		System.out.println("------------Student List After Sorting-----------");
		System.out.println(studList);
		

	}

}
