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

import com.spring.learn.entity.Teacher;
import com.spring.learn.repository.TeacherRepository;

class TeacherAlreadyExistException extends RuntimeException
{
	public TeacherAlreadyExistException(String message)
	{
		super(message);
	}
}

@RestController
@RequestMapping("/teacher")
public class TeacherController {
	@Autowired
	public TeacherRepository tr;
	
	@GetMapping
	public List<Teacher> retrieveAll()
	{
		return tr.findAll();
	}
	
	@GetMapping("/{id}")
	public Teacher findTeacherById(@PathVariable("id")Integer id)
	{
		Optional<Teacher> temp=tr.findById(id);
		Teacher teacher=null;
		if(temp!=null)
		{
			teacher=temp.get();
		}
		return teacher;
	}
	
	@PostMapping
	public Teacher addTeacher(@RequestBody Teacher teacher)
	{
		if(teacher.getId()==null)
		{
			return tr.save(teacher);
		}
		Teacher temp=findTeacherById(teacher.getId());
		if(temp==null)
		{
			return tr.save(temp);
		}
		else
		{
			throw new TeacherAlreadyExistException("alreadt exist");
		}
	}
	@PutMapping("/{id}")
	public Teacher updateTeacher(@PathVariable("id")Integer id,@RequestBody Teacher teacher)
	{
		Teacher temp=findTeacherById(id);
		if(temp!=null)
		{
			temp=teacher;
			tr.save(temp);
		}
		return temp;
	}
	
	@DeleteMapping("/{id}")
	public Teacher deleteTeacher(@PathVariable("id")Integer id)
	{
		Teacher temp=findTeacherById(id);
		if(temp!=null)
		{
			tr.delete(temp);
		}
		return temp;
	}
}
