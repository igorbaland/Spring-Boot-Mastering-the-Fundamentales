package com.codewithmosh.store.di_memory_refresh;

import com.codewithmosh.store.di_memory_refresh.payment.PaymentService;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;

//@Service
public class OrderService {
    private final PaymentService paymentService;

    //@Autowired //, not necessary if we have a single constructor
    public OrderService(@Qualifier("stripe") PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("Order Service created");
    }

    @PostConstruct
    public void init() {
        System.out.println("OrderService PostConstruct");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("OrderService PreDestroy");
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }

}
