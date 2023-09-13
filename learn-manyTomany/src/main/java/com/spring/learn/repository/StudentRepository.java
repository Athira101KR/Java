package com.spring.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.learn.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
