package com.example.CustomerInfo.Customer.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CustomerInfo.Customer.vo.PersonInfo;

@Repository
public interface CustomerRepos extends JpaRepository<PersonInfo, Integer> {

}
