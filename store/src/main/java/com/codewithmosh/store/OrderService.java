package com.codewithmosh.store;

import com.codewithmosh.store.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Service
public class OrderService {
    private final PaymentService paymentService;

    //@Autowired //, not necessary if we have a single constructor
    public OrderService(@Qualifier("stripe") PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("Order Service created");
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }

}
