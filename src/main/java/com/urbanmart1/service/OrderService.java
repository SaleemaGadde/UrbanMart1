package com.urbanmart1.service;

import com.urbanmart1.entity.Order;

import com.urbanmart1.entity.Order;

public interface OrderService {

    void saveOrder(Order order,
                   Long productId,
                   String productName,
                   Integer quantity,
                   Double price);
}