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

import com.spring.entity.Customer;
import com.spring.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerRepository cr;

	@GetMapping
	public List<Customer> readAll()
	{
		return cr.findAll();
	}

	@GetMapping("/{id}")
	public Customer findCustomerById(@PathVariable("id")Integer id)
	{
		Optional<Customer> temp=cr.findById(id);
		Customer customer=null;
		if(temp!=null)
		{
			customer=temp.get();
		}
		return customer;
	}

	@PostMapping
	public Customer addCustomer(@RequestBody Customer customer)
	{
		if(customer.getId()==null)
		{
			cr.save(customer);
		}
		Customer temp=findCustomerById(customer.getId());
		if(temp!=null)
		{
			cr.save(customer);
		}
		return customer;
	}

	@PutMapping("/{id}")
	public Customer updatCustomer(@PathVariable("id")Integer id,@RequestBody Customer customer)
	{
		Customer temp=findCustomerById(id);
		if(temp!=null)
		{
			temp=customer;
			cr.save(temp);
		}
		return temp;
	}

	@DeleteMapping("/{id}")
	public Customer deleCustomer(@PathVariable("id")Integer id)
	{
		Customer customer=findCustomerById(id);
		if(customer!=null)
		{
			cr.delete(customer);
		}
		return customer;
	}
}