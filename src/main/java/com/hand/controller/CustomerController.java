package com.hand.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hand.entity.Customer;
import com.hand.service.CustomerService;

@Controller
public class CustomerController {
	
	@Resource
	CustomerService customerService;
	
	@Resource
	HttpServletRequest request;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String doLogin(String userName, String password){
		
		List<Customer> customerList = customerService.checkCustomer(userName);
		if(customerList.size() != 0){
			System.out.println("登录成功");
			request.getSession().setAttribute("user", customerList);
			return "index";
		}
		return "login";
	}
}