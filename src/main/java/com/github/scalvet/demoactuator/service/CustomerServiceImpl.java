package com.github.scalvet.demoactuator.service;

import com.github.scalvet.demoactuator.domain.model.Customer;
import com.github.scalvet.demoactuator.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository repository;

    @Autowired
    CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Customer entity) {
        repository.save(entity);
    }

    @Override
    public List<Customer> getAll() {
        return repository.findAll();
    }
}
