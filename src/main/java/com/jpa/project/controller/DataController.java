package com.jpa.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.project.model.Customer;
import com.jpa.project.service.CustomerService;

@RestController
public class DataController {

	
	@Autowired
	private CustomerService service;

	@RequestMapping("/login")
	public List<Customer> getAllCustomers(){
		
		System.out.println("Reteriving customer informations..");
		return service.getAllUsers();
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void addCustomers(@RequestBody Customer customer){
		
		System.out.println("Adding customer informations..");
		service.addCustomers(customer);
	}
	
}
