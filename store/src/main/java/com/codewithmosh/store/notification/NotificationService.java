package com.codewithmosh.store.notification;

public interface NotificationService {
    void send(String message, String recipientEmail);
}
