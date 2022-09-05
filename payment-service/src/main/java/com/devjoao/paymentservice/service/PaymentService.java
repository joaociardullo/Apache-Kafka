package com.devjoao.paymentservice.service;

import com.devjoao.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
