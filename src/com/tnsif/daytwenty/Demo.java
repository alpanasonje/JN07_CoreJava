package com.tnsif.daytwenty;

import java.lang.annotation.Annotation;
import java.util.ArrayList;

import com.tnsif.daytwentyone.userdefinedannotation.AndroidSeries;
import com.tnsif.daytwentyone.userdefinedannotation.SmartPhone;
import com.tnsif.daytwentyone.userdefinedannotation.SmartTV;

public class Demo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("Hello");

		System.out.println("-------------------------------");
		
		AndroidSeries obj = new AndroidSeries("A23", 14);
		System.out.println(obj.model);
		System.out.println(obj.screenSize);
	
		Class c = obj.getClass();
		System.out.println("SmartTV details");
		Annotation an1 = c.getAnnotation(SmartTV.class);
		
		SmartTV s1 = (SmartTV) an1;

		System.out.println(s1.os());
		System.out.println(s1.price());
		
	}

}
