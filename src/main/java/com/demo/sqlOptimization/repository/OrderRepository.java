package com.demo.sqlOptimization.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.sqlOptimization.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
