package com.spg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spg.model.Customer;
import com.spg.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	
	CustomerRepository repo;
	
//	public CustomerServiceImpl(CustomerRepository repo){
//		System.out.println("We are using constructor injection");
//		this.repo = repo;
//	}
	
	@Autowired
	public void setRepo(CustomerRepository repo) {
		System.out.println("We are using a setter injection");
		this.repo = repo;
	}

	/* (non-Javadoc)
	 * @see com.spg.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		
		return repo.findAll();
	}
	
}
