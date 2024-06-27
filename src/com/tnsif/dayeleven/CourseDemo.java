package com.tnsif.dayeleven;

public class CourseDemo {

	public static void main(String[] args) {
		StudentInfo s;
		try {
			s = new StudentInfo("Pankaj", "BE");

			System.out.println(s);

			StudentInfo ss = new StudentInfo();
			ss.setName("Pratik");
			ss.setCourse("MCA");
			System.out.println(ss);

			StudentInfo sss = new StudentInfo("Pankaja", "Diploma");
			System.out.println(sss);
		} catch (InvalidCourseException e) {
			System.out.println("error "+e.getMessage());
		}
	}

}
