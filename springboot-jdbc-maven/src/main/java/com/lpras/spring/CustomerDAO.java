package com.lpras.spring;

import java.util.List;

public interface CustomerDAO {
    public void addCustomer(Customer cust);

    public List<Customer> getAllCustomers();
}
