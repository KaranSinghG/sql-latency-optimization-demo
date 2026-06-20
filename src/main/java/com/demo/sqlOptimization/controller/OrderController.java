package com.demo.sqlOptimization.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.sqlOptimization.entities.Order;
import com.demo.sqlOptimization.repository.OrderRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/orders")
public class OrderController {
    
    private OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
    	this.orderRepository = orderRepository;
    }

    @GetMapping("/test")
    public String test() {
        return "Working";
    }
    
    @GetMapping("/all")
    public List<Order> getAllOrders() {
        return orderRepository.findAllWithCustomer();
    }
}
