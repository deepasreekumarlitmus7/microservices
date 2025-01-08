package com.springboot.litmus7.orderservice.entity;

import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.io.Serializable;

@Data
public class OrderSkuId implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id", nullable = false)
    private Order orderId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="sku_id",nullable = false)
    private SKU skuId;


}
