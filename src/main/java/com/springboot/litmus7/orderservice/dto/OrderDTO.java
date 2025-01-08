package com.springboot.litmus7.orderservice.dto;

import com.springboot.litmus7.orderservice.enums.OrderStatus;
import com.springboot.litmus7.orderservice.validation.CreateValidationGroup;
import com.springboot.litmus7.orderservice.validation.UpdateValidationGroup;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;
import java.util.List;

/**
 * The DTO for Order
 * @param orderId
 * @param orderStatus
 * @param orderDate
 * @param totalAmount
 * @param orderItems
 */

public record OrderDTO(
        @NotNull(groups = UpdateValidationGroup.class, message = "Order id is " +
                "mandatory")
        @Positive(groups = UpdateValidationGroup.class, message = "Order Id must " +
                "be a positive number")
        int orderId,

        @NotNull(groups = {UpdateValidationGroup.class,
                CreateValidationGroup.class}, message = "Order status cannot be " +
                "null")
        OrderStatus orderStatus,

        LocalDateTime orderDate,

        double totalAmount,

        @NotEmpty(groups = CreateValidationGroup.class, message = "Order must" +
                " contain at least one item")
        @Valid
        List<OrderSkuDTO> orderItems) {
        }
