package com.annotaion.showMethods;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		Class<? extends Employee> a = employee.getClass();
		Method[] method = a.getDeclaredMethods();
		for(Method m:method) {
			if(Modifier.isPublic(m.getModifiers()))
				System.out.println(m.getName());		
			}
	}

}
