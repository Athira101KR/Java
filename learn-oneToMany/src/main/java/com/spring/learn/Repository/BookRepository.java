package com.spring.learn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.learn.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {
    
}
