package com.springboot.litmus7.orderservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.id.IdentityGenerator;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private int orderId;



}
