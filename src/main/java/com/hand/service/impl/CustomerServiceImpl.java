package com.hand.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hand.dao.CustomerDao;
import com.hand.entity.Customer;
import com.hand.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Resource
	CustomerDao customerDao;
	
	public List<Customer> checkCustomer(String firstName) {
		return customerDao.checkCustomer(firstName);
	}

	public List<Customer> selectAll() {
		return customerDao.selectAll();
	}

}
