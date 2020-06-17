package com.example.demo.actuator.controller;

import com.example.demo.actuator.service.CustomerService;
import com.example.demo.actuator.domain.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/customers")
@RestController
public class CustomerController {
    private final  CustomerService service;

    @Autowired
    CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public List<Customer> getAll() {
        return service.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody @Valid Customer customer) {
        service.save(customer);
    }
}
