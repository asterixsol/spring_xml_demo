package com.lti.repository;

import java.util.ArrayList;
import java.util.List;

import com.lti.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository
{
	public CustomerRepositoryImpl()
	{
		System.out.println("Loading from Generic Repo...");
	}

	public List<Customer> findAll()
	{
		Customer c1=new Customer();
		c1.setFirstName("Zartab");
		c1.setLastName("Nakhwa");
		
		Customer c2=new Customer();
		c2.setFirstName("Tom");
		c2.setLastName("Cruise");
		
		List<Customer> list=new ArrayList<Customer>();
		
		list.add(c1);
		list.add(c2);
		
		return list;
	}

	

}
