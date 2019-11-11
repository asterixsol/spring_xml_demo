package com.lti.repository;

import java.util.ArrayList;
import java.util.List;

import com.lti.model.Customer;

public class JDBCCustomerRepositoryImpl implements CustomerRepository
{

	public JDBCCustomerRepositoryImpl() 
	{
		System.out.println("Loading from JDBC Cusotmer Repo");
	}

	public List<Customer> findAll()
	{
		Customer c1=new Customer();
		c1.setFirstName("Rahul");
		c1.setLastName("Gandhi");
		
		Customer c2=new Customer();
		c2.setFirstName("Narendra");
		c2.setLastName("Modi");
		
		List<Customer> list=new ArrayList<Customer>();
		
		list.add(c1);
		list.add(c2);
		
		return list;
	}
	
	

}
