package com.spg.repository;

import java.util.List;

import com.spg.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}