package com.java_mock_11.requirement1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter college 1 detail:");
		String details1=sc.nextLine();
		if(details1.equals(""))
			details1=sc.nextLine();
		String[] array=details1.split(",");
		
		College college1=new College();
		college1.setName(array[0]);
		college1.setWebsite(array[1]);
		college1.setMobile(array[2]);
		college1.setFounder(array[3]);
		college1.setNumberOfDept(Integer.parseInt(array[4]));
		college1.setLocation(array[5]);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
		college1.setStartingDate(sdf.parse(array[6]));
	
		
		System.out.println("Enter college 2 detail:");
		String details=sc.nextLine();
		if(details.equals(""))
			details=sc.nextLine();
		String[] arrays=details.split(",");
		College college2=new College();
		college2.setName(arrays[0]);
		college2.setWebsite(arrays[1]);
		college2.setMobile(arrays[2]);
		college2.setFounder(arrays[3]);
		college2.setNumberOfDept(Integer.parseInt(arrays[4]));
		college2.setLocation(arrays[5]);
		college2.setStartingDate(sdf.parse(arrays[6]));

		
		System.out.println(college1.toString());
		System.out.println(college2.toString());
		
		boolean res = college1.equals(college2);
		if(!res)
			System.out.println("College 1 and College 2 are different");
		else
			System.out.println("College 1 is same as College 2");
	}

}
