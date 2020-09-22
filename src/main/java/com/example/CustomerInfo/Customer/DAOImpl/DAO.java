package com.example.CustomerInfo.Customer.DAOImpl;

import com.example.CustomerInfo.Customer.vo.PersonInfo;

public interface DAO{
		
	String print();
	PersonInfo getPersonById(Integer id);
	
}