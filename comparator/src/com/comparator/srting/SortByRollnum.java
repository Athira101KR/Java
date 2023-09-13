package com.comparator.srting;

import java.util.Comparator;

public class SortByRollnum implements Comparator<Student>{
	public int compare(Student a,Student b)
	{
		return a.rollno-b.rollno;
	}
}
