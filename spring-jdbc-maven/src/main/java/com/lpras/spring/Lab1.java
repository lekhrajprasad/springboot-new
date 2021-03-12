package com.lpras.spring;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab1 {

    public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyAppConfig.class);
	CustomerDAO cdao = ctx.getBean(CustomerDAOImpl.class);
	// 1. addCustomer
	Customer cust1 = new Customer(1004, "sd", "sd@lpras", 9999, "Blore");
	cdao.addCustomer(cust1);
	// 2. getAllCustomers
	System.out.println("getAllCustomers");
	List<Customer> list = cdao.getAllCustomers();
	list.forEach(cust -> System.out.println(cust));

	ctx.close();
    }

}
