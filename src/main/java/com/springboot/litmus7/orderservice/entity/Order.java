package com.springboot.litmus7.orderservice.entity;

import com.springboot.litmus7.orderservice.enums.OrderStatus;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;


/**
 * Represents an order entity with details about its status, total amount, and
 * associated SKUs.
 *
 * @author Deepa
 *
 */

@Entity
@Table(name="orders")
@Data
public class Order {

    @Id
    @GeneratedValue
    private int orderId;

    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @OneToMany(mappedBy = "orderId", cascade = CascadeType.PERSIST,
            orphanRemoval = true)
    private List<OrderSKU> orderItems;

    private double orderTotal;
}
