package com.jpa.project.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.project.model.Customer;
import com.jpa.project.model.CustomerOperations;
import com.jpa.project.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@RequestMapping("/")
    public String home(Map<String, Object> model) {
		//model.put("message", "HowToDoInJava Reader !!");
        return "login";
    }
	
	@RequestMapping(value="welcome",method=RequestMethod.POST)
	public String next(Customer customer,Map<String, Object> model) {
		
		List<Customer> list=new ArrayList<Customer>();
		list=service.getAllUsers();
		
		System.out.println("Verifing customer credentials..");
		if(list.isEmpty())
		{
			System.out.println("No customer data found");
			model.put("error","No information available in Customer databases. Try after sometime...");
			return "login";
		}else{
		
			System.out.println(list.get(0).getFirstName());
			boolean flag=false;
			int customerIndex=0;
			for(int i=0;i<list.size();i++)
				if(list.get(i).getFirstName().equals(customer.getFirstName())){
					flag=true;
					customerIndex=i;
				}
			
		System.out.println("Login customer"+customer.getFirstName()+" "+customer.getLastName());
		model.put("c_name",customer.getFirstName());
		model.put("balance",list.get(customerIndex).getBalance());
		
		if(flag)
			return "welcome";
		else{
			System.out.println("You are not authorized to access Net Banking!!");
			model.put("error","You are not authorized to access Net Banking!!");
			return "login";
		}
		
		}
	}
	
	@RequestMapping(value="processBalance",method=RequestMethod.POST)
	public String processing(CustomerOperations data,Map<String, Object> model) {
		
		System.out.println(data.getUsername());
		System.out.println("Withdraw money:"+data.getWithdraw());
		System.out.println("Deposit money:"+data.getDeposit());
		System.out.println("Total balance : "+data.getBalance());
		
		long newBalance=data.getBalance()+data.getDeposit()-data.getWithdraw();
		data.setBalance(newBalance);
		model.put("c_name",data.getUsername());
		model.put("balance",newBalance);
		
		System.out.println("Updating in database..");
		Customer updateEntity = new Customer();
		List<Customer> list=new ArrayList<Customer>();
		list=service.getAllUsers();
		
		int customerIndex=0;
		for(int i=0;i<list.size();i++)
			if(list.get(i).getFirstName().equals(data.getUsername())){
				customerIndex=i;
			}
		updateEntity.setFirstName(data.getUsername());
		updateEntity.setBalance(data.getBalance());
		updateEntity.setLastName(list.get(customerIndex).getLastName());
		updateEntity.setCustomerId(list.get(customerIndex).getCustomerId());
		
		service.addUser(updateEntity);
		
		return "welcome";
		
	}

	
}
