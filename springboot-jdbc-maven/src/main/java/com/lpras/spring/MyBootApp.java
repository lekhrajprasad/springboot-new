package com.lpras.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBootApp implements CommandLineRunner {

    @Autowired
    CustomerDAO customerDAO;

    public static void main(String[] args) {
	System.out.println("MyBootApp..main() method ----- Starts");
	SpringApplication.run(MyBootApp.class, args);
	System.out.println("MyBootApp..main() method ----- Ends");
    }

    @Override
    public void run(String... args) throws Exception {
	System.out.println("MyBootApp..run() method ----Starts");
	System.out.println ("------------------------------------");
	// 1. addCustomer
	Customer cust1 = new Customer(1014, "sd", "sd@lpras", 9999, "Blore");
	customerDAO.addCustomer(cust1);
	Customer cust2 = new Customer(1015, "sd", "sd@lpras", 9999, "Blore");
	customerDAO.addCustomer(cust2);
	// 2. getAllCustomers
	System.out.println("getAllCustomers");
	List<Customer> list = customerDAO.getAllCustomers();
	list.forEach(cust -> System.out.println(cust));
	System.out.println ("------------------------------------");
	System.out.println("MyBootApp..run() method ----- Ends");
    }

}
