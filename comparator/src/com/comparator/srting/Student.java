package com.comparator.srting;

public class Student {
	 int rollno;
	String name;
	 String address;
	
	public Student() {}

	public Student(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	public String toString()
	{
		return this.rollno+" "+this.name+" "+this.address;
	}
}
