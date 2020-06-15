package com.example.demo.service;

import com.example.demo.domain.model.Customer;

import java.util.List;

public interface CustomerService {
    void save(Customer entity);

    List<Customer> getAll();
}
