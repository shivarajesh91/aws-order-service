package com.krishna.learnings.aws.dao;

import com.krishna.learnings.aws.model.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

/**
 * {@code OrderDao}
 * @author Rajesh R
 * @since 05/04/2025
 */
@Repository
public class OrderDao {

    public List<Order> getOrder(){
        return Stream.of(
                new Order(101, "Mobile", 1, 30000),
                new Order(58, "Book", 4, 2000),
                new Order(205, "Laptop", 1, 150000),
                new Order(809, "Headset", 1, 1799)
        ).toList();
    }
}
