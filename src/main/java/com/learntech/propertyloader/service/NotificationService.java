package com.learntech.propertyloader.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Uthiraraj Saminathan
 *
 */
@Service
public class NotificationService {
	
	private static final Logger logger = LoggerFactory.getLogger(NotificationService.class);
	
	@Value("${notification.sendTo}")
	private String sendTo;
	
	@Value("${notification.subject}")
	private String subject;
	
	@Value("${notification.body}")
	private String body;
	
	
	public void sendNotification() {
		
		logger.info("*********Calling notification*************");
		logger.info("SendTo :"+sendTo);
		logger.info("subject :"+subject);
		logger.info("body :"+body);
	}

}
