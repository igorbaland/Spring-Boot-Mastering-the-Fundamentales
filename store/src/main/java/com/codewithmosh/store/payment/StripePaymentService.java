package com.codewithmosh.store.payment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService {

    //ctrl+space = list all declared values in apl.prop
    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    //:3000, if we didn't define in apl.prop
    @Value("${stripe.timeout:3000}")
    private int timeout;

    @Value("${stripe.supported-currencies}")
    private List<String> supportedCurrencies;

    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("API URL: " + apiUrl);
        System.out.println("Enabled " + enabled);
        System.out.println("Timeout" + timeout);
        System.out.println("Currencies:" + supportedCurrencies);
        System.out.println("Amount:" + amount + " paid.");
    }
}
