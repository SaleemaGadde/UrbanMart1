
package com.urbanmart1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.urbanmart1.entity.Order;
import com.urbanmart1.service.OrderService;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order")
    public String orderPage() {
        return "order";
    }

    @GetMapping("/order-success")
    public String orderSuccess() {
        return "order-success";
    }

    @PostMapping("/placeOrder")
    public String placeOrder(@ModelAttribute Order order,
                             @RequestParam Long productId,
                             @RequestParam String productName,
                             @RequestParam Integer quantity,
                             @RequestParam Double price) {

        orderService.saveOrder(order, productId, productName, quantity, price);

        return "order-success";
    }
    
    
    
 
}