package com.exam2.exceptionHandling;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	private Integer id;
	private String name;
	private Date dob;
	
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
	
	Employee(){}
	
	public Employee(Integer id,String name,Date dob)
	{
		super();
		this.id=id;
		this.name=name;
		this.dob=dob;
	}
	
	public Integer getId()
	{
		return id;
	}
	public void setId(Integer id)
	{
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
	public Date getDob()
	{
		return dob;
	}
	public void setDob(Date dob) throws InavlidDateOfBirthException
	{
		Date dt=new Date();
		if(dob.after(dt))
		{
			throw new InavlidDateOfBirthException("Invalid date input");
		}
		else
		{
			this.dob=dob;
		}	
	}
	
//	public String toString()
//	{
//		return (id,name,dob);
//	}
}
