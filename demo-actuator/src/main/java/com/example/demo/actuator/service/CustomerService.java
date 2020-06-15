package com.example.demo.actuator.service;

import com.example.demo.actuator.domain.model.Customer;

import java.util.List;

public interface CustomerService {
    void save(Customer entity);

    List<Customer> getAll();
}
