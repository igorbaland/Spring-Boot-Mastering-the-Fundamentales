package com.codewithmosh.store.di_memory_refresh.notification;

import org.springframework.stereotype.Service;

@Service()
public class SMSNotificationService implements NotificationService{
    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("SMS");
        System.out.println(message);
    }
}
