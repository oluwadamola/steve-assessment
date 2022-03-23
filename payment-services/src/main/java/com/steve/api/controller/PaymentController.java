package com.steve.api.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.steve.api.entity.Payment;
import com.steve.api.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService service;

    @PostMapping("/dopayment")
    public Payment doPayment(@RequestBody Payment payment) throws JsonProcessingException {
        return service.doPayment(payment);
    }
}
