package com.spring.learn.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.learn.entity.Student;
import com.spring.learn.repository.StudentRepository;

class StudentAlreadyexistException extends RuntimeException
{
	public StudentAlreadyexistException(String message)
	{
		super(message);
	}
}

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	public StudentRepository sr;
	
	@GetMapping
	public List<Student> retrieveAll(){
		return sr.findAll();
	}
	
	@GetMapping("/{id}")
	public Student findStudentById(@PathVariable("id")Integer id)
	{
		Optional<Student> temp=sr.findById(id);
		Student student=null;
		if(temp!=null)
		{
			student=temp.get();
		}
		return student;
	}
	
	@PostMapping
	public Student addStudent(@RequestBody Student student)
	{
		if(student.getId()==null)
		{
			return sr.save(student);
		}
		Student temp=findStudentById(student.getId());
		if(temp==null)
		{
			return sr.save(student);
		}
		else
		{
			throw new StudentAlreadyexistException("already exist");
		}
	}
	
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable("id")Integer id,@RequestBody Student student)
	{
		Student temp=findStudentById(id);
		if(temp!=null)
		{
			temp=student;
			sr.save(temp);
		}
		return temp;
	}
	
	@DeleteMapping("/{id}")
	public Student deleteStudent(@PathVariable("id")Integer id)
	{
		Student temp=findStudentById(id);
		if(temp!=null)
		{
			sr.delete(temp);
		}
		return temp;
	}

}
