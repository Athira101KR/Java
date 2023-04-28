package com.learn.exceptionHandling;

public class Student {
	private Integer id;
	private String name;
	private Integer mark;


	Student(){}
	public Student(Integer id,String name,Integer mark)
	{
		super();
		this.id=id;
		this.name=name;
		this.mark=mark;
	}
	
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id) throws InvalidIdException
	{
		if(id>100)
			throw new InvalidIdException("Enter valid ID");
		else
			this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public Integer getMark()
	{
		return mark;
	}
	public void setMark(Integer mark)
	{
		this.mark=mark;
	}

}
