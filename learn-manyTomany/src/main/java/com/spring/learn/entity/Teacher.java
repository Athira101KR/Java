package com.spring.learn.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.sun.istack.NotNull;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@NotNull
	private String name;
	private Integer courseId;
	@ManyToMany
	private List<Student> students;
	
	public Teacher() {}
	
	public Teacher(Integer id,String name,Integer courseId )
	{
		super();
		this.id=id;
		this.name=name;
		this.courseId=courseId;
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
	public Integer getCourseId()
	{
		return courseId;
	}
	public void setCourseId(Integer courseId)
	{
		this.courseId=courseId;
	}
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public String toString()
	{
		return "Teacher [id: "+id+", name: "+name+", courseId: "+courseId+"] "+"";
	}

}
