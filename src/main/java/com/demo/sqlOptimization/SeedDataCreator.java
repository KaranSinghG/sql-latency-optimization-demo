package com.demo.sqlOptimization;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.demo.sqlOptimization.entities.Customer;
import com.demo.sqlOptimization.entities.Order;
import com.demo.sqlOptimization.repository.CustomerRepository;
import com.demo.sqlOptimization.repository.OrderRepository;


import jakarta.transaction.Transactional;

@Component
public class SeedDataCreator implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final OrderRepository orderRepository;

    public SeedDataCreator(CustomerRepository customerRepository, OrderRepository orderRepository) {
        this.customerRepository = customerRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if(customerRepository.count()>0) {
            return;
        }
        for (int i = 1; i <= 1000; i++) {
            Customer customer = new Customer("Customer " + i);
            customerRepository.save(customer);
            for (int j = 1; j <= 20; j++) {
                Order order = new Order("Order " + j + " for Customer " + i, customer);
                orderRepository.save(order);
            }
            System.out.println("Created customer " + i);
        }
        
    }
    
}
