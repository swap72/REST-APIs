package com.springb.h2db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springb.h2db.entity.Customer;

@Repository
public interface ICustomerRepo extends JpaRepository<Customer, Long> {
	
}
