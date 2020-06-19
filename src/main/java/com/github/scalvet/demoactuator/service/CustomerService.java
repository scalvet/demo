package com.github.scalvet.demoactuator.service;

import com.github.scalvet.demoactuator.domain.model.Customer;

import java.util.List;

public interface CustomerService {
    void save(Customer entity);

    List<Customer> getAll();
}
