package com.spring.controller;

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

import com.spring.entity.Product;
import com.spring.repository.ProductRepository;

class ProductAlreadyExistException extends RuntimeException
{
	public ProductAlreadyExistException(String message)
	{
		super(message);
	}
}

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductRepository pr;
	
	@PostMapping
	public Product addProduct(@RequestBody Product product)
	{
		if(product.getId()==null)
		{
			return pr.save(product);
		}
		Product temp=findProductById(product.getId());
		if(temp==null)
		{
			return pr.save(temp);
		}
		else
		{
			throw new ProductAlreadyExistException("Product id already exist"+product.getId());
		}
	}
	
	@GetMapping
	public List<Product> retrieveAllProducts()
	{
		return pr.findAll();
	}
	
	@GetMapping("/{id}")
	public Product findProductById(@PathVariable("id")Integer id)
	{
		Optional<Product> temp=pr.findById(id);
		Product product=null;
		if(temp!=null)
		{
			product=temp.get();
		}
		return product;
	}
	
	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable("id")Integer id,@RequestBody Product product)
	{
		Product exist=findProductById(id);
		if(exist!=null)			
		{
			exist=product;
			pr.save(exist);
		}
		return exist;
	}
	
	@DeleteMapping("/{id}")
	public Product deleteProduct(@PathVariable("id")Integer id)
	{
		Product temp=findProductById(id);
		if(temp!=null)
		{
			pr.delete(temp);
		}
		return temp;
	}
}
