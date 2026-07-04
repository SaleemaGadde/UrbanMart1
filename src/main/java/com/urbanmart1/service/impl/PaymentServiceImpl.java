package com.urbanmart1.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.urbanmart1.entity.Payment;
import com.urbanmart1.repository.PaymentRepository;
import com.urbanmart1.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public void savePayment(Payment payment) {

        paymentRepository.save(payment);

    }
}
