package com.codewithmosh.store;

import com.codewithmosh.store.notification.SMSNotificationService;
import com.codewithmosh.store.registration.User;
import com.codewithmosh.store.registration.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var userService = context.getBean(UserService.class);
		userService.registerUser(new User(1L, "peter@gmx.de", "qwerty", "peter"));
		//throw Exception
		userService.registerUser(new User(1L, "peter@gmx.de", "qwerty", "peter"));
	}

}
