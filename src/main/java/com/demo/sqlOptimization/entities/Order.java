package com.demo.sqlOptimization.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "description", nullable = false)
    String description;
    @ManyToOne
    @Column(name = "customer_id", nullable = false)
    Long customerId;

    public Order() {
    }

    public Order(String description, Long customerId) {
        this.description = description;
        this.customerId = customerId;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Long getCustomerId() {
        return customerId;
    }

}
