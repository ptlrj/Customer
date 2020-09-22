package com.example.CustomerInfo.Customer.controller;

import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CustomerInfo.Customer.DAOImpl.DAO;
import com.example.CustomerInfo.Customer.repos.CustomerRepos;
import com.example.CustomerInfo.Customer.vo.PersonInfo;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	DAO dao;
	
	@RequestMapping("/getData")
	public String getData() {
		
		return dao.print();
	}
	
	@GetMapping("/getData/{id}")
	public PersonInfo getCustomerByID(@PathVariable("id") Integer userId) {
		return dao.getPersonById(userId);
	}
	

}
