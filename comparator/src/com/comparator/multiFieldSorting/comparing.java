package com.comparator.multiFieldSorting;

import java.util.Comparator;

public class comparing implements Comparator<Student> {
	public int compare(Student s1,Student s2)
	{
		int nameCompare=s1.getName().compareTo(s2.getName());
		int ageCompare=s1.getAge().compareTo(s2.getAge());
		
		return (nameCompare==0)?ageCompare:nameCompare;
	
	}
}
