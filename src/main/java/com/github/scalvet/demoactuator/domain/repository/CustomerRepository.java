package com.github.scalvet.demoactuator.domain.repository;

import com.github.scalvet.demoactuator.domain.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
