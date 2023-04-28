package com.learn.exceptionHandling;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sd=new Student();
		Scanner sc=new Scanner(System.in);
		
		Integer id=sc.nextInt();
		try {
			sd.setId(id);	
		}
		catch(InvalidIdException e)
		{
			System.out.println(e.getMessage());
		}
		
		String name=sc.nextLine();
		Integer mark=sc.nextInt();

	}

}
