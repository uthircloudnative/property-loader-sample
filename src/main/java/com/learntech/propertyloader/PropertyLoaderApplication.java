package com.learntech.propertyloader;

import javax.activation.CommandObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learntech.propertyloader.service.NotificationService;

@SpringBootApplication
public class PropertyLoaderApplication implements CommandLineRunner{

	@Autowired
	private NotificationService notificationService;
	
	public static void main(String[] args) {
		SpringApplication.run(PropertyLoaderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		notificationService.sendNotification();
	}
	
	

}
