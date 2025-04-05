package com.krishna.learnings.aws.controller;

import com.krishna.learnings.aws.dao.OrderDao;
import com.krishna.learnings.aws.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * {@code OrderController}
 * @author Rajesh R
 * @since 05/04/2025
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderDao orderDao;

    @GetMapping
    public List<Order> getOrders(){
        return orderDao.getOrder();
    }
}
