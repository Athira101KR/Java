package com.spring.learn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.learn.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Integer> {

}
