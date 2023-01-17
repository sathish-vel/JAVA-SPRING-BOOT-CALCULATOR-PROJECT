package com.springproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.springproject.email.sender.service.EmailSenderService;

@SpringBootApplication
public class SpringEmailProjectApplication {

	@Autowired
	EmailSenderService senderservice;

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailProjectApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void trigger() {
		senderservice.mailsender("kaviyamurugan282004@gmail.com", "This Message Was Sent By Spring boot Application.. ",
				"Hello! How are you? iam Sending this msg via Spring boot Application.... "
				);
	}
}
