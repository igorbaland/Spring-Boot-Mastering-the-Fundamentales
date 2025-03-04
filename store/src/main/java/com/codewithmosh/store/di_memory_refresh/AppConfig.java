package com.codewithmosh.store.di_memory_refresh;

import com.codewithmosh.store.di_memory_refresh.payment.PayPalPaymentService;
import com.codewithmosh.store.di_memory_refresh.payment.PaymentService;
import com.codewithmosh.store.di_memory_refresh.payment.StripePaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${payment-gateway:stripe}")
    private String paymentGateway;

    @Bean
    public PaymentService stripe() {
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal() {
        return new PayPalPaymentService();
    }

    @Bean
    //@Lazy
    //@Scope("prototype")
    public OrderService orderService() {
        if (paymentGateway.equals("stripe"))
            return new OrderService(stripe());
        return new OrderService(paypal());
    }
}
