package com.tnsif.dayfourteen;

public class Student implements Comparable<Student> {
	private int rno;
	private String name;
	private float per;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rno, String name, float per) {
		super();
		this.rno = rno;
		this.name = name;
		this.per = per;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", per=" + per + "]\n";
	}
	@Override
	public int compareTo(Student o) {
		
		//return (int)(o.getPer()-getPer()) ;
		return getRno()- o.getRno(); 
	}
	
	

}
