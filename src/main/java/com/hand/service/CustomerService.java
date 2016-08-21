package com.hand.service;

import java.util.List;

import com.hand.entity.Customer;

public interface CustomerService {
	
	public List<Customer> checkCustomer(String firstName);
	
	public List<Customer> selectAll();
}
