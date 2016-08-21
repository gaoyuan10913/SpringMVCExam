package com.hand.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hand.dao.CustomerDao;
import com.hand.entity.Customer;
import com.hand.service.CustomerService;

@Controller
public class IndexController {
	
	@Resource
	CustomerService customerService;

	@RequestMapping("/index")
	public String goToIndex(){
		return "index";
	}
	
	@RequestMapping("/json")
	@ResponseBody
	public List<Customer> json(){
		List<Customer> customerList = new ArrayList<Customer>();
		customerList = customerService.selectAll();
		return customerList;
	}
	
	@RequestMapping("/out")
	public String logout(HttpServletRequest request){
		request.getSession().removeAttribute("user");
		return "login";
	}
}
