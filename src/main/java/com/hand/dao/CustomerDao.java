package com.hand.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hand.entity.Customer;

@Repository
public interface CustomerDao {

	public List<Customer> checkCustomer(String firstName);
	
	public List<Customer> selectAll();
}
