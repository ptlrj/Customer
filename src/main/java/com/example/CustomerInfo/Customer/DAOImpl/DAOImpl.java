package com.example.CustomerInfo.Customer.DAOImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CustomerInfo.Customer.repos.CustomerRepos;
import com.example.CustomerInfo.Customer.vo.PersonInfo;

@Service
public class DAOImpl implements DAO {

	@Autowired 
	CustomerRepos customer;
	
	@Override
	public String print() {
		
		return "Hello Welcome To The Customer Services.";
		
	}

	@Override
	public PersonInfo getPersonById(Integer id) {
		
		return customer.findById(id).get();
	}

}
