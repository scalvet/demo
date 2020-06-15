package com.example.demo.service;

import com.example.demo.domain.model.Customer;
import com.example.demo.domain.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository repository;

    @Override
    public void save(Customer entity) {
        repository.save(entity);
    }

    @Override
    public List<Customer> getAll() {
        return repository.findAll();
    }
}
