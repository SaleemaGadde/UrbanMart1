
package com.urbanmart1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbanmart1.entity.Order;
import com.urbanmart1.entity.OrderStatus;
import com.urbanmart1.entity.Payment;
import com.urbanmart1.repository.OrderItemRepository;
import com.urbanmart1.repository.OrderRepository;
import com.urbanmart1.repository.OrderStatusRepository;
import com.urbanmart1.repository.PaymentRepository;
import com.urbanmart1.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
    private OrderRepository orderRepository;
    
    @Autowired
    private OrderItemRepository orderitemRepository;
    
    @Autowired
    private PaymentRepository paymentRepository;
    
    @Autowired
    private OrderStatusRepository orderStatusRepository;

    @Override
    public void saveOrder(Order order,
                          Long productId,
                          String productName,
                          Integer quantity,
                          Double price) {
  
    	System.out.println("Saving:"+ order.getFullName());
    	
       Order savedOrder= orderRepository.save(order);
       
       Payment payment = new Payment();
       payment.setOrderId(savedOrder.getId());
       payment.setPaymentMethod(savedOrder.getPaymentMethod());
       payment.setAmount(0.0);
       payment.setPaymentStatus("Pending");
       paymentRepository.save(payment);

       OrderStatus status = new OrderStatus();
       status.setOrderId(savedOrder.getId());
       status.setStatus("Pending");
       orderStatusRepository.save(status);

       System.out.println("Saved Successfully");
   }
}
       
       