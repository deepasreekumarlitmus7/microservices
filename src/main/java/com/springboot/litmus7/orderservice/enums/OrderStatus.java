package com.springboot.litmus7.orderservice.enums;

/**
 * Enum representing Order status values
 */
public enum OrderStatus {
    PENDING,
    PROCESSING,
    CONFIRMED,
    SHIPPED,
    DELIVERED,
    CANCELLED,
    RETURNED,
    REFUNDED
}
