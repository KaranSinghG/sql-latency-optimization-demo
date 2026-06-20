package com.demo.sqlOptimization.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.sqlOptimization.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
