package com.comparator.multiFieldSorting;

public class Student {
	String name;
	Integer age;
	
	public Student() {}
	
	public Student(String name,Integer age)
	{
		super();
		this.name=name;
		this.age=age;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public Integer getAge()
	{
		return age;
	}
	public void setAge(Integer age)
	{
		this.age=age;
	}
	public String toString()
	{
		return "name:"+name+"  age:"+age;
	}
	
}
