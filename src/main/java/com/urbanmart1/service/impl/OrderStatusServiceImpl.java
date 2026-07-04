package com.urbanmart1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbanmart1.entity.OrderStatus;
import com.urbanmart1.repository.OrderStatusRepository;
import com.urbanmart1.service.OrderStatusService;

@Service
public class OrderStatusServiceImpl implements OrderStatusService {

    @Autowired
    private OrderStatusRepository orderStatusRepository;

    @Override
    public void saveOrderStatus(OrderStatus orderStatus) {

        orderStatusRepository.save(orderStatus);

    }
}
