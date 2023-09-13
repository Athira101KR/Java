package com.spring.learn.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.learn.Repository.BookRepository;
import com.spring.learn.entity.Book;
class BookAlreadyExistsException extends RuntimeException{
    public BookAlreadyExistsException(String message){
        super(message);
    }
}
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookRepository br;
    @GetMapping
    public List<Book> retrieveAllBooks(){
        return br.findAll();
    }
    @GetMapping("/{id}")
    public Book findBookById(@PathVariable("id") Integer id){
    Book b=null;
    Optional<Book>temp=br.findById(id);
    if(temp!=null){
        b=temp.get();
        
    }
      return b;
    }
@PostMapping
public Book addBook(@RequestBody Book book){
    if(book.getId()==null){
        br.save(book);
        return book;
    }
    Book temp=findBookById(book.getId());
    if(temp==null){
         br.save(book);
         
    }
    else{
        throw new BookAlreadyExistsException("Book with id"+book.getId()+"already exists");     
    }
    return book;
}
@PutMapping("/{id}")
public Book updateBook(@PathVariable("id") Integer id,@RequestBody Book book){
    Book b=findBookById(id);
    if(b!=null){
        b=book;
        br.save(b);
    }
    return b;
}
@DeleteMapping("/{id}")
public ResponseEntity<String> deleteBook(@PathVariable("id") Integer id){
    Book b=findBookById(id);
    if(b!=null){
        br.delete(b);
        return ResponseEntity.ok("found");
    }
    else{
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("not found");
    }
    
}
}
