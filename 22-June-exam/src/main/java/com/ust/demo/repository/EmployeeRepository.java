package com.ust.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ust.demo.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
    public java.util.List<Employee> findByName(String name);
    @Query("* from employee e where e.name=:name and e.department=:department")
    public java.util.List<Employee> findByNameAndDepartment(@Param("name")String name,@Param("department")String department);
    
}
