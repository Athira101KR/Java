package com.spring.learn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.learn.entity.Author;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
    
}
