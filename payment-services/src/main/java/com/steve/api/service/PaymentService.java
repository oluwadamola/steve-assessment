package com.steve.api.service;

import com.steve.api.entity.Payment;
import com.steve.api.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Random;

import java.util.UUID;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository repository;

    public Payment doPayment(Payment payment){
        payment.setPaymentStatus(paymentProcessing());
        payment.setTransactionId(UUID.randomUUID().toString());
        return  repository.save(payment);
    }

    public String paymentProcessing(){
        //api call should be third party gateway
        return new Random().nextBoolean()? "success":"false";
    }
}
