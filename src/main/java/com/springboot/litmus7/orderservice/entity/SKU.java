package com.springboot.litmus7.orderservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * Represents a sku entity with details about its title, description, price
 *
 * @author Deepa
 *
 */

@Entity
@Table(name="sku")
@Data
public class SKU {
    @Id
    @GeneratedValue
    private int skuId;

    private String skuTitle;

    private String description;

    private double price;
}
