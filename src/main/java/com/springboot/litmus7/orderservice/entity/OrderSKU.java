package com.springboot.litmus7.orderservice.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * Represents an order_sku entity with details about order items such as
 * order, sku, ordered_quantity, netprice
 *
 * @author Deepa
 *
 */

@Entity
@Table(name = "order_sku")
@IdClass(OrderSkuId.class)
@Data
public class OrderSKU {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private Order orderId;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sku_id", nullable = false)
    private SKU skuId;

    private int quantity;

    private double netPrice;
}
