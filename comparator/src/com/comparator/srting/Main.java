package com.comparator.srting;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al=new ArrayList<Student>();
		
		al.add(new Student(11,"man","ytuys"));
		al.add(new Student(15,"ain","xtrjhg"));
		al.add(new Student(12,"yu","gcg"));
		
//		SortByRollnum sr=new SortByRollnum();
//		sortByName sn=new sortByName();
		
		Collections.sort(al,new SortByRollnum());
		System.out.println(al);
		
		Collections.sort(al,new sortByName());
		System.out.println(al);
	}

}
