package com.krishna.learnings.aws.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * {@code Order} model
 * @author Rajesh R
 * @since 05/04/2025
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Order {

    private int id;
    private String name;
    private int quantity;
    private long price;
}
