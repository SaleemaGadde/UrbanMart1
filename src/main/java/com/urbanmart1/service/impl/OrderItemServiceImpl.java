package com.urbanmart1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbanmart1.entity.OrderItem;
import com.urbanmart1.repository.OrderItemRepository;
import com.urbanmart1.service.OrderItemService;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public void saveOrderItem(OrderItem orderItem) {

        orderItemRepository.save(orderItem);

    }

}