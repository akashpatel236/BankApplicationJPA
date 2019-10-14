package com.jpa.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	
	
	public Customer() {
		super();
	}

	@Id
	@GeneratedValue
	@Column(name="id",nullable=false)
	private long customerId;
	
	@Column(name="firstName",nullable=false)
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="balance",nullable=false)
	private long balance;

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	
	
	
}
