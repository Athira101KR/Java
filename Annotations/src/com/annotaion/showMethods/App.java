package com.annotaion.showMethods;

import java.lang.reflect.Method;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		Class<? extends Employee> c = emp.getClass();
		Method[] methods = c.getDeclaredMethods();
		for(Method meth:methods)
		{
			System.out.println(meth.getName());
		}

	}

}
