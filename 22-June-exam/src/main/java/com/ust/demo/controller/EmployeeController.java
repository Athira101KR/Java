package com.ust.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.demo.repository.EmployeeRepository;
import com.ust.demo.entity.Employee;

class alreadyEXistEXception extends RuntimeException{
    public alreadyEXistEXception(String mes)
    {
        super(mes);
    }
}

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository er;

    @GetMapping
    public List<Employee> readAll()
    {
        return er.findAll();
    }

    @GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable("id")Integer id)
    {
        Optional<Employee> temp = er.findById(id);
        Employee employee=null;
        if(temp!=null)
        {
            employee=temp.get();
        }
        return employee;
    }

        @GetMapping("/name/{name}")
        public List<Employee> findEmployeeByName(@PathVariable("name")String name)
        {
            return  er.findByName(name);
            
        }
        @GetMapping("/name/{name}/department/{department}")
        public List<Employee> readEmployeeByNameandDepartment(@PathVariable("name")String name,@PathVariable("department")String department)
        {
            return er.findByNameAndDepartment(name, department);
        }
    @PostMapping("/{id}")
    public Employee addEmployee(@PathVariable("id")Integer id,@RequestBody Employee employee)
    {
        if(employee.getId()==null)
        {
            er.save(employee);
            return employee;
        }
        Employee emp=findEmployeeById(employee.getId());
        if(emp==null)
        {
            er.save(employee);
            return employee;
        }
        else{
            throw new alreadyEXistEXception("axist");
        }
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable("id")Integer id,@RequestBody Employee employee)
    {
        Employee emp=findEmployeeById(id);
        if(emp!=null)
        {
            emp=employee;
            er.save(emp);
        }
        return emp;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable("id")Integer id)
    {
        Employee emp=findEmployeeById(id);
        if(emp!=null)
        {
            er.delete(emp);
        }
        return ResponseEntity.ok(emp);
    }
}
