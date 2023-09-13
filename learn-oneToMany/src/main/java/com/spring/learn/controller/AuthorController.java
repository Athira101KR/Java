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

import com.spring.learn.Repository.AuthorRepository;
import com.spring.learn.entity.Author;

class AuthorAlreadyExistException extends RuntimeException
{
    public AuthorAlreadyExistException(String message)
    {
        super(message);
    }
}
@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorRepository ar;

    @PostMapping
    public Author addAuthor(@RequestBody Author author)
    {
        if(author.getId()==null)
        {
            return ar.save(author);
        }
        Author temp=findAuthorById(author.getId());
        if(temp==null)
        {
            return ar.save(temp);
        }
        else{
            throw new AuthorAlreadyExistException("already exist");
        }
    }

    @GetMapping
    public List<Author> retrieveAll()
    {
        return ar.findAll();
    }

    @GetMapping("/{id}")
    public Author findAuthorById(@PathVariable("id")Integer id)
    {
        Optional<Author> temp=ar.findById(id);
        Author author=null;
        if(temp!=null)
        {
            author=temp.get();
        }
        return author;
    }

    @PutMapping("/{id}")
    public Author updateAuthor(@PathVariable("id")Integer id,@RequestBody Author author)
    {
        Author temp=findAuthorById(id);
        if(temp!=null)
        {
            temp=author;
            ar.save(temp);
        }
        return temp;
    }

    @DeleteMapping("/{id}")
    public Author deleteAuthor(@PathVariable("id")Integer id)
    {
        Author temp=findAuthorById(id);
        if(temp!=null)
        {
            ar.delete(temp);
        }
        return temp;
    }
}
