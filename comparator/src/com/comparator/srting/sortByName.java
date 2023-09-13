package com.comparator.srting;

import java.util.Comparator;

public class sortByName implements Comparator<Student> {
	public int compare(Student a,Student b)
	{
		return a.name.compareTo(b.name);
	}
}
