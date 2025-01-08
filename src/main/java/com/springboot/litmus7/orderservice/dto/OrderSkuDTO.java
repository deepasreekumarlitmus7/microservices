package com.springboot.litmus7.orderservice.dto;

import com.springboot.litmus7.orderservice.validation.CreateValidationGroup;
import com.springboot.litmus7.orderservice.validation.UpdateValidationGroup;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

/**
 * The DTO for OrderSKU
 * @param skuId
 * @param quantity
 * @param netPrice
 * @param actualPrice
 * @param description
 * @param title
 */
public record OrderSkuDTO(
        @NotNull(groups = {CreateValidationGroup.class,
                UpdateValidationGroup.class}, message = "SKU id cannot be null")
        int skuId,

        @Positive(groups = {CreateValidationGroup.class,
                UpdateValidationGroup.class}, message = "Quantity must be a " +
                "positive value")
        int quantity,

        @Positive(groups = {CreateValidationGroup.class,
                UpdateValidationGroup.class}, message = "Net price must be a " +
                "positive value")
        double netPrice,

        double actualPrice,

        String description,

        String title
) {
}
