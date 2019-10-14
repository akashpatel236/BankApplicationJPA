package com.jpa.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.project.model.Customer;
import com.jpa.project.repo.CustomerRepository;

@Service
public class CustomerService {

	
	@Autowired
	private CustomerRepository repository;
	
	  public void addCustomers(Customer customer){  
	        repository.save(customer);  
	    } 
	  
	  public List<Customer> getAllUsers(){ 

	        List<Customer> customerRecords = new ArrayList<Customer>();  
	        repository.findAll().forEach(customerRecords::add);  
	        return customerRecords;  
	   }  
	  
	  public void addUser(Customer userRecord){  
		    repository.save(userRecord);  
	    }  
	
}
