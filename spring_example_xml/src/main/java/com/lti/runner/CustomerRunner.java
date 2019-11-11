package com.lti.runner;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Customer;
import com.lti.service.CustomerService;

public class CustomerRunner {

	public static void main(String[] args)
	{
		CustomerService service1;//=new CustomerServiceImpl();
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		service1=ctx.getBean("service1",CustomerService.class);
		
		List<Customer> list=service1.findAll();
		
		for(Customer c:list)
		{
			System.out.println(c);
		}
		
		System.out.println("\n\n-------------------------\n\n");
		
		CustomerService service2=ctx.getBean("service2", CustomerService.class);
		List<Customer> list2=service2.findAll();
		
		for(Customer c:list2)
		{
			System.out.println(c);
		}
		
	}

}
