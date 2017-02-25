package com.spg.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.spg.model.Customer;

@Repository("customerRepository")
public class HibernateCutomerRepositoryImpl implements CustomerRepository {
	
	
	@Value("${DBUserName}")
	private String dbUserName;

	/* (non-Javadoc)
	 * @see com.spg.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		System.out.println(dbUserName);
		Customer customer  = new Customer();
		
		List<Customer> customers = new ArrayList();
		
		customer.setFirstName("John");
		customer.setLastName("Doe");
		
		customers.add(customer);
		
		return customers;
		
		
	}
	
}
