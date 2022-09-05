package com.devjoao.paymentservice.controller.impl;

import com.devjoao.paymentservice.controller.PaymentController;
import com.devjoao.paymentservice.model.Payment;
import com.devjoao.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/payments")
public class PaymentContollerImpl implements PaymentController {

    @Autowired
    PaymentService paymentService;

    @Override
    public ResponseEntity<Payment> payment(Payment payment) {

        paymentService.sendPayment(payment);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
